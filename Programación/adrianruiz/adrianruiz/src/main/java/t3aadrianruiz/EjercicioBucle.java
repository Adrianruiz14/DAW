package t3aadrianruiz;

import java.util.Scanner;

public class EjercicioBucle {

    public static void main(String[] args) {

        // Calcular el salario semanal de los empleados.
        // Cobran 15 euros la hora si no superan las 35 semanales.
        // Cada hora que supere las 35 se paga como extra, a 22 euros.
        // El programa debe pedir las horas al usuario y mostrar
        // El sueldo final. Una vez termina la ejecución preguntamos
        // si queremos calcular otro salario. Si el usuario escribe
        // Si, sI, SI o si el programa se ejecuta de nuevo, en otro
        // caso termina. Además, si el usuario se equivoca e introduc
        // horas negativas el programa debe pedirlas de nuevo.

        // Intenta poner las variables siempre al principio y luego solo las tienes que
        // llamar
        Scanner teclado = new Scanner(System.in);
        String vuelta;
        int horas;
        int horasextra;

        do {
            System.out.println("Introduce tus horas semanales");
            horas = teclado.nextInt();
            horasextra = horas - 35;
            if (horas < 0) {
                System.out.println("Número no válido");
                return;
            }

            if (horas <= 35) {
                int horasemana = horas * 15;
                System.out.println("Tu salario semanal es de " + horasemana);
            } else if (horas > 35) {
                int horastotales = (horas * 15) + (horasextra * 22);
                System.out.println("Tu salario semanal es de " + horastotales);
            }

            System.out.println("¿Quieres volver a preguntar?");
            vuelta = teclado.next();

        } while (!(vuelta.equals("Si")) || (vuelta.equals("SI")) || (vuelta.equals("sI")) || (vuelta.equals("si")));
        
    }

}
