public class Main {

    public static void main(String[] args) {
        Pereciveis pereciveis = new Pereciveis("Arroz", 4.9, 1);
        NaoPericiveis naoPereciveis = new NaoPericiveis("Enlatado", "Palmito", 13.7);
        System.out.println(pereciveis);
        System.out.println(pereciveis.calcular(1));

        System.out.println(naoPereciveis);
        System.out.println(naoPereciveis.calcular(1));
    }

}
