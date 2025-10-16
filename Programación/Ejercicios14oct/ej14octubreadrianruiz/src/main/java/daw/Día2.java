package daw;

import java.util.Scanner;

public class Día2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int pisos;
        int espacios;

        // Solicitar al usuario la cantidad de pisos
        do {
            System.out.print("Ingrese el número de pisos (1 a 10): ");
            pisos = teclado.nextInt();
        } while (pisos < 1 || pisos > 10);

        // Generar la pirámide
        for (int piramide = 1; piramide <= pisos; piramide++) {
            for (int piramide2 = 1; piramide2 <= piramide; piramide2++) {
                System.out.print(piramide);
            }
            System.out.println(); // Salto de línea para el siguiente piso
        }

        teclado.close();
    }
}
