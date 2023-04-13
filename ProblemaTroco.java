import java.util.ArrayList;

public class ProblemaTroco{
    public static void main(String args[]){
        double valor = 1.51;
    
        System.out.println(troco(valor));
        
    
    }


    public static ArrayList<String> troco(double x){
        ArrayList<String> Lista = new ArrayList<>();
        int[] moedas = {100, 25, 10, 5, 1};
        int cont= 0;

        int v = (int)(x*100);
        int aux = v;

        for(int i = 0; i<moedas.length; i++){
            aux = v/moedas[i];
            v = v%moedas[i];
            Lista.add("\n Moedas de " + moedas[i] + "c : " + aux);
            cont ++;
        }

        System.out.println("Contador de Iterações: " + cont);

        return Lista;
    }

}