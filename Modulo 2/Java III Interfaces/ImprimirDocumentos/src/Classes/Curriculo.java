package Classes;

import Interface.Imprimir;

import java.util.List;

public class Curriculo implements Imprimir {

    private List<String> atributos;
    private List<String> habilidades;

    public Curriculo(List<String> atributos, List<String> habilidades) {
        this.atributos = atributos;
        this.habilidades = habilidades;
    }

    @Override
    public void imprimir() {
        System.out.println("Atributos: ");
        atributos.forEach(System.out::println);
        System.out.println("Habilidades: ");
        habilidades.forEach(System.out::println);
    }
}
