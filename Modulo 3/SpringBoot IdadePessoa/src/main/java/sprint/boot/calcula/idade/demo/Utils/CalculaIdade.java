package sprint.boot.calcula.idade.demo.Utils;

import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.time.Period;

public class CalculaIdade {
    public static int Idade(LocalDate dataNascimento, LocalDate dataAtual){
        if(dataNascimento != null){
        return Period.between(dataNascimento, dataAtual).getYears();
        }
        return -1;
    }
}
