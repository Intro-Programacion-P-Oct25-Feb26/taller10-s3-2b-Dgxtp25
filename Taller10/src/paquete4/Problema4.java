/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author reroes
 */

import java.util.Scanner;

public class Problema4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] A = new int[3][2];
        int[][] B = new int[3][2];

   
        System.out.println("Ingrese los valores de la matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = entrada.nextInt();
            }
        }


        System.out.println("\nIngrese los valores de la matriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = entrada.nextInt();
            }
        }

  
        System.out.println("\nMatriz A:");
        for (int[] A1 : A) {
            for (int j = 0; j < A1.length; j++) {
                System.out.print(A1[j] + "\t");
            }
            System.out.println();
        }


        System.out.println("\nMatriz B:");
        for (int[] B1 : B) {
            for (int j = 0; j < B1.length; j++) {
                System.out.print(B1[j] + "\t");
            }
            System.out.println();
        }


        boolean cumpleCondicion = true;
        boolean existeMayor = false;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] < B[i][j]) {
                    cumpleCondicion = false;
                }
                if (A[i][j] > B[i][j]) {
                    existeMayor = true;
                }
            }
        }


        if (cumpleCondicion && existeMayor) {
            System.out.println("\nLa matriz A es mayor que la matriz B");
        } else {
            System.out.println("\nLa matriz A no es mayor que la matriz B");
        }
    }
}
