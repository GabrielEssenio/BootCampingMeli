public class Pessoa {
    private String nome;
    private int idade;
    private String ID;
    private double peso;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Pessoa(){

    }

    public Pessoa(String nome, int idade, String ID){
        this.nome = nome;
        this.idade = idade;
        this. ID = ID;
    }

    public Pessoa(String nome, int idade, String ID, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC(float peso, double altura){
        return peso/(java.lang.Math.pow(altura,2));
    }

    public boolean ehMaioridade(int idade){
        return idade > 17;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", ID='" + ID + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
