package Classes;

import Interface.Imprimir;

public class Relatorios implements Imprimir {
    private String text;
    private int numbPages;
    private String autor;
    private String revisor;

    public Relatorios(String text, int numbPages, String autor, String revisor) {
        this.text = text;
        this.numbPages = numbPages;
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public void imprimir() {
        System.out.printf("%s %d %s %s",text , numbPages, autor , revisor);
    }
}
