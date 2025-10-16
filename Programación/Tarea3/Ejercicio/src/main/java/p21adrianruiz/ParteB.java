package p21adrianruiz;

import javax.swing.JOptionPane;

public class ParteB {
    public static void main(String[] args) {

        /* Modifica el ejercicio anterior para que la lectura de datos y la salida por pantalla usen diálogos JOptionPane.
        Además, en esta parte, se debe preguntar cuánto se va a cobrar por reparación cada día de la semana de lunes a viernes (double) y 
        luego preguntar cuántas reparaciones se han hecho cada día (int). Una vez leídos los datos, calcula lo que se cobra cada día y al 
        final de la semana, guardando los datos en tipos float. Usa un text block, limitando la salida a 1 decimal para cada dato numérico 
        (lo que se cobra cada día y el total semanal), para usarlo en un JOptionPane que muestre la información de salida.

        Guarda el resultado de evaluar si se ha cobrado al final de la semana más de 1000€ o menos de 100, mostrando el resultado por consola.*/
        
        // Preguntar cuantas reparaciones cada dia
        
        String lunes = JOptionPane.showInputDialog("¿Cuantas reparaciones se hicieron el lunes?");
        int reparacioneslunes = Integer.parseInt(lunes);

        String martes = JOptionPane.showInputDialog("¿Cuantas reparaciones se hicieron el martes?");
        int reparacionesmartes = Integer.parseInt(martes);
        
        String miercoles = JOptionPane.showInputDialog("¿Cuantas reparaciones se hicieron el miercoles?");
        int reparacionesmiercoles = Integer.parseInt(miercoles);
        
        String jueves = JOptionPane.showInputDialog("¿Cuantas reparaciones se hicieron el jueves?");
        int reparacionesjueves = Integer.parseInt(jueves);
        
        String viernes = JOptionPane.showInputDialog("¿Cuantas reparaciones se hicieron el viernes?");
        int reparacionesviernes = Integer.parseInt(viernes);

        
        // Preguntar cuanto cuesta cada día?

        String precio = JOptionPane.showInputDialog("¿Cuánto cuesta cada reparación el lunes");
        Float preciofinal = Float.parseFloat(precio);

        String precio2 = JOptionPane.showInputDialog("¿Cuánto cuesta cada reparación el martes");
        Float preciofinal2 = Float.parseFloat(precio2);

        String precio3 = JOptionPane.showInputDialog("¿Cuánto cuesta cada reparación el miercoles");
        Float preciofinal3 = Float.parseFloat(precio3);

        String precio4 = JOptionPane.showInputDialog("¿Cuánto cuesta cada reparación el jueves");
        Float preciofinal4 = Float.parseFloat(precio4);

        String precio5 = JOptionPane.showInputDialog("¿Cuánto cuesta cada reparación el viernes");
        Float preciofinal5 = Float.parseFloat(precio5);

        //Calcula las ganancias

        float gananciaslunes = preciofinal * reparacioneslunes;
        float gananciasmartes = preciofinal2 * reparacionesmartes;
        float gananciasmiercoles = preciofinal3 * reparacionesmiercoles;
        float gananciasjueves = preciofinal4 * reparacionesjueves;
        float gananciasviernes = preciofinal5 * reparacionesviernes;
        float gananciassemana = gananciaslunes + gananciasmartes + gananciasmiercoles + gananciasjueves + gananciasviernes;

        //Texto Final

        String resultado = """
                Lunes: %.1f 
                Martes: %.1f
                Miercoles: %.1f
                Jueves: %.1f
                Viernes: %.1f
                Total de la Semana: %.1f
                """.formatted(gananciaslunes, gananciasmartes, gananciasmiercoles, gananciasjueves, gananciasviernes, gananciassemana);

                JOptionPane.showMessageDialog(null, resultado);

        String resultado2 = """
                Esta semana hemos superado los parámetros requeridos, es decir superamos los 100 euros o los 1000 euros con la suma de %.1f
                """.formatted(gananciassemana);

        if (gananciassemana > 100 || gananciassemana > 1000) {JOptionPane.showMessageDialog(null, resultado2);
            
        //Quiero controlar las entradas del usuario 
        // Si son correctas sigo solicitando datos, en caso contrario mensajito y adios
        // Los precios para los lunes no pueden superar los 70 eruos y el numero de reparaciones no puede ser negativo
        // - precio>0&&<70
        // - reparaciones>0
        // if(precio>0 && precioreparacionselunes<70) {pasa esto}

        
            
        }
        }


        
        

    }
 
    
 }

   
