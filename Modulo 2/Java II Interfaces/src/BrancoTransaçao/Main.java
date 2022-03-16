package BrancoTransaçao;

public class Main {
    public static void main(String[] args) {
        System.out.print("Colaborador:");
        Colaborador colaborador = new Colaborador();

        System.out.print("Consultar Saldo:");

        colaborador.consultarSaldo();
        colaborador.transacaoOk();

        System.out.print("Sacar Dinheiro:");
        colaborador.sacarDinheiro();
        colaborador.transacaoNaoOk();

        System.out.println("Executivo:");
        Executivo executivo = new Executivo();

        System.out.println("Depositar Dinheiro");
        executivo.depositar();
        executivo.transacaoOk();

        System.out.println("Transferir Dinheiro");
        executivo.transferir();
        executivo.transacaoNaoOk();

        System.out.println("Basico");
        Basico basico = new Basico();

        System.out.println("Consulta Saldo: ");
        basico.consultarSaldo();
        basico.transacaoOk();

        System.out.println("Paga Serviços");
        basico.pagamentoServicos();
        basico.transacaoNaoOk();

        System.out.println("Saca Dinheiro");
        basico.sacarDinheiro();
        basico.transacaoOk();



    }
}
