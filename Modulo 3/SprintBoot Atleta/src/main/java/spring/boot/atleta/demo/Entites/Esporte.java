package spring.boot.atleta.demo.Entites;

import java.util.List;

public class Esporte {
   private String nomeEsporte;
   private String nivelEsporte;

    public Esporte(){

    }

    public Esporte(String nomeEsporte, String nivelEsporte) {
        this.nomeEsporte = nomeEsporte;
        this.nivelEsporte = nivelEsporte;
    }

    public String getNomeEsporte() {
        return nomeEsporte;
    }

    public void setNomeEsporte(String nomeEsporte) {
        this.nomeEsporte = nomeEsporte;
    }

    public String getNivelEsporte() {
        return nivelEsporte;
    }

    public void setNivelEsporte(String nivelEsporte) {
        this.nivelEsporte = nivelEsporte;
    }

}
