package alboran;

import java.util.Scanner;

public class Ejercicioclase {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in); //Le estas diciendo al sistema con el nombre de "teclado" que haga de scanner
     System.out.println("Introduce tu nota de matematicas"); // y dira esto:
     double nota = teclado.nextDouble(); // Dices la nota con decimales...
     System.out.println("Perfecto, Tu nota de matematicas es " + nota + " ¿Cual es tu nota de Biología?"); //Y te dirá esto.

     double nota2 = teclado.nextDouble();
     System.out.println("Perfecto, Tu nota de Biología es " + nota2 + " ¿Y la de Lengua?");
     
     double nota3 = teclado.nextDouble();
     System.out.println("Perfecto, Tu nota de Lengua es " + nota3 + " ¿Y la de Plástica?");
     
     double nota4 = teclado.nextDouble();
     System.out.println("Perfecto, Tu nota de Plástica es " + nota4 + " ¿Y la de Sociales?");
     
     double nota5 = teclado.nextDouble();
     System.out.println("Perfecto, Tu nota de Sociales es " + nota5);

     double suma = nota + nota2 + nota3 + nota4 + nota5;
     double división = suma / 5;

     System.err.println("La media es " + división + ". Muchas gracias, introduzca tu edad");
     int edad = teclado.nextInt();
     System.out.println("Perfecto, " +" tienes " + edad + "años, muchas gracias");


       /*  var swapping  (Explicar en casa) Cambiar el valor de las 2 notas, aux mantiene la nota de nota2, y cuando nota 2 pase a ser nota 1, aux mantendra su valor en si misma
         y luego al invertir nota 1 y nota 2, los valores serían los mismos Ejemplo, si nota 1 es 8 y nota 2 es 5, aux y nota 2 serían 5, pero al invertirlo con ese codigo se quedaría
         en nota 1= 8 nota 2= 8 y aux 5, entonces luego decimos que nota1 = aux para transformar el 8 por el 5
        var aux = nota2;
        nota2 = nota1;
        nota1 = aux;

        System.out.println("Nota 1= " + nota1);
        System.out.println("Nota 2 = " + nota2);
        System.out.println("Nota 3 = " + nota3); */

     

     teclado.close();





    }
}
