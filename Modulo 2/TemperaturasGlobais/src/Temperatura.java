public class Temperatura {
    public static void main(String[] args) {
        String cidades[] ={"Londres", "Madrid", "Nueva York","Buenos Aires","Asunción", "São Paulo","Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int temperatura[][] ={{-2,33},{-3,32}, {-8,27}, {4,37}, {6,42}, {5,43}, {0,39},{-7,26}, {-1,31}, {-10,35}};
        int maiorTemp = temperatura[0][0];
        int menorTemp = temperatura[0][0];
        String cidadeMenorTemp = "";
        String cidadeMaiorTemp = "";


        for (int i=0; i< cidades.length; i++){
            for(int j=0; j< temperatura[0].length; j++){
                if(temperatura[i][j] > maiorTemp){
                    maiorTemp = temperatura[i][j];
                    cidadeMaiorTemp = cidades[i];
                }
                if(temperatura[i][j] < menorTemp){
                    menorTemp = temperatura[i][j];
                    cidadeMenorTemp = cidades[i];
                }
            }
        }
        System.out.printf("A cidade que teve a maior temperatura foi %s no valor de %d °C ", cidadeMaiorTemp, maiorTemp);
        System.out.println("");
        System.out.printf("A cidade que teve a menor temperatura foi %s no valor de %d °C ", cidadeMenorTemp, menorTemp);
    }
}
