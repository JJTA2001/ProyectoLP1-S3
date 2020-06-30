
package estructuras;

import com.sun.org.apache.xerces.internal.impl.Constants;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;

public class Prog03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("****MANEJO DE CADENAS ****");
        System.out.print("Leer cadenas con nextline: ");
        cadena = teclado.nextLine();
        System.out.println("Valor inicial ingresado es: "+ cadena);
        System.out.println("Mayuscula con toUpperCase(): " +cadena.toUpperCase());
        System.out.println("Minusculas con toLowerCase(): " +cadena.toLowerCase());
        System.out.println("Eliminar los espacios con trim: "+cadena.trim());
        System.out.println("Subcadena con substring(int): "+cadena.substring(5));
        System.out.println("Subcadena con substring(int,int): "+cadena.substring(5, 10));
        System.out.println("Tamaño de la cadena lenght()"+cadena.length());
        System.out.println("Extraer letra de una posicion: "+cadena.charAt(1));
    }
}
