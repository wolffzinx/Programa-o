package Exercícios;

import java.util.Random;
import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        int[][] matriG = new int[3][3];
        int[] sl = new int[3];
        int[] sc = new int[3];
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                matriG[l][c] = aleatorio.nextInt(1, 20);
                System.out.printf("%02d", matriG[l][c]);
            }
            System.out.println();
        }
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                sl[l] = sl[l] + matriG[l][c];
                sc[l] = sc[l] + matriG[c][l];
            }
        }
        System.out.println("\n dados no vetor soma linha:");
        for (int i : sl) {
            System.out.print(i + " ");
        }
        System.out.println("\n dados no vetor soma soma:");
        for (int i : sc) {
            System.out.print(i + " ");
        }

    }
}