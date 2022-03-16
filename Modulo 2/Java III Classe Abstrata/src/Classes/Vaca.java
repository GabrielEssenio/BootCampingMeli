package Classes;

import Interface.Comer;

public class Vaca extends Animal implements Comer {

    public Vaca() {
    }

    @Override
    public void EmitirBarulho() {
        System.out.printf("O som que o gato faz é Muuu");
    }

    @Override
    public void comer() {
        System.out.println("Vaca comendo Pasto");
    }
}
