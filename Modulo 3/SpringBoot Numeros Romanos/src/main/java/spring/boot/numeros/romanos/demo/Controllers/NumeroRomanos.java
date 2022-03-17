package spring.boot.numeros.romanos.demo.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumeroRomanos {

    @GetMapping("/NumeroRomano/{numeroInteiro}")
    public ResponseEntity<String> TransformaNumerosRomanos(@PathVariable Integer numeroInteiro){

        int[] vaNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] vaRom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            int numeroAlgarismo = numeroInteiro;
            int i = 0;
            StringBuilder numeroRomano = new StringBuilder();
            while (numeroInteiro > 0) {
                if (numeroInteiro >= vaNum[i]) {
                    numeroInteiro -= vaNum[i];
                    numeroRomano.append(vaRom[i]);
                } else {
                    i++;
                }
            }
            String result = String.format("O %d em numeros romanos fica assim: %s", numeroAlgarismo, numeroRomano);
            return ResponseEntity.ok().body(result);
    }
}
// Link utilizado na aplicacao https://pt.stackoverflow.com/questions/247563/converter-números-romanos-em-java