/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}
        };

        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};
        int[] totalAsistencias = new int[estudiantes.length];
        
        for (int i = 0; i < asistencia.length; i++){
            int contador = 0;
            for (int j = 0; j < asistencia[i].length; j++){
                if (asistencia[i][j]){
                    contador ++;
                } 
            } 
            totalAsistencias[i] = contador;
            
        }
        System.out.println("Reporte de asistencia\n");

    }

}
