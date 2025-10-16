package alboran;

public class ns {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 15;

//operaciones relacioales
        boolean esAIgualB = a > b;
        System.out.println("¿Son iguales? " + esAIgualB);

        boolean esAMayorIgualB = a >= b;
        System.out.println("¿Es a mayor igual a b? " + esAMayorIgualB);

        boolean sonDistintas = a != b;
        System.out.println("¿Son distintas? " + sonDistintas);

        int estatura = 170;
        boolean esDistintade200 = estatura != 200;
        boolean esMayorqueCero = estatura > 0;
        //El Y lógico es true cuando las 2 partes son false
        boolean esDistintade200ymayorquecero = esDistintade200 && esMayorqueCero;
        //Si la estatura es menos que cero o mayor que 200, para la ejecución 
        // es true
        // Si la estatura es menos que cero o mayor que 200 para la ejecición
        boolean x = estatura<0 || estatura > 200; 
        System.out.println(x);

        //Negación 
        boolean verdad = true;
        System.out.println(!verdad);


    }
}
