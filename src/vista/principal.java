
package vista;
//Autor : Tamayo Joseph

import utils.Leer;

public class principal {
    //METODOS
    public static void parimpar(){
     System.out.println("***PAR O IMPAR***");
        int numero;
        System.out.print("Edad: ");
        numero = Leer.entero();
        if(numero%2==0){
            System.out.println("Es par");
        }else if(numero == 0){
            System.out.println("Es neutro");
        }else{
            System.out.println("Es impar");
        }  
    }
    public static void primo(){
        System.out.println("*** NUMERO´PRIMO ***");
        System.out.print("Numero:");
        int numero = Leer.entero();
        int cont = 0;
        for (int i = 1; i <= numero; i++) {
            if(numero % i == 0){
                cont ++;
            }      
        }
        if(cont == 2){
            System.out.println("El numero es PRIMO");
        }else{
            System.out.println("El numero NO es primo");
        }
    }
    public static void mayordeedad(){
        System.out.println("***MAYOR DE EDAD***");
        int edad;
        System.out.print("Edad: ");
        edad = Leer.entero();
        if(edad>=18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
    public static void factorial(){
        System.out.println("***FACTORIAL***");
        System.out.print("Ingrese numero: ");
        int numero = Leer.entero();
        int fac = 1;
        for (int i = 1; i <= numero; i++) {
            fac *= i;
        }
        System.out.println("Factorial= "+fac); //Ejemplo: 5! = 120
    }
    public static void error(){
        System.out.println("Error-Opcion Incorrecta");
    }
    public static void salir(){
        System.out.println("Gracias por visitarnos...");
    }
    public static void menu(){
        System.out.println("Menu Principal");
        System.out.println("1.Factorial");
        System.out.println("2.Mayor de Edad");
        System.out.println("3.Par o Impar");
        System.out.println("4.Primo");;
        System.out.println("5.Salir");
        System.out.print("Ingrese opcion[1-5]: ");
        
    }
    public static void inicio(){
       int opcion;
       do{
           menu();
           opcion = Leer.entero();
           switch(opcion){
               case 1: factorial();
               break;
               case 2: mayordeedad();
               break;
               case 3: parimpar();
               break;
               case 4: primo();
               break;
               case 5: salir();
               break;
               default: error();
               break;
           }
       }while(opcion!=5);
    }
    //METODO PRINCIPAL
    public static void main(String[] args) {
        inicio();
    }
    
    
}
