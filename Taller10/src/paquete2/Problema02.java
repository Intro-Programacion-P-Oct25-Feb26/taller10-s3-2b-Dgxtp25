/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {

        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}
        };

        int totalMenores = 0;
        int[] adultosPorFamilia = new int[edades.length];

        for (int i = 0; i < edades.length; i++) {
            int adultos = 0;

            for (int j = 0; j < edades[i].length; j++) {
                if (edades[i][j] < 18) {
                    totalMenores++;
                } else {
                    adultos++;
                }
            }

            adultosPorFamilia[i] = adultos;
        }

        System.out.println("Total de menores de edad: " + totalMenores);
        System.out.println();

        for (int i = 0; i < adultosPorFamilia.length; i++) {
            System.out.println("Familia " + (i + 1)
                    + " Adultos: " + adultosPorFamilia[i]);
        }
    }
}
