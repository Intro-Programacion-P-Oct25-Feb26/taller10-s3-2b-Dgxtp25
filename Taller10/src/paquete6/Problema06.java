/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numero;
        double[][] matriz = new double[5][6];
        double[][] resultado = new double[5][6];


        System.out.print("Ingrese un número entero o real: ");
        numero = entrada.nextDouble();

      
        System.out.println("\nIngrese los valores de la matriz (5x6):");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("M[" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextDouble();
                resultado[i][j] = matriz[i][j] * numero;
            }
        }

     
        System.out.println("\nMatriz original:");
        for (double[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + "\t");
            }
            System.out.println();
        }

       
        System.out.println("\nMatriz resultante:");
        for (double[] resultado1 : resultado) {
            for (int j = 0; j < resultado1.length; j++) {
                System.out.print(resultado1[j] + "\t");
            }
            System.out.println();
        }
    }
}


