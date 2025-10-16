package alboran;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    /*Nde grupos que tiene un instituto, cada grupo tiene 30h semanales, cada profesor puede dar como maximo 18h /semanales, Usa Math.ceil/floor/round */

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca el número de grupos");
    int grupos = teclado.nextInt();


    int num1 = 30;
    int HorasdeGrupos = grupos *num1;
    int HorasdeProfesores = 18;

    int profesores = (int) Math.ceil((double)HorasdeGrupos / HorasdeProfesores);
    System.out.println("Hay un total de " + grupos + " clases y se necesitan un total de " + profesores + " profesores");

    teclado.close();

    





}
}
