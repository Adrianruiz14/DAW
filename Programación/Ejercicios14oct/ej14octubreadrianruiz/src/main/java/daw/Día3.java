package daw;

import java.util.Scanner;

public class Día3 {
   public static void main(String[] args) {

      Scanner teclado = new Scanner(System.in);
      int num;
      int suma = 0;

      System.out.println("Introduzca un número entero");
      num = teclado.nextInt();

      for (int i = 1; i <= num; i++) {
         boolean par = i % 2 == 0;
         suma+=i;
         System.out.println(i + " ¿Es/Son pares? " + par);
         



      } System.out.println("La suma de estos numeros es " + suma);
      teclado.close();
   }

}
