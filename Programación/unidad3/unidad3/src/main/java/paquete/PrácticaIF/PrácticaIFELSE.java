package paquete.PrácticaIF;

import java.util.Scanner;

public class PrácticaIFELSE {

     //Leer un número que represente el mes
        // Si el mes es correcto, el programa debe indicar
        //El nombre del mes correspondiente
        //Si el mes no es correcto indicarlo al usuario

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número del mes");
        int NumeroMes = teclado.nextInt();

        if (NumeroMes>=1 && NumeroMes<=12) {System.out.println("Mes introducido correcto");}
        else{System.out.println("Número incorrecto, por favor introduzca un número entre 1-12");}

        if (NumeroMes == 1) {System.out.println("Enero"); }else{System.out.println("Ese dato no corresponde a Enero");}
        if (NumeroMes == 2) {System.out.println("Febrero"); }else{System.out.println("Ese dato no corresponde a Febrero");}
        if (NumeroMes == 3) {System.out.println("Marzo"); }else{System.out.println("Ese dato no corresponde a Marzo");}
        if (NumeroMes == 4) {System.out.println("Abril"); }else{System.out.println("Ese dato no corresponde a Abril");}
        if (NumeroMes == 5) {System.out.println("Mayo"); }else{System.out.println("Ese dato no corresponde a Mayo");}
        if (NumeroMes == 6) {System.out.println("Junio"); }else{System.out.println("Ese dato no corresponde a Junio");}
        if (NumeroMes == 7) {System.out.println("Julio"); }else{System.out.println("Ese dato no corresponde a Julio");}
        if (NumeroMes == 8) {System.out.println("Agosto"); }else{System.out.println("Ese dato no corresponde a Agosto");}
        if (NumeroMes == 9) {System.out.println("Septiembre"); }else{System.out.println("Ese dato no corresponde a Septiembre");}
        if (NumeroMes == 10) {System.out.println("Octubre"); }else{System.out.println("Ese dato no corresponde a Octubre");}
        if (NumeroMes == 11) {System.out.println("Noviembre"); }else{System.out.println("Ese dato no corresponde a Noviembre");}
        if (NumeroMes == 12) {System.out.println("Diciembre"); }else{System.out.println("Ese dato no corresponde a Diciembre");}

        //También podemos usar switch para que sea más limpio y rápido
       /*  switch (NumeroMes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            default:
                break; */
        
         // Indicar el número de días
         // Indicar los de 31 días
         /*  if (NumeroMes == 1 || NumeroMes == 3 || NumeroMes == 5 || NumeroMes == 7 || NumeroMes == 8 || NumeroMes = 10 || NumeroMes == 12) 
         { System.out.println("Tiene 31 días");} else if (NumeroMes == 2) {System.out.println("Tiene 28 o 29 días");} else {System.out.println("Tiene 30 días");} */

        teclado.close();
        }
        

    }


 