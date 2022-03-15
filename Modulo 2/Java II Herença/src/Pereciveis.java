import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Pereciveis extends Produtos {

    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }


    @Override
    public double calcular(int quantidadeDeProdutos) {
        double descontoVencer = 1;

        if (diasParaVencer < 2) {
            descontoVencer = getPreco() / 4;
        }
        if (diasParaVencer < 3) {
            descontoVencer = getPreco() / 3;
        }
        if (diasParaVencer < 4) {
            descontoVencer = getPreco() / 2;
        }
        double result = (descontoVencer * quantidadeDeProdutos);
        return (result*100)/100 ;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Pereciveis" +
                "diasParaVencer=" + diasParaVencer + "\n" +
                "no valor de: ";

    }
}
