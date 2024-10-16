package med.voll.api.domain.medico;

public record DadosListagemMedico(
        Long id,
        String nome,
        String email,
        String crm,
        Especialidade especialidade
) {
    public DadosListagemMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}

//Esse código está "extraindo" as informações de um objeto Medico usando os métodos getNome(),
// getEmail(), getCrm(), e getEspecialidade() e passando essas informações para o construtor do DadosListagemMedico.
//É uma maneira de converter a entidade Medico para um DTO (Data Transfer Object),
// que é utilizado para transferir apenas os dados necessários, por exemplo, para exibir numa lista.