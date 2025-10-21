package daw;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RANDOM {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int J1 = 0;

        // PARES NONES
        /*
         * 2 JUGADORES
         * SE PREGUNTA A J1 SI QUIERES PARES O NONES?
         * EL J2 ES LO CONTRARIO
         * EN CADA RONDA, SE SACAN LSO DEDOS ALEATORIAMETNE ENTRE 1 Y 10
         * SE DECIDE QUEIEN GANA ESA RONDA
         * SE JUEGAN 3 RONDAS
         * AL FINALZIAR INDICAR EL MEJOR DE LAS 3 RONDAS
         * ¿SI GANO 2 SEGUIDAS, HAGO LA TERCERA? No, paramos el juego
         */

        // Preguntad jugadores:

        do {

            try {

                System.out.println("Introduce 1-2, para ir pares(1), para ir impares(2)");
                J1 = teclado.nextInt();

                if (J1 == 1) {
                    System.out.println("J1, vas a pares");
                    System.out.println("J2, vas a impares");
                }
                if (J1 == 2) {
                    System.out.println("J1, vas a impares");
                    System.out.println("J2, vas a pares");
                }

            } catch (InputMismatchException ime) {
                teclado.nextLine();
                System.out.println("Pon un maldito numero");

            }

        } while (J1 != 1 && J1 != 2);

        // Obtener aleatorio

        Random rand = new Random();
        int numeroJ1 = rand.nextInt(10);
        int numeroJ2 = rand.nextInt(10);
        int suma = numeroJ1 + numeroJ2;
        System.out.println("El jugador 1 ha sacado el numero " + numeroJ1);
        System.out.println("El jugador 2 ha sacado el numero " + numeroJ2);
        if (suma % 2 == 0) {
            System.out.println("J1 gana");
        } else {
            System.out.println("J2 gana");
        }

        teclado.close();

    }

}
