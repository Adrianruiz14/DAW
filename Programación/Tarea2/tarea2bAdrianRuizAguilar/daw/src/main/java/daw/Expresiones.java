package daw;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Expresiones  {
      public static void main(String[] args) {
        String insertar = 
        JOptionPane.showInputDialog("Introduzca el primer número");
        int num1 = Integer.parseInt(insertar);

        Scanner insertar2 = new Scanner(System.in);
        System.out.println("Introduzca el segundo número");
        int num2 = insertar2.nextInt();

        //a
         boolean A1 = (num1 > num2) || (num1 - 10 < num2 -1);
         System.out.println("¿Es " + num1 + " > " + num2 + "? = " + A1 );

         String texto0 = """
                         ¿Es %s > %s y %s - 10 < %s -1? %s
                         """.formatted(num1,num2,num1,num2,A1);

                JOptionPane.showMessageDialog(null, texto0);

         //b CUIDAO || significa o y && es y.
         boolean B1 = num1 % 2 == 0;
         boolean B2 = num2 % 2 == 0;
         boolean B3 = B1 || B2;
         String texto = """
                 ¿Es cierto que %s y %s son pares? %s  
                 """.formatted(num1, num2, B3);
        
                 JOptionPane.showMessageDialog(null, texto);
        
         //c
         boolean C1 = num2 % 2 != 0 && num1 % 2 ==0;  

         String texto2 = """
                  ¿Es %s impar y %s par? %s 
                 """.formatted(num2, num1, C1);

                 JOptionPane.showMessageDialog(null, texto2);

        //d
        int resto = num1 % 3;
        int num3 = resto + 1;
        boolean D1 = num3 == 3;  //Para comparar hay que usar un == en una variable booleana

         String texto3 = """
         ¿El resto de %s, que es %s = 3? %s
                         """.formatted(num1, num3,D1);
        
        JOptionPane.showMessageDialog(null, texto3);


         // boolean D1 = num3 = 3;

         //E 
         boolean E1 = 10 <= 2*num1 && 3<4 || 8<7 && num2 *2 <= 4*2 - 1;
         
         String texto4 = """
                         El apartado E es %s
                         """.formatted(E1);

                JOptionPane.showMessageDialog(null, texto4);

         //F
         boolean F1 = !(num2 > num1 && num1 *2 <= num2);

         String texto5 = """
                 ¿%s es mayor que %s? ¿Y %s *2 <= %s? %s
                 """.formatted(num2, num1, num1, num2, F1);

        JOptionPane.showMessageDialog(null, texto5);

        //G  num1+=3 es lo mismo que num1 = num1 + 3
         // num1++ es lo mismo que num1+=1 que a su vez es lo mismo que num1 = num1 +1  
        //boolean G1 = num2 / 2 < num1;
        boolean G1 = num2 / 2 < num1 && num1++/2 > num2;
         String texto55 = """
                         El enunciado G = %s
                         """.formatted(G1);
                
                JOptionPane.showMessageDialog(null, texto55);


         //H
         boolean H1 = num1 > 15 || num1 < 20;
         
         String texto6 = """
                         ¿Está %s entre 15 y 20? %s
                         """.formatted(num1, H1);

         JOptionPane.showMessageDialog(null, texto6);


         //I

         boolean I1 = (num1 > 15 && num1 < 20) || (num2 !=7);

         String texto7 = """
                         ¿Está %s entre 15-20 y %s no es 7? %s 
                         """.formatted(num1, num2, I1);

         JOptionPane.showMessageDialog(null, texto7);
          
         
         //J 
        
         boolean J1 = num2 != 100;

         String texto8 = """
                 ¿ %s no es 100? %s
                 """.formatted(num2, J1);

         JOptionPane.showMessageDialog(null, texto8);

         //K
         // No pueds hacer boolean "nomnbre" != ... , porque no puedes darle negacion directa a un boolean pero pudedes hacer:

         boolean K1 = !(num2 > 50 && num2 < 100);
         String texto9 = """
                         ¿%s no está entre 50-100? %s
                         """.formatted(num2, K1);

         JOptionPane.showMessageDialog(null, texto9);

         insertar2.close();

         
                




      }

}

  

