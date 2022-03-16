package Classes;

import Interface.Comer;

public class Cachorro extends Animal  implements Comer {

    public Cachorro() {
    }

    @Override
    public void EmitirBarulho() {
        System.out.printf("O som que o cachorro faz é Auau");

    }

    @Override
    public void comer() {
        System.out.println("Cachorro Comendo Carne");
    }
}
