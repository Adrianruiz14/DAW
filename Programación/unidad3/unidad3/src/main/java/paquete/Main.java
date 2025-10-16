package paquete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduca un número");
        int numero = teclado.nextInt();

        int resto = numero%10;

        //Saber si es un número es múltiplo de 10
       if (resto == 0) {
        // Código si la condición  es true
        System.out.println("Es divisible por 10");
    }

      if (numero%20 == 0){
        System.out.println("Es divisible por 10");
      }
       System.out.println("Introduce las horas");
       int horas = teclado.nextInt();
       System.out.println("Introduce los minutos");
       int minutos = teclado.nextInt();
       System.out.println("Introduce los segundos");
       int segundos = teclado.nextInt();

       if (horas>=0 && horas <= 23) {
        System.out.println("Las horas son válidas");
        if (minutos>=0 && minutos <= 59) {
        System.out.println("Los minutos son válidos");
        if (segundos>=0 && segundos <= 59) {
        System.out.println("Los segundos son válidos"); } }

       //Todas las condiciones en un if
 
       if ((horas>=0 && horas<=23)&&(minutos>=0 && minutos <= 59)
       &&(segundos>=0 && segundos <= 59)) {System.out.println("Todos los datos son correctos");
        
       }

        //Estructuras apiladas
        if (horas>=0 && horas <= 23) {System.out.println("Horas okay");
        }else{System.out.println("horas mal");}

        //Leer un número que represente el mes
        // Si el mes es correcto, el programa debe indicar
        //El nombre del mes correspondiente
        //Si el mes no es correcto indicarlo al usuario

        // var = condición ? valor si true : valor si false;
        

       teclado.close();
    }
    }
}
  
 