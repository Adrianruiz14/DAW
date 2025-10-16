package t3aadrianruiz;

import javax.swing.JOptionPane;

public class AdrianRuiz {
    /**
     * @param args
     */
    public static void main(String[] args) {

        String texto1 = """
                Elige una de las siguientes opciones:
                1. Pide un número y determina si es par o impar.
                2. Pide al usuario dos números enteros y determina cuál es el mayor.
                3. Pide un número entre 0 y 100 que representa una calificación, imprimir:
                4. Pide un número entero e imprime si el número es positivo, negativo o cero.
                5. Determinar si un año es bisiesto. Un año es bisiesto si es divisible por 400 o es divisible por 4 y no es divisible por 100.
                """;

        String textopciones = JOptionPane.showInputDialog(null, texto1);
        int opciones = Integer.parseInt(textopciones);

        
        switch (opciones) {
            case 1:

                if (opciones == 1) {
                    String opcion1 = """
                            "Introduzca un número
                            """;
                    String textopcion1 = JOptionPane.showInputDialog(null, opcion1);
                    int num1 = Integer.parseInt(textopcion1);
                    boolean numeropar = num1 % 2 == 0;
                    System.out.println("Es " + num1 + " par? " + numeropar);

                    //OPERADOR TERNARIO: 

                   String resultadoo ;
                   resultadoo = num1 % 2 == 0?  "Es par" : "Es impar";
                   JOptionPane.showMessageDialog(null, resultadoo); 


                }
                break;

            case 2:

                if (opciones == 2) {
                    String opcion2 = """
                            Introduzca un número entero
                            """;
                    String textopcion2 = JOptionPane.showInputDialog(opcion2);
                    int num2 = Integer.parseInt(textopcion2);

                    String opcion22 = """
                            Introduzca un segundo número entero
                            """;
                    String textopcion22 = JOptionPane.showInputDialog(opcion22);
                    int num3 = Integer.parseInt(textopcion22);

                    boolean mayoromenor = num2 > num3;
                    String respuesta2 = """
                            ¿Es %s mayor que %s? %s
                                """.formatted(num2, num3, mayoromenor);
                    JOptionPane.showMessageDialog(null, respuesta2);

                     //OPERADOR TERNARIO: 

                     boolean mayor = num2 > num3? true : false;
                     JOptionPane.showMessageDialog(null, mayor);



                }
                break;

            case 3:

                if (opciones == 3) {
                    String opcion3 = """
                            Introduce tu calificación
                            """;
                    String textopcion3 = JOptionPane.showInputDialog(opcion3);
                    int calificacion = Integer.parseInt(textopcion3);

                    if (calificacion >= 0 && calificacion <= 59) {
                        String resultado3 = """
                                Estas suspenso
                                """;
                        JOptionPane.showMessageDialog(null, resultado3);
                    } else if (calificacion >= 60 && calificacion <= 100) {
                        String resultado3aprobado = """
                                Estas aprobado
                                """;
                        JOptionPane.showMessageDialog(null, resultado3aprobado);
                    } else {
                        String resultadoerror = """
                                Número incorrecto, intentelo de nuevo
                                """;
                        JOptionPane.showMessageDialog(null, resultadoerror);
                    }
                }
                break;

            case 4:

                if (opciones == 4) {
                    String numero = """
                            Introduce un número
                            """;
                    String numeropositivo = JOptionPane.showInputDialog(numero);
                    int num4 = Integer.parseInt(numeropositivo);

                    if (num4 == 0) {
                        System.out.println("Este número es 0");
                    } else if (num4 >= 0) {
                        System.out.println(num4 + " es positivo");
                    } else if (num4 < 0) {
                        System.out.println(num4 + " es negativo ");
                    }

                    //OPERADOR TERNARIO:
                    String resultado4;
                        resultado4 = num4 == 0? "El número es 0" : (num4 > 0? "El número es positivo" : "El número es negativo"); 
                        JOptionPane.showMessageDialog(null, resultado4);
                    }
                      
            
                break;

            case 5:

                // Un año es bisiesto si es divisible por 400 o es divisible por 4 y no es
                // divisible por 100.
                if (opciones == 5) {
                    String opcion5 = """
                            Introduzca un año
                            """;
                    String texto5 = JOptionPane.showInputDialog(opcion5);
                    int numaño = Integer.parseInt(texto5);

                    boolean resultado = numaño % 400 == 0 || numaño % 4 == 0 && numaño % 100 != 0;

                    String resultadofinal5 = """
                            ¿Es %s, un año bisiesto? %s
                            """.formatted(numaño, resultado);
                    JOptionPane.showMessageDialog(null, resultadofinal5);

                    //OPERADOR TERNARIO:
                    String resultado5;
                    resultado5 = numaño % 400 == 0 || numaño % 4 == 0 && numaño % 100 != 0? "Es bisiesto" : "No es bisiesto";
                    JOptionPane.showMessageDialog(null, resultado5); }

                    break;

                    default:

                    String error = """
                            Opción no válida
                            """;
                     JOptionPane.showMessageDialog(null, error);
                        break;
                }

        

    }
    }


