
package utils;

import java.util.Scanner;


public class Leer {
    public static Scanner teclado = new Scanner(System.in);
    public static String cadena(){
        //nextline()--> Leer Cadena
        return teclado.nextLine();
    }
    public static int entero(){
        return Integer.valueOf(cadena());
    }
    public static double decimal(){
        return Double.valueOf(cadena());
    }
    public static char caracter(){
        return cadena().charAt(0);
    }
}
