package alboran;

public class Operaciones {
    public static void main(String[] args) {
        //Operaciones aritméticas básicas
        int num1 = 10;
        int num2 = 20;

        //Suma
        //En la variable suma se guarda el resultado de sumar 
        //el valor de num1 y num2 sustituye las variales y relaiza la operación
        int suma = num1 + num2;
        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de sumar " + num1 + " mas " + num2 + " es " + suma);

        int resta = num1 - num2;
        System.out.println("El resultado de restar " + num1 + " menos " + num2 + " es " + resta);

        int multiplicación = num1 * num2;
        System.out.println("El resultado de multiplicar " + num1 + " por " + num2 + " es " + multiplicación);

        int dividir = num1 / num2;
        System.out.println("El resultado de dividir " + num1 + " entre " + num2 + " es " + dividir);

        //Cuidado con las divisiones enteras, cuando se mezclan valores como int o double siempre se cogen los más grandes, ej, double, normalmente intenta que sea todo igual
        // División por cero en enteros
        double a = 0;
        double b = 2;
        System.out.println("División entro 0: " + (a/b));

         // Si pones una variable que ponga final int = x, una vez finalizada debe seguir hasta el final
         // Para hacer que algo se eleve a algo tenemos que hacer

         double resultado = Math.pow(2, 3);
         System.out.println("2 elevado a 3 es " + resultado);

         //Para calcular el volumen de una esfera: 
         // Teniendo en cuenta que la formula para sacar el volumen de una esfera: V=4/3​⋅π⋅r(3), volumen es igual a 4/3 x numero pi x radio elevado a 3
        
        double PI = Math.PI;
        double radio = 14;
        double operacion1 = PI * Math.pow(radio, 3);
        double operacion2 = (operacion1 * 4) / 3;

        System.out.println("El volumen del círculo es " + operacion2);

//Tablas de verdad
//Operador modulo 




    }
}
