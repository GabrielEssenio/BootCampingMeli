package spring.boot.atleta.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.atleta.demo.DTO.AtletaDTO;
import spring.boot.atleta.demo.Entites.Esporte;
import spring.boot.atleta.demo.Entites.ListaEsportes;
import spring.boot.atleta.demo.Entites.Pessoa;

import java.util.Arrays;

@RestController
public class ExercicioController {


    @GetMapping("findEsports")
    public AtletaDTO isAtleta(){


        ListaEsportes listaEsportes = new ListaEsportes(Arrays.asList(
                (new Esporte("Basquete", "Basico")),
                (new Esporte("Futebol", "Avancado")),
                (new Esporte("Volei", "Intermediario")),
                (new Esporte("Tenis", "Avancado")),
                (new Esporte("Natacao", "Basico")),
                (new Esporte("Corrida", "Avancado")),
                (new Esporte("Badminton", "Intermediario"))
        ));

        AtletaDTO atletaDTO = new AtletaDTO();
        atletaDTO.setListaEsportes(listaEsportes.getListaEsportes());

        return atletaDTO;
    }


    @GetMapping("Atleta/{nome}/{sobreNome}/{idade}")
    public AtletaDTO isAtleta(@PathVariable String nome, @PathVariable String sobreNome, @PathVariable int idade){

        Pessoa pessoa = new Pessoa(nome, sobreNome, idade);

        ListaEsportes listaEsportes = new ListaEsportes(Arrays.asList(
            (new Esporte("Basquete", "Basico")),
            (new Esporte("Futebol", "Avancado")),
            (new Esporte("Volei", "Intermediario")),
            (new Esporte("Tenis", "Avancado")),
            (new Esporte("Natacao", "Basico")),
            (new Esporte("Corrida", "Avancado")),
            (new Esporte("Badminton", "Intermediario"))
        ));

        AtletaDTO atletaDTO = new AtletaDTO();
        atletaDTO.setFullName(pessoa.getNome() + " " + pessoa.getSobreNome());
        atletaDTO.setIdade(pessoa.getIdade());
        atletaDTO.setListaEsportes(listaEsportes.getListaEsportes());

        return atletaDTO;
    }

}
