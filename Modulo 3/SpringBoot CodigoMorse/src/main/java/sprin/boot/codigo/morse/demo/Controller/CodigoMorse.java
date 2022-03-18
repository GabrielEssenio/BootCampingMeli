package sprin.boot.codigo.morse.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sprin.boot.codigo.morse.demo.Util.Decodificando;

@RestController
public class CodigoMorse {



    @GetMapping("CodigoMorse/{morseCode}")
    public ResponseEntity<String> Decodificando(@PathVariable String morseCode)
    {

        String[] code
                = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", "|" };

        String texto = Decodificando.morseToEnglish(code, morseCode);
        return ResponseEntity.ok().body(texto);

    }

    @GetMapping("PhraseMorse/{Phrase}")
    public ResponseEntity<String> Codificando(@PathVariable String Phrase){

        String[] code
                = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", "|" };

        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4',
                '5', '6', '7', '8', '9', '0' };

        String morseCode = Decodificando.englishToMorse(code, Phrase, letter);
        return ResponseEntity.ok().body(morseCode);
    }
}
