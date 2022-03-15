import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pereciveis pereciveis = new Pereciveis("Arroz", 4.9, 1);
        NaoPericiveis naoPereciveis = new NaoPericiveis("Enlatado", "Palmito", 13.7);
        System.out.println(pereciveis);
        System.out.println(pereciveis.calcular(1));

        System.out.println(naoPereciveis);
        System.out.println(naoPereciveis.calcular(1));

        NaoPericiveis produtoNP1 = new NaoPericiveis("Enlatado", "Palmito", 13.7);
        NaoPericiveis produtoNP2 = new NaoPericiveis("Enlatado", "Azeitona", 6.7);
        NaoPericiveis produtoNP3 = new NaoPericiveis("Enlatado", "Milho", 4.7);
        NaoPericiveis produtoNP4 = new NaoPericiveis("Enlatado", "Cogumelo", 15.7);
        NaoPericiveis produtoNP5 = new NaoPericiveis("Tempero", "Paprica Picante", 13.7);


        ArrayList<Produtos> pacoteProdutos = new ArrayList<>();
        pacoteProdutos.add(produtoNP1);
        pacoteProdutos.add(produtoNP2);
        pacoteProdutos.add(produtoNP3);
        pacoteProdutos.add(produtoNP4);
        pacoteProdutos.add(produtoNP5);

        for(Produtos prod : pacoteProdutos){
            System.out.println(prod);
            System.out.println(prod.calcular(1));
        };
    }

}
