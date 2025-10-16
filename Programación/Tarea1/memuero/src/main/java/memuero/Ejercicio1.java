package memuero; 

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
       String horastrabajadas =
       JOptionPane.showInputDialog("Introduzca tus horas realizadas esta semana :D");

        int horastrabajadasNumero = Integer.parseInt(horastrabajadas);

       double salario = horastrabajadasNumero * 34.5;
       
      //TEXT BLOCK
        String resultadoAlgoritmo = """
                Tu salario es %s euros
                """.formatted(salario);

    System.out.println(resultadoAlgoritmo);

      
    
    
    
    
    
    }
}