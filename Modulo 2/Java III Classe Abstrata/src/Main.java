import Classes.Cachorro;
import Classes.Gato;
import Classes.Vaca;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.EmitirBarulho();
        System.out.println();
        cachorro.comer();

        System.out.println();

        Gato gato = new Gato();
        gato.EmitirBarulho();
        System.out.println();
        gato.comer();

        System.out.println();

        Vaca vaca = new Vaca();
        vaca.EmitirBarulho();
        System.out.println();
        vaca.comer();
    }

}
