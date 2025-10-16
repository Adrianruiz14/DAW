//Comentario de una línea
//Declaración del paquete de la clase
//el nombre del pequete debe de ser el de la carpeta donde esta la clase 

package alboran;

//Declaración de la clase
// El nombre de la clase siempre igual que nombre del archivo
public class Main {
    /* Esto es un comentario multilinea 
    El método main es el programa que busca la JVN para iniciar la ejecución de cualquier programa 
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Tipos primitivos
    // Numeros enteros
    // Inicialización de varibale de tipo byte llamada valorByte
    // con valor 120
    byte valorbyte = 120;
   System.out.println("Valor byte = " + valorbyte);

    //declarar una variable de tipo short llamada valorShort 
    short valorShort;
    // asignación de valor a valorShort
    valorShort = 1000;
    // Dentro del método sount cuando uso el operador + lo que hace es una concecntración de valores
    // Todos los tipos primitivos tienen una clase que los envuelve, que los gestione

    System.out.println("Valor short = " + valorShort);

    int valorInt = 400;
    System.out.println("Valor int = " + valorInt);

    Integer valorInteger = 345;
     //valorInt es un tipo primitivo y valorInteger es un objeto
     // Podemos saber las característias de los numerales con los siguientes comandos:

    System.out.println("Valor Integer = " + valorInteger);
    System.out.println("valor mínimo de los int: " + Integer.MIN_VALUE);
     System.out.println("valor mínimo de los int: " + Integer.MAX_VALUE);
     System.out.println("tamaño de int en bytes: " + Integer.BYTES);
     System.out.println("tamaño de int en bits " + Integer.SIZE);

    long valorlong = 765;
    System.out.println("valor long = " + valorlong);

    float valorfloat = 34.5f;
    System.out.println("valor float = " + valorfloat);

    double valordouble = 34.5;
    System.out.println("valor double = " + valordouble);

    //Cuidado, los literales tipo char llevar comillas simples y los literales tipo String llevan comillas dobles

    char valorchar = 'J';
    System.out.println("valor char = " + valorchar);

    boolean valorBoolean = false;
    System.out.println("valor boolean = " + valorBoolean);
    
    
    }

}
   