package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.medico.DadosListagemMedico;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional //transacao ativa com o banco de dados
    public void cadastrarMedico(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }

    @GetMapping
    public List<DadosListagemMedico> ListarMedicos() {
        return repository.findAll()
                .stream()//stream permite processar elementos de uma coleção de maneira mais funcional
                .map(DadosListagemMedico::new)
                //para cada Medico na lista, você quer criar um novo objeto DadosListagemMedico
                //DadosListagemMedico::new é uma referência a um construtor, que significa que para cada Medico,
                // será criado um novo objeto do tipo DadosListagemMedico usando o construtor dele.
                .toList(); //converte o stream processado de volta em uma lista.
    }
}
