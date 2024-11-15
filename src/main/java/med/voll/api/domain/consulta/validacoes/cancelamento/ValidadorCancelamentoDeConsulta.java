package med.voll.api.domain.consulta.validacoes.cancelamento;

import med.voll.api.domain.consulta.DadosCancelamentoDeConsulta;

public interface ValidadorCancelamentoDeConsulta {

    void validar(DadosCancelamentoDeConsulta dados);
}
