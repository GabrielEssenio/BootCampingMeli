import Classes.Curriculo;
import Classes.LivrosPDF;
import Classes.Relatorios;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("RELATORIO: ");
        Relatorios relatorios = new Relatorios("Palavra",516 ,"Joao Autor", "Rafael Revisor");
        relatorios.imprimir();

        System.out.println();
        System.out.println("___________________________");

        System.out.println("LIVROS PDF: ");
        LivrosPDF livrosPDF = new LivrosPDF(450, "Pedro Autor", "O Poder do Habito", "Autoconhecimento");
        livrosPDF.imprimir();

        System.out.println();
        System.out.println("___________________________");

        System.out.println("CURRICULO: ");
        List<String> atributos = List.of("Resiliente","Proativo", "Comunicativo");
        List<String> habilidades = List.of("Java", "POO", "Spring");
        Curriculo curriculo = new Curriculo(atributos, habilidades);
        curriculo.imprimir();

    }
}
