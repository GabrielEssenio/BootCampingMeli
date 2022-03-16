package BrancoTransaçao;

public interface Transacao {

      default void transacaoOk(){
    }
     default void transacaoNaoOk(){
    }
}
