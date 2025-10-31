package daw;

import java.util.Random;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String entrada = "";
        String SI = "si";
        String NO = "no";

        // Vamos a entrar en la casa del terror
        // Lo decimos
        JOptionPane.showMessageDialog(null, "Bienvenido a la casa del terror, El fantasma Paco eligirá tu camino");
        // Espiritu aparece y eligirá por ti tu camino
        Random eleccionespiritu = new Random();
        int sitioAleatorio = eleccionespiritu.nextInt(1, 3);
        String decision;

        if (sitioAleatorio == 1) {
            JOptionPane.showMessageDialog(null, "Paco te señala la ventana");
            decision = "ventana";

        } else  {
            JOptionPane.showMessageDialog(null, "Paco te señala la puerta");
            decision = "puerta";
        }

        //Tu eliges si entrar o no, segun tu eleccion:

        do {

            entrada = JOptionPane.showInputDialog("¿Quieres entrar?");

        } while (!(entrada.equalsIgnoreCase(SI) || entrada.equalsIgnoreCase(NO)));

        switch (entrada) { //Si = entras
            case "si":

                if (decision == "ventana") JOptionPane.showMessageDialog(null, "Entras voluntariamente por la ventana");
                if (decision == "puerta") JOptionPane.showMessageDialog(null, "Entras voluntariamente por la puerta");

                break;

                // No = paco te obliga a entrar da igual luego lo que digas

            case "no":
                JOptionPane.showMessageDialog(null, "Paco te mira y te vuelve a preguntar");

                for (int paco = 3; paco > 0; paco--) {

                        entrada = JOptionPane.showInputDialog("¿Quieres entrar?");

                    if (paco == 3) {
                        JOptionPane.showMessageDialog(null, "Paco se acerca");
                    }
                    if (paco == 2) {
                        JOptionPane.showMessageDialog(null, "Paco se acerca más");
                    }
                    if (decision == "ventana" && paco == 1) {
                        JOptionPane.showMessageDialog(null,
                                "Paco está detrás de tí, Paco te lanza por la ventana a la fuerza");

                    if (decision == "puerta" && paco == 1) { JOptionPane.showMessageDialog(null,
                                "Paco está detrás de tí, Paco te empuja por la puerta a la fuerza");
                        
                    }
                    }
                    
                }

        }



    }
}