import javax.swing.JOptionPane;

public class cambioshminsegundos {
    
 public static void main(String[] args) {
     String calculo = 
     JOptionPane.showInputDialog("Introduzca la cantidad de segundos para realizar el cambio");
     double calculoNumero = Double.parseDouble(calculo);

     double horas = calculoNumero / 3600; 
     double resto = calculoNumero - horas * 3600;
     double minutos =  resto / 60;
     double resto2 = resto - minutos * 60;
     double segundos = resto2 /60;

     System.out.println("El resultado de " + calculo + " segundos " + "es " + horas + " horas " + minutos + " minutos y " + segundos + " segundos ");

 }
}
