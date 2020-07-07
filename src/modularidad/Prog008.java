
package modularidad;

// Autor : Tamayo Joseph
public class Prog008 {
    //Metodos que reciben parametros
    public static void saludo(String nombre){
        System.out.println("Bienvenido "+nombre);
        System.out.println("Disfruta tu estadia en este lugar");
    }
    public static void saludo2(String nombre, String carrera){
        System.out.println("Bienvenido "+nombre);
        System.out.println("Disfruta tu estadia en la carrera "+carrera);
    }
    public static void Factorial(int numero){
        int fact = 1;
        for(int i=1;i<=numero;i++){
            fact *= i;
        }
        System.out.println("Factorial: "+fact);
    }
    public static void main(String[] args) {
        saludo("Daniel");
        saludo2("Juan","Ing. Sistemas");
        Factorial(5);
    }
}
