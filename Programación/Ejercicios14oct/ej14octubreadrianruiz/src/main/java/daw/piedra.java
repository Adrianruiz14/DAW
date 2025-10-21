package daw;

import java.util.Random;

import javax.swing.JOptionPane;

public class piedra {

    public static void main(String[] args) {

        String texto = """
                Indica con qué vas a jugar:
                1 Piedra
                2 Papel
                3 Tijera
                """;

        int eleccion = 0;
        int eleccionrandom = 0;

        do {

            do {

                try {
                    eleccion = Integer.parseInt(JOptionPane.showInputDialog(texto));

                } catch (NumberFormatException nfe) {
                    System.out.println("No es un número, elige solo entre 1-2-3");
                }

                if (eleccion == 1) {
                    System.out.println("Elegiste la piedra");
                }
                if (eleccion == 2) {
                    System.out.println("Elegiste el papel");
                }
                if (eleccion == 3) {
                    System.out.println("Elegiste la tijera ");

                }

            } while (eleccion > 3 || eleccion < 0);

            Random rand = new Random();
            eleccionrandom = rand.nextInt(3);

            if (eleccionrandom == 1) {
                System.out.println("Tu rival escogió la piedra");
            }
            if (eleccionrandom == 2) {
                System.out.println("Tu rival escogió el papel");
            }
            if (eleccionrandom == 3) {
                System.out.println("Tu rival escogió la tijera ");
            }

            if (eleccionrandom == eleccion) {
                System.out.println("Empate");
            }
            if (eleccion == eleccionrandom) {
                System.out.println("Empate");
            }

            if (eleccionrandom == 2 && eleccion == 1) {
                System.out.println("Gana la maquina");

            }
            if (eleccionrandom == 1 && eleccion == 2) {
                System.out.println("Ganas tú");

            }
            if (eleccionrandom == 3 && eleccion == 1) {
                System.out.println("Ganas tú");

            }
            if (eleccionrandom == 1 && eleccion == 3) {
                System.out.println("Gana la maquina");

            }
            if (eleccionrandom == 2 && eleccion == 3) {
                System.out.println("Ganas tú");

            }
            if (eleccionrandom == 3 && eleccion == 2) {
                System.out.println("Gana la maquina");

            }

        } while (eleccionrandom == eleccion || eleccion == eleccionrandom);

    }
}
