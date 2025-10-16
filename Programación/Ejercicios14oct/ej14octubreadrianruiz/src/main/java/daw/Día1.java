package daw;

import java.util.Scanner;

public class Día1 {
    public static void main(String[] args) {

        // Tenemos que tener las tablas de multiplicar impresas
        // for?
        // for (el inicio; la condición; actualización) {Codigo a ejecutar en cada
        // interacción}
        // Se usa cuando saebmos el número de iteraciones a realizar

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = teclado.nextInt();

        for (int pos = 1; pos <= 10; pos++) { 
            int tabla = num * pos; 
            System.out.println("El resultado de " + num + " x " + pos + " = " + tabla);
        }

        teclado.close();
    }
}
