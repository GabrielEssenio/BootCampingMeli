package sprint.boot.calcula.idade.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sprint.boot.calcula.idade.demo.Utils.CalculaIdade;

import java.time.LocalDate;
import java.time.Period;

@RestController
public class IdadePessoa {
    @GetMapping("/{dia}/{mes}/{ano}")
    public ResponseEntity<Integer> IdadePessoa(@PathVariable int dia, @PathVariable int mes, @PathVariable int ano){
        LocalDate dataAtual = LocalDate.now();
        LocalDate nascimento = LocalDate.of(ano,mes,dia);
        int idade = CalculaIdade.Idade(nascimento, dataAtual);
        return ResponseEntity.ok(idade);
    }
}
