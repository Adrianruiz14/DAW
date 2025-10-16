package t3aadrianruiz;

import java.util.Scanner;

public class Bucle {
    public static void main(String[] args) {
        // Toda las estructursa tienen 3 partes
        // Inicialización de la variable de control
        // Condición que usa la variable de control
        // Actualización de la variable de control

        // shile
        int variabbleCOntrol = 1; // Inicialización de la variable de control
        while (variabbleCOntrol <= 5) { // Condición que usa la variable de control
            // En la siuiente línea se hace el sout y luego se se hace el sout
            System.out.println("Iteración: " + (++variabbleCOntrol));
            // En la siguiente línea se hace el sout y luego se suma uno a la avariable de control
            System.out.println("Iteración: " + (variabbleCOntrol++));
            variabbleCOntrol++; // Actualización de la variable de control
            // Estas líneas son eqivalentes porque la variable de control
            // no influye en ninguna instrucción dentro del bucle

        }

        System.out.println("---------------");

        // do while es como el while pero siempre hace una iteración. 1 a n iteraciones
        int variableControl2 = 1; // Inicialización de la variable de control
        do {
            System.out.println("Iteración: " + variableControl2);
            variableControl2++; // Actualización de la variable de control
        } while (variableControl2 < 10);

        System.out.println("---------------");

        // Se usa cuando saebmos el número de iteraciones a realizar
        for (int variableControl3 = 1; variableControl3 < 10; variableControl3++) {
            System.out.println("Iteración: " + variableControl3);
        }

        // Escribe tu nombre hasta que el usuario introduzca un 0

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int numero = teclado.nextInt();

        while (numero != 0) {
            System.out.println("Adrián Ruiz");
            System.out.println("Introduzca un número");
            numero = teclado.nextInt();

        teclado.close();
         
        }
    }
}
