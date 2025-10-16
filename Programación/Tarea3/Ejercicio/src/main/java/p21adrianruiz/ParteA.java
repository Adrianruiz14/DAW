package p21adrianruiz;

import java.util.Scanner;

public class ParteA {

    public static void main(String[] args) {

        /* La tienda PCEstepona se dedica a reparar dispositivos portátiles. De lunes a viernes reparan un montón de ordenadores y como son una 
        tienda low cost, cobran lo mismo por todas las reparaciones.
        La idea es que tu programa ayude a los dueños de la tienda a saber cuánto han cobrado cada día y al final de la semana, suponiendo que todas 
        las reparaciones cuestan 32.6€ (double) y todas las semanas trabajan de lunes a viernes (5 días). 
        Una vez leídos los datos del número de reparaciones que hay cada día (de lunes a viernes) se deben mostrar los datos de lo que se ha cobrado 
        cada día (float) y al final de la semana (float). Ten en cuenta que se debe limitar la salida por consola a 3 números decimales.
        Guarda en una variable si el importe semanal de reparaciones cobrado es mayor que cero y menor que 3000.
        En esta parte todos los datos deben leerse por teclado usando Scanner y mostrarse usando la consola. */

        Scanner lunes = new Scanner(System.in);
        System.out.println("Introduzca el número de reparaciones del lunes");
        float reparacioneslunes = lunes.nextFloat();

        Scanner martes = new Scanner(System.in);
        System.out.println("Introduzca el número de reparaciones del martes");
        float reparacionesmartes = martes.nextFloat();

        Scanner miercoles = new Scanner(System.in);
        System.out.println("Introduzca el número de reparaciones del miercoles");
        float reparacionesmiercoles = miercoles.nextFloat();

        Scanner jueves = new Scanner(System.in);
        System.out.println("Introduzca el número de reparaciones del jueves");
        float reparacionesjueves = jueves.nextFloat();

        Scanner viernes = new Scanner(System.in);
        System.out.println("Introduzca el número de reparaciones del viernes");
        float reparacionesviernes = viernes.nextFloat();

        final double precioreparaciones = 32.6;

        Double gananciaslunes= reparacioneslunes * precioreparaciones;
        Double gananciasmartes= reparacionesmartes * precioreparaciones;
        Double gananciasmiercoles= reparacionesmiercoles * precioreparaciones;
        Double gananciasjueves= reparacionesjueves * precioreparaciones;
        Double gananciasviernes= reparacionesviernes * precioreparaciones;
        Double gananciassemana = gananciaslunes + gananciasmartes + gananciasmiercoles + gananciasjueves + gananciasviernes;


        //Para limitar el nº de decimales hay que usar %.2f 

        String texto = """
                Lunes: %.2f
                Martes: %.2f
                Miercoles: %.2f
                Jueves: %.2f
                Viernes: %.2f
                Total de la Semana: %.2f
                """.formatted(gananciaslunes, gananciasmartes, gananciasmiercoles, gananciasjueves, gananciasviernes, gananciassemana);

        System.out.println(texto);

        if (gananciassemana > 0 && gananciassemana < 3000) { System.out.println("Esta semana superamos los 0 euros pero no alcanzamos los 3000 con la suma de " + gananciassemana);}
           

        lunes.close();

        martes.close();

        miercoles.close();

        jueves.close();

        viernes.close();

    
    }
}