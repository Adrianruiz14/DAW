package daw;

import javax.swing.JOptionPane;

public class Ejercicio {

  // Usando JOption, solicita 4 numeros de la clave pin de un movil. Para saber si
  // el pin es valido hay varias restricciones
  // los digitos no se pueden repetir
  // los digitos impares deben sumar par,
  // la suma de los digitos pares deben ser impar
  // Filtra los digitos introducidos (entreo 0 y 9).
  // En caso de error que los solicitar de nuevo

  public static void main(String[] args) {

    // Conseguir
    String texto1 = """
        Introduzca tu primer número del pin
        """;

    String texto2 = """
        Introduzca tu segundo número del pin
        """;

    String texto3 = """
        Introduzca tu tercer número del pin
        """;

    String texto4 = """
        Introduzca tu cuarto número del pin
        """;

    int pin1, pin2, pin3, pin4;
    int pin1impar = 0, pin2impar = 0, pin3impar = 0, pin4impar = 0;
    int resultadoimpares;
    int resultado;

    // Ciclos

    do {

      do {

        // Ciclos Números inválidos >10

        String codigo1 = JOptionPane.showInputDialog(texto1);
        pin1 = Integer.parseInt(codigo1);

        if (pin1 > 10) {
          String error1 = """
               Nª1 del Pin no válido, Introduzca del 1-9.
              """;
          JOptionPane.showMessageDialog(null, error1);
        }
        if (pin1 % 2 != 0) {
          pin1impar = pin1;
        }
      } while ((pin1 > 10 || pin1 < 1));

      do {

        String codigo2 = JOptionPane.showInputDialog(texto2);
        pin2 = Integer.parseInt(codigo2);

        if (pin2 > 10) {
          String error2 = """
               Nª2 del Pin no válido, Introduzca del 1-9.
              """;
          JOptionPane.showMessageDialog(null, error2);
        }
        if (pin2 % 2 != 0) {
          pin2impar = pin2;
        }

      } while ((pin2 > 10));

      do {
        String codigo3 = JOptionPane.showInputDialog(texto3);
        pin3 = Integer.parseInt(codigo3);
        if (pin3 > 10) {
          String error3 = """
               Nª3 del Pin no válido, Introduzca del 1-9.
              """;
          JOptionPane.showMessageDialog(null, error3);
        }
        if (pin3 % 2 != 0) {
          pin3impar = pin3;
        }
      } while ((pin3 > 10));

      do {
        String codigo4 = JOptionPane.showInputDialog(texto4);
        pin4 = Integer.parseInt(codigo4);
        if (pin4 > 10) {
          String error4 = """
               Nª4 del Pin no válido, Introduzca del 1-9.
              """;
          JOptionPane.showMessageDialog(null, error4);
        }
        if (pin4 % 2 != 0) {
          pin4impar = pin4;
        }
      } while ((pin4 > 10));

      // No pueden ser iguales entre ellos

      if (pin1 == pin2 || pin1 == pin3 || pin1 == pin4 || pin2 == pin3 || pin2 == pin4 || pin3 == pin4) {
        String texto5 = """
            "Contraseña no válida, Dígitos idénticos, que cada número sea distinto"
            """;
        JOptionPane.showMessageDialog(null, texto5);

      }

      // La suma de los impares debe ser par

      resultadoimpares = pin1impar + pin2impar + pin3impar + pin4impar;

      if (resultadoimpares % 2 != 0) {
        String texto6 = """
            "Contreaseña no válida, la suma de tus numeros impares no es par, la suma es de %s.
              """.formatted(resultadoimpares);
        JOptionPane.showMessageDialog(null, texto6);

      }

      // La suma de los pares debe ser impar

      resultado = pin1 + pin2 + pin3 + pin4;

      if (resultado % 2 == 0) {
        String texto7 = """
            Contreaseña no válida, la suma de tus numeros pares no es impar, la suma es de %s.
            """.formatted(resultado);
        JOptionPane.showMessageDialog(null, texto7);

      }

      // Condición

    } while ((pin1 > 10 || pin2 > 10 || pin3 > 10 || pin4 > 10 || pin1 == pin2 || pin1 == pin3 ||
        pin1 == pin4 || pin2 == pin3 || pin2 == pin4 || pin3 == pin4 || resultadoimpares % 2 != 0
        || resultado % 2 == 0));

    String texto8 = """
        Código %s%s%s%s, Muchas gracias
        """.formatted(pin1, pin2, pin3, pin4);
    JOptionPane.showMessageDialog(null, texto8);
  }

}
