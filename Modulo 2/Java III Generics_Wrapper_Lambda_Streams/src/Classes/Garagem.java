package Classes;

import java.util.ArrayList;
import java.util.List;

public class Garagem {
    private int id;
    private List<Veiculo> listVeiculos = new ArrayList<>();

    public Garagem(int id, List<Veiculo> listVeiculos) {
        this.id = id;
        this.listVeiculos = listVeiculos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Veiculo> getListVeiculos() {
        return listVeiculos;
    }

    public void setListVeiculos(List<Veiculo> listVeiculos) {
        this.listVeiculos = listVeiculos;
    }
}
