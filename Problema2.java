import java.util.ArrayList;
import java.util.List;

public class Problema2 {
    
    public static List<Integer> SDM_guloso(int[] s, int[] f) {
        List<Integer> X = new ArrayList<>();
        int n = s.length;
        int i = 0;
        int count = 0;
        for (int k = 1; k < n; k++) {
            count++;
            if (s[k] >= f[i]) {
                X.add(k);
                i = k;
            }
        }
        System.out.println("Número de iterações: " + count);
        return X;
    }


    public static void main(String[] args) {
        // exemplo de uso
        int[] s = {0, 4, 6, 13, 4, 2, 6, 7, 9, 1, 3, 9};
        int[] f = {0, 8, 7, 14, 5, 4, 9, 10, 11, 6, 13, 12};
        List<Integer> X = SDM_guloso(s, f);
        System.out.println("SDM Guloso: " + X.toString() + "\n");
        
        // outro exemplo de uso
        int[] s2 = {0, 1, 3, 0, 5, 8, 5};
        int[] f2 = {0, 4, 5, 6, 7, 9, 9};
        List<Integer> X2 = SDM_guloso(s2, f2);
        System.out.println("SDM Guloso: " + X2.toString());
    }

}
