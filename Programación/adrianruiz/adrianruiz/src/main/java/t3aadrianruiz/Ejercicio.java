package t3aadrianruiz;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        // Calcular el salario semanal de los empleados
        // Cobran 15 euros la hora si no superarn las 35 semanales
        // Cada hora que supere las 35 se paga como extra, a 22 euros
        // El programa debe pedir las horas al ususario y mostrar el sueldo final.
        // Una vez termina la ejecució n preguntamos si queremos calcular otro salario.
        // Si el usuario escribe Si, sI, SI o si el programa se ejecuta de nuevo, en
        // otro caso
        // termina. Además, si el usuario se equivoca e introduce horas negativas el
        // programa debe pedirlas de nuevo

        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tus horas de esta semana ");
        int hora = teclado.nextInt();

        int horaextra = hora - 35;
        do {if (hora < 35) { int salario = hora * 15; System.out.println("Tu salario semanal es de " + salario);} 
        else if (hora > 35) { int salariototal = (hora *15) + (horaextra *22); System.out.println("Tu salario semanal es de " + salariototal);
            
        } }
        while (!(hora >= 0 ));  
             
            
        

















    }
}
        

    

    

