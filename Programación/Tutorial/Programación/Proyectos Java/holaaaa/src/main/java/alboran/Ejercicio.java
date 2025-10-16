package alboran;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        //Lectura con la clase Scanner
        //Instaciamos un objeto de tipo Scanner usando como parámetro la entrada estándar del sistema
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        // Inicializa una variable para guardar el dato que introduce el usuario por teclado
        int edad = teclado.nextInt();
        System.out.println("Tu edad es " + edad);
        //Después de leer números con Scanner hay que limpiar la memoria intermedia si vamos a leer textos
        System.out.println("Introduce tu nombre");
        teclado.nextLine();
        String nombre = teclado.nextLine();
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Muchas gracias");

        

        teclado.close();


       
        
    }

}
