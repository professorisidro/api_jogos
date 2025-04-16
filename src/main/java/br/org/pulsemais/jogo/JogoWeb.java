import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class JogoWeb{

    private JogoBD bancoDados;

    public JogoWeb(JogoBD bancoDados){
        this.bancoDados = bancoDados;
    }

    // metodo 1 - para cadastrar
    @PostMapping("/jogos")
    public Jogo cadastrar(@RequestBody Jogo novoJogo){
        return bancoDados.save(novoJogo);
    }

    @GetMapping("/jogos")
    public List<Jogo> recuperarTodos(){
        return bancoDados.findAll();
    }

}