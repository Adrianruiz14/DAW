package daw;

import java.util.Scanner;

public class Cuadro {
    public static void main(String[] args) {
        // Calcular el cuadro de amortización de la compra de una vivienda
        // El programa solicita el precio de la vviienda y el numeor de meses a pagar
        // Los pagos mensuales se realizan aportando la mitad de lo que quede por pagar
        // del mes
        // anterior, hasta que se llegue al ultimo mes que es paga lo que quede de
        // deuda.
           
        //Pide los datos
        Scanner teclado = new Scanner(System.in);
 
        System.out.println("Introduzca el precio de la vivienda");
        double preciovivienda = teclado.nextDouble();
        System.out.println("Introduzca el número de meses a pagar");
        int mesesapagar = teclado.nextInt();
        int mes;
       
        //Bucle

        for (mes = mesesapagar; mes > 0; mes--) { 

             
             preciovivienda = preciovivienda / 2;
           
            System.out.print("Te quedan por pagar " + mes + " meses/mes y tu deuda es de " + preciovivienda); 

            System.out.println();

        }
        teclado.close();


    }

}
