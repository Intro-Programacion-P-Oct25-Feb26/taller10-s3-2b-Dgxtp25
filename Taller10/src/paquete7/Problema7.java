/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

import java.util.Scanner;

/**
 *
 * @author dgxbt
 */
public class Problema7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] X = new int[3][3];
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];

      
        System.out.println("Ingrese los valores de la matriz X (3x3):");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                System.out.print("X[" + i + "][" + j + "]: ");
                X[i][j] = entrada.nextInt();

                A[i][j] = (X[i][j] + 1) * (X[i][j] + 1);
                B[i][j] = X[i][j] * X[i][j] + 2 * X[i][j] + 1;
            }
        }

        boolean identidadCumple = true;

       
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] != B[i][j]) {
                    identidadCumple = false;
                }
            }
        }

        if (identidadCumple) {
            System.out.println("\nLa identidad algebraica se cumple.");
        } else {
            System.out.println("\nLa identidad algebraica no se cumple.");
        }
    }
}


