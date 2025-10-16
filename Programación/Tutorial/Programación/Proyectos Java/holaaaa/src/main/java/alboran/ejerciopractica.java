package EJERCICIOS;

import javax.swing.JOptionPane;

public class ejerciopractica {
    public static void main(String[] args) {
        

        final int NUMERO_HORAS_PROFESOR = 18;
        final int NUMERO_HORAS_GRUPO = 30;

        //Solicitar numero de grupos
        String numeroGrupo = 
        JOptionPane.showInputDialog("Introduce el número de grupos: ");
        //esto pone solo el import de arriba 
        
        //Tengo que pasar el string a int
        int numeroGrupoNumero = Integer.parseInt(numeroGrupo);

        //necesito pasar el string a numeros
        int numeroTotalHoras = numeroGrupoNumero * NUMERO_HORAS_GRUPO;
        Double numeroProfesores = Math.ceil(numeroTotalHoras/NUMERO_HORAS_PROFESOR);

    System.out.println("Número de profes necesarios " + numeroGrupo);


     JOptionPane.showMessageDialog(null,"El número de profes necesarios es "+ numeroProfesores);


   //TEXT BLOCK
        String texto = "esto es un texto";
        String bloquetexto = """
                        es un texto multilinea
                        que permite mostrar 
                        saltos de tabulacione y valores de var
                        """;
        String resultadoAlgoritmo = """
                En el IES Mar Alboran, para dar clase a %s 
                se necesitan %s profes
                """.formatted(numeroGrupo, numeroProfesores);

    System.out.println(resultadoAlgoritmo);
   
    }

}
