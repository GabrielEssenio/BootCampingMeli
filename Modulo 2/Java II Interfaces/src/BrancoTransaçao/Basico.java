package BrancoTransaçao;

public class Basico implements ConsultaSaldo, PagamentoServicos, SaqueDinheiro {
    @Override
    public void consultarSaldo() {
        System.out.println("Consutando saldo");
    }

    @Override
    public void pagamentoServicos() {
        System.out.println("Pagando Servicos");
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
