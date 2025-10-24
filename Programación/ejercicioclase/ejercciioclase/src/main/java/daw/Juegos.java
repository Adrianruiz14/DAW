package daw;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Juegos {

    public static int Opciones() {   //PREGUNTAR AL PROFESOR INT OPCIONES, RETURN ELECCION

        int eleccion = 0;

        do {
            try {

                String texto = """
                    ¿Qué quieres hacer?
                    1. Pares o Nones
                    2. Piedra-Papel-Tijera
                    3. Salir
                    """;
           
            eleccion = Integer.parseInt(JOptionPane.showInputDialog(texto));

            } catch (NumberFormatException nfe) {
                            System.out.println("Pon un maldito numero"); 
                         } 

              }  while (!(eleccion > 0 )); return eleccion;
        
    }

    public static void parImpar(int memuero, int memuero2) {

        Scanner teclado = new Scanner(System.in);
        int J1 = 0;

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
        if (J1 == 1 && suma % 2 == 0) {
            System.out.println("J1 gana");
        }

        if (suma % 2 == 0) {
            if (J1 == 1) {
                System.out.println("J1 gana");
            } else {
                System.out.println("J2 gana");
            }
        } else {
            if (J1 == 2) {
                System.out.println("J1 gana");
            } else {
                System.out.println("J2 gana");
            }
        }

    }

    public static void PiedraPapel(int memato, int memato2) {

         String texto2 = """
                            Indica con qué vas a jugar:
                            1 Piedra
                            2 Papel
                            3 Tijera
                            """;

                    int eleccionp = 0;
                    int eleccionrandom = 0;

                    do {

                        do {

                            try {
                                eleccionp = Integer.parseInt(JOptionPane.showInputDialog(texto2));

                            } catch (NumberFormatException nfe) {
                                System.out.println("No es un número, elige solo entre 1-2-3");
                            }

                            if (eleccionp == 1) {
                                System.out.println("Elegiste la piedra");
                            }
                            if (eleccionp == 2) {
                                System.out.println("Elegiste el papel");
                            }
                            if (eleccionp == 3) {
                                System.out.println("Elegiste la tijera ");

                            }

                        } while (eleccionp > 3 || eleccionp < 0);

                        Random rand2 = new Random();
                        eleccionrandom = rand2.nextInt(3);

                        if (eleccionrandom == 1) {
                            System.out.println("Tu rival escogió la piedra");
                        }
                        if (eleccionrandom == 2) {
                            System.out.println("Tu rival escogió el papel");
                        }
                        if (eleccionrandom == 3) {
                            System.out.println("Tu rival escogió la tijera ");
                        }

                        if (eleccionrandom == eleccionp) {
                            System.out.println("Empate");
                        }
                        if (eleccionp == eleccionrandom) {
                            System.out.println("Empate");
                        }

                        if (eleccionrandom == 2 && eleccionp == 1) {
                            System.out.println("Gana la maquina");

                        }
                        if (eleccionrandom == 1 && eleccionp == 2) {
                            System.out.println("Ganas tú");

                        }
                        if (eleccionrandom == 3 && eleccionp == 1) {
                            System.out.println("Ganas tú");

                        }
                        if (eleccionrandom == 1 && eleccionp == 3) {
                            System.out.println("Gana la maquina");

                        }
                        if (eleccionrandom == 2 && eleccionp == 3) {
                            System.out.println("Ganas tú");

                        }
                        if (eleccionrandom == 3 && eleccionp == 2) {
                            System.out.println("Gana la maquina");

                        }

                    } while (eleccionrandom == eleccionp || eleccionp == eleccionrandom);

}
}
