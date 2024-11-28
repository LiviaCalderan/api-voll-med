package med.voll.api.domain.medico;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest //anotacao p/ teste repository
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//para utilizar o banco de dados da aplicacao, nao o de memoria
@ActiveProfiles("test") //banco de dados p/ os testes
class MedicoRepositoryTest {

    @Test
    void escolherMedicoAleatorioLivreNaData() {

    }
}