
package modularidad;

//Autor: Tamayo Joseph
//
public class Prog010 {
     public static int Factorial(int num){
       int fac = 1;
         for (int i = 1; i <= num; i++) {
             fac *= i;
         }
         return fac;
     }
    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }
}
