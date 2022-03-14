public class Main {

    public static void main(String[] args) {
        System.out.println(geraIMC());
    }

    public static String geraIMC(){
        Pessoa pessoa = new Pessoa();
        Pessoa guilherme = new Pessoa("Guilherme", 29, "290871", 70.0, 1.7);
//        System.out.print(guilherme.toString());
//        System.out.print(guilherme.ehMaioridade(guilherme.getIdade()));
        Boolean adulto = guilherme.ehMaioridade(guilherme.getIdade());
        double IMC = guilherme.calcularIMC((float) guilherme.getPeso(), guilherme.getAltura());
        System.out.println(IMC);
        String result = null;
        if (IMC < 20.0) {
            result = (guilherme.toString() + "\n" + "Voce esta abaixo do seu peso");
        } else if (IMC > 19 && IMC < 26) {
            result = (guilherme.toString() + "\n" + "Voce esta com seu peso saudável");
        } else if (IMC > 26) {
            result = (guilherme.toString() + "\n" + "Voce esta com sobrepeso");
        }
        return result;
    }


}
