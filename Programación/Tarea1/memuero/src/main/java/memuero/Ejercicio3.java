package memuero;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Teniendo en cuenta que la formula para sacar el volumen de un círculo: V=3/4​⋅π⋅r(3), volumen es igual a 4/3 x numero pi x radio elevado a 3
        
        double PI = Math.PI;
        double radio = 14;
        double operacion1 = PI * Math.pow(radio, 3);
        double operacion2 = (operacion1 * 4) / 3;

        System.out.println("El volumen del círculo es " + operacion2);



    }
}
