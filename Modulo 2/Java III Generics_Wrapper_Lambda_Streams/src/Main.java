import Classes.Garagem;
import Classes.Veiculo;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Garagem minhaGaragem = new Garagem(1, Arrays.asList(
                new Veiculo("Fiesta", "Ford", 1000),
                new Veiculo("Focus", "Ford", 1200),
                new Veiculo("Explorer", "Ford", 2500),
                new Veiculo("Uno", "Fiat", 500),
                new Veiculo("Cronos", "Fiat", 1000),
                new Veiculo("Torino", "Fiat", 1250),
                new Veiculo("Aveo", "Chevrolet", 1250),
                new Veiculo("Spin", "Chevrolet", 2500),
                new Veiculo("Corola", "Toyota", 1250),
                new Veiculo("Fortuner", "Toyota", 3000),
                new Veiculo("Logan", "Renault", 950)
        )
        );
        System.out.println("Imprimindo em ordem crescendo pelo preco do veiculo");
        minhaGaragem.getListVeiculos().sort(Comparator.comparing(x -> x.getPreco()));
        minhaGaragem.getListVeiculos().forEach(System.out::println);

        System.out.println();

        System.out.println("Imprimindo em ordem descrescente ");
        minhaGaragem.getListVeiculos().stream().sorted((a,b) -> b.getPreco() > a.getPreco() ? 1 : -1).forEach(System.out::println);
        System.out.println();

        System.out.println("Ordenando veiculos com preco acima de 1000 ou igual a 1000");
        List<Veiculo> garagemCara = minhaGaragem.getListVeiculos().stream().filter(x -> x.getPreco() >= 1000).collect(Collectors.toList());
        garagemCara.forEach(System.out::println);

        System.out.println();

        System.out.println("Ordenando veiculos com preco abaixo de 1000");
        List<Veiculo> garagemBarata = minhaGaragem.getListVeiculos().stream().filter(x -> x.getPreco() <= 1000).collect(Collectors.toList());
        garagemBarata.forEach(System.out::println);
    }
}
