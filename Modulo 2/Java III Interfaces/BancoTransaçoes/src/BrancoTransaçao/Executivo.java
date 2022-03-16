package BrancoTransaçao;

public class Executivo implements Deposito, Transferencia{
    @Override
    public void depositar() {
        System.out.println("Fazendo deposito");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Transação realizada com sucesso");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Houve um erro na transação");
    }

    @Override
    public void transferir() {
        System.out.println("Fazendo transferencia");
    }
}
