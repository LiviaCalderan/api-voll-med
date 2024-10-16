package med.voll.api.domain.medico;

import med.voll.api.domain.endereco.Endereco;

public record DadosDetalhamentoMedico(Long id, String nome, String email, String telefone, Especialidade especialidade, Endereco endereco, String crm) {

    public DadosDetalhamentoMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco(), medico.getCrm());
    }

}
