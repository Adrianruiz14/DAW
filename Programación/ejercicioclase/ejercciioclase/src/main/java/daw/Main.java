package daw;

public class Main {
    public static void main(String[] args) {

        int eleccion;

        do {
            eleccion = Juegos.Opciones();

            switch (eleccion) {
                case 1:

                    int memuero1 = 0;
                    int memuero2 = 0;
                    Juegos.parImpar(memuero1, memuero2);

                    break;

                case 2:

                    int memato = 0;
                    int memato2 = 0;
                    Juegos.PiedraPapel(memato, memato2);

                    break;

                case 3:

                    System.out.println("Has solicitado salir, muchas gracias");

                    break;

                default:
                    System.out.println("Opción no válida");

            }
        } while (eleccion < 3 && eleccion > 0);

    }

}
