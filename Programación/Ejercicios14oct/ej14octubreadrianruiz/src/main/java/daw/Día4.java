package daw;

import java.util.Scanner;

public class Día4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int diasdelmes;
        int mes;
        int año;
        int febrero = 28;
        
        // NO FUI CAPAZ DE SACAR EL DIA BISIESTO

       
        do {
            System.out.println("Introduzca un día");
            diasdelmes = teclado.nextInt();
            if (diasdelmes > 31) {
                System.out.println("Numero de Día no valido"); 
                
            }
        } while (diasdelmes <= 0 || diasdelmes > 31);

        do {
            System.out.println("Introduzca un mes");
            mes = teclado.nextInt();
            if (mes <= 0 || mes > 12) {
                System.out.println("Número de mes no válido");
            }

        } while (mes <= 0 || mes > 12);

        do {
            System.out.println("Introduzca un año");
            año = teclado.nextInt();
            if (año > 2025) {
                System.out.println("Número de año no válido");
           
                
            
            }

        } while (año > 2025);

        System.out.println("La fecha que has introducido es " + diasdelmes + "/" + mes + "/" + año);

        teclado.close();
    }
}
