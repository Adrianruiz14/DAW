package memuero;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        String precioproducto = 
        JOptionPane.showInputDialog("Digame el precio del producto");
        int precioproductoNumero = Integer.parseInt(precioproducto);
        double resultadomultiplicación = precioproductoNumero * 21;
        double resultadodivisión = resultadomultiplicación / 100;
        double IVA = precioproductoNumero - resultadodivisión;
        
      //TEXT BLOCK
        String resultadoAlgoritmo = """
                Tu producto cuesta %s euros pero, si le quitamos el IVA, que sería de %s y se queda en un total de %s
                """.formatted(precioproductoNumero, resultadodivisión, IVA);

    System.out.println(resultadoAlgoritmo);     
    }
}
