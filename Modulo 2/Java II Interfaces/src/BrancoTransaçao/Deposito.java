package BrancoTransaçao;

public interface Deposito extends Transacao{

    default void depositar(){
        System.out.println("Voce realizou um deposito");
    }
}
