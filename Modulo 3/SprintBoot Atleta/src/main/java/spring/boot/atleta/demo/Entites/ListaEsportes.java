package spring.boot.atleta.demo.Entites;

import java.util.List;

public class ListaEsportes {
    List<Esporte> listaEsportes;

    public ListaEsportes(List<Esporte> listaEsportes) {
        this.listaEsportes = listaEsportes;
    }

    public List<Esporte> getListaEsportes() {
        return listaEsportes;
    }

    public void setListaEsportes(List<Esporte> listaEsportes) {
        this.listaEsportes = listaEsportes;
    }
}
