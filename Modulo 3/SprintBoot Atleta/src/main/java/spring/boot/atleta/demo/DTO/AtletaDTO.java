package spring.boot.atleta.demo.DTO;

import spring.boot.atleta.demo.Entites.Esporte;
import spring.boot.atleta.demo.Entites.Pessoa;

import java.io.Serializable;
import java.util.List;

public class AtletaDTO implements Serializable {
    private String fullName;
    private int idade;

    private String nomeEsporte;
    private String nivelEsporte;

    private List<Esporte> listaEsportes;


    public List<Esporte> getListaEsportes() {
        return listaEsportes;
    }

    public void setListaEsportes(List<Esporte> listaEsportes) {
        this.listaEsportes = listaEsportes;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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
