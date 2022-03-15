public class NaoPericiveis extends Produtos{
    private String tipo;

    public NaoPericiveis(String tipo, String nome, double preco) {
        super(nome,preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "NaoPericiveis" +
                "tipo='" + tipo + '\n' +
                "no valor de: ";
    }
}
