
package estructuras;

import java.util.Scanner;

public class Prog06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);    
        int N,S=0;
        System.out.print("N: ");
        N = Integer.valueOf(teclado.nextLine());
        for(int a=1; a<=N;a++){
            S += a;
        }
        System.out.println("La sumatoria es: "+S);
        teclado.close();
    }
           
           
}
