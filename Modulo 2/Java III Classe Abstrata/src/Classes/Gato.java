package Classes;

import Interface.Comer;

public class Gato extends Animal implements Comer {

    public Gato() {
    }

    @Override
    public void EmitirBarulho() {
        System.out.printf("O som que o gato faz é Maiu");
    }

    @Override
    public void comer() {
        System.out.println("Gato comendo carne");
    }
}
