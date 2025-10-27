package paquete.PrácticaIF;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PrácticaCasa {

    public static void main(String[] args) {
         /*EJ1 - Leer la edad de una persona e indicar si es menor de edad. En caso de ser mayor de edad, si tiene 18 
         * indicar que no tiene que tributar a hacienda, si tiene 25 indicar que tributa un 10% de  IRPF, si tiene 35, tributa a un 14% IRPF, si tiene 55 tributa un 22% 
         * y si tiene más de 65 no tributa
         * 
         * EJ2 - Calculadora, 
         * Pedir opción al usuario entre 1sumar-2restar-3multiplicar-4dividir, Si la opción no es válida el programa informa y termina
         * Si la opción es válida se debe realizar la operación correspondiente, mostrar resultado y terminar */
         
//E1
          Scanner teclado = new Scanner(System.in);
         System.out.println("Introduzca tu edad");
         int edad = teclado.nextInt();

         if (edad<18) {System.out.println("Eres menor de edad");} else if (edad == 18 || edad >= 65) {System.out.println("No tienes que tributar");} else if (edad == 25) 
         {System.out.println("Tienes que tribujar un 10% del IRPF");} else if (edad == 35) {System.out.println("Tienes que tributar un 14%");} else if (edad == 55) 
         {System.out.println("Tienes que tributar un 22%");} 

         teclado.close();  

//E2

         String texto = """
                 Elige entre las siguientes opciones:
                 1 Sumar
                 2 Restar
                 3 Multiplicar
                 4 Dividir
                 
                 """; 
        String opciones1 = JOptionPane.showInputDialog(texto);
        int opciones = Integer.parseInt(opciones1);

        if (opciones <1 || opciones >4) {System.out.println("Error, introduzca un número del 1 al 4"); return;} 

         String PrimerNumero = """
                Introduzca el primer número
                """;
        String Peticion1 = JOptionPane.showInputDialog(PrimerNumero);
        double num1 = Double.parseDouble(Peticion1);


         String SegundoNumero = """
                 Introduzca el segundo número
                 """;
        String Peticion2 = JOptionPane.showInputDialog(SegundoNumero);
        double num2 = Double.parseDouble(Peticion2);


        if (opciones == 1) {double suma = num1 + num2; System.out.println("El resultado de la suma es " + suma);} 
        if (opciones == 2) {double resta = num1 - num2; System.out.println("El resultado de la resta es " + resta);} 
        if (opciones == 3) {double multiplicacion = num1 * num2; System.out.println("El resultado de la multiplicación es " + multiplicacion);} 
        if (opciones == 4) {double división = num1 / num2; System.out.println("El resultado de la suma es " + división);} 
            
        }
    
}

//Lo que ponga dentro del switch tiene que ser un int, un char o un string