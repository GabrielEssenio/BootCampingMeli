package CorridaSelva;

public class Participante {

    private String RG;
    private String nome;
    private int idade;
    private int celular;
    private int numEmergencia;

    public Participante() {
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getNumEmergencia() {
        return numEmergencia;
    }

    public void setNumEmergencia(int numEmergencia) {
        this.numEmergencia = numEmergencia;
    }
}
