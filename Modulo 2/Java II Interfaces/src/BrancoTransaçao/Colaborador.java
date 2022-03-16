package BrancoTransaçao;

public class Colaborador implements SaqueDinheiro , ConsultaSaldo{
    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo foi consultado");
    }

    @Override
    public void sacarDinheiro() {
        System.out.println("Sacando dinheiro");

    }

    @Override
    public void transacaoOk() {
        System.out.println("Transação realizada com sucesso");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Houve um erro na transação");

    }
}
