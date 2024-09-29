package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank //somente para campos string
        String nome,
        @NotBlank @Email
        String email,
        @NotBlank @Pattern(regexp = "\\d{4,6}") //expressao regular
        String crm,
        @NotNull
        Especialidade especialidade,
        @NotNull @Valid //validar o outro objeto - endereco
        DadosEndereco endereco) {
}
