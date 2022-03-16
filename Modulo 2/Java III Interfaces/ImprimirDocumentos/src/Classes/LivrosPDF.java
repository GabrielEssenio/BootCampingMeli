package Classes;

import Interface.Imprimir;

public class LivrosPDF implements Imprimir {
    private int numbPag;
    private String autor;
    private String titulo;
    private String genero;

    public LivrosPDF(int numbPag, String autor, String titulo, String genero) {
        this.numbPag = numbPag;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public void imprimir() {
        System.out.printf("%d %s %s %s", numbPag, autor, titulo, genero);
    }
}
