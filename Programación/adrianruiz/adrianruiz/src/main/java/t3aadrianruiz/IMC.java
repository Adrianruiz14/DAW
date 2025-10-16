package t3aadrianruiz;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        // Calculas IMC de los adultos, la formula es IMC= peso / altura eleveado a 2

        Scanner teclado = new Scanner(System.in);
        double peso;
        double altura;
        String volver;
        double IMC;

        do {
            System.out.println("Introduzca su peso actual");
            peso = teclado.nextDouble();
            if (!(peso >= 0.1) || !(peso <= 200)) {
                System.out.println("Peso no válido, introduzca entre 0.1-200 kg");
            }
        } while ((peso < 0.1) || (peso > 200));

        do {
            System.out.println("Introduzca su altura actual");
            altura = teclado.nextDouble();
            if (!(altura >= 0.5) || !(altura <= 2.5)) {
                System.out.println("Altura no válida, introduzca entre 0-5-2.5m");
            }
        } while ((altura >= 0.5) || (altura <= 2.5));

        IMC = peso % (altura * altura);
        System.out.println("Tu IMC es de " + IMC);
        if (IMC <= 18.5) {
            System.out.println("Tienes muy poco peso");
        } else if (IMC <= 24.9 && IMC > 18.5) {
            System.out.println("Tienes un peso normal");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Tienes sobrepeso");
        } else if (IMC >= 30 && IMC <= 34.9) {
            System.out.println("Tienes obesidad moderada");
        } else if (IMC >= 35 && IMC <= 39.9) {
            System.out.println("Tienes obesidad grave");
        } else if (IMC >= 40 && IMC <= 49.9) {
            System.out.println("Tienes obesdiad mórbida");
        } else if (IMC >= 50) {
            System.out.println("Tienes doble obesidad mórbida");
        }

        do {
            System.out.println("¿Quieres volver a preguntar?");
            volver = teclado.next();
            if (volver.equals("No") || (volver.equals("no")) || (volver.equals("nO")) || (volver.equals("NO"))) {
                break;
            }

        } while (!(volver.equals("No")) || !(volver.equals("no")) || !(volver.equals("nO")) || !(volver.equals("NO")));

        teclado.close();

    }
}
