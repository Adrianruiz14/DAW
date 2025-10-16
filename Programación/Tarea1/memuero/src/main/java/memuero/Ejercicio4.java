package memuero;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        
    
        String cambio = 
        JOptionPane.showInputDialog("Introduzca el número de dolares para el cambio a euros");
        double cambioNumero = Double.parseDouble(cambio);

        
        double dolares = 1.17;
        int euros = 1;
        double resultadomultiplicación = cambioNumero * euros;
        double resultadodivisión = resultadomultiplicación / dolares;


        String resultadoAlgoritmo = """
                      Un total de %s dolares, son %s euros
                        """.formatted(cambioNumero, resultadodivisión);
            
        System.out.println(resultadoAlgoritmo);



    }
}
