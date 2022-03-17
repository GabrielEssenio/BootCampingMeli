package maven.api.rest.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Veiculos {
    @GetMapping("/Carros")
    public List<String> Carros(){
        return Arrays.asList("Onix", "Prisma", "HB20");
    }
}
