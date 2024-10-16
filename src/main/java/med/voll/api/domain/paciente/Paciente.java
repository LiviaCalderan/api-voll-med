package med.voll.api.domain.paciente;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.domain.endereco.Endereco;

@Table(name = "pacientes")
@Entity(name = "Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

    @Embedded
    private Endereco endereco;

    private Boolean ativo;

    public Paciente(DadosCadastroPaciente dadosPaciente) {
        this.ativo = true;
        this.nome = dadosPaciente.nome();
        this.email = dadosPaciente.email();
        this.telefone = dadosPaciente.telefone();
        this.cpf = dadosPaciente.cpf();
        this.endereco = new Endereco(dadosPaciente.endereco());
    }

    public void atualizarInformacoes(@Valid DadosAtualizacaoPaciente dadosPaciente) {
        if (dadosPaciente.nome() != null){
            this.nome = dadosPaciente.nome();
        }
        if (dadosPaciente.telefone() != null){
            this.telefone = dadosPaciente.telefone();
        }
        if (dadosPaciente.endereco() != null) {
            this.endereco.atualizarInformacoes(dadosPaciente.endereco());
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
