public class PraticaExcecoes {

    public static void main(String[] args) {
        divisao();
    }

    public static void divisao() {
            int a = 0;
            int b = 200;
        try {
            int c = b / a;
            System.out.println(c);
            }
            catch(ArithmeticException e) {
                System.out.println("Não pode ser dividido por zero");
                System.out.println(e.getMessage());
        } finally {
            System.out.println("Programa Finalizado");
        }
    }

}
