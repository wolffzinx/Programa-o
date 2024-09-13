package Aula7_1204;

import java.util.Random;
import java.util.Scanner;

public class Exem3_matriz {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        int[][] matriz = new int[5][5];
        for (int l = 0;l< matriz.length;l++){
            for (int c = 0; c<matriz[l].length;c++ ){
                matriz[l][c] = aleatorio.nextInt(1,50);
                System.out.printf("%02d ",matriz[l][c]);
            }
            System.out.println();
        }
        System.out.print("\n Diagonal da matriz\n");
        for (int l = 0;l< matriz.length;l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (l == c)
                    System.out.printf(matriz[l][c]+" ");
            }
        }
        System.out.print("\nDiagonal opc 2\n");
        for (int i =0; i< matriz.length;i++){
            System.out.printf(matriz[i][i]+" ");
        }
        System.out.print("\nDiagonal inversa\n");
        for (int l = 0;l< matriz.length;l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (l+c == matriz.length-1)
                    System.out.printf(matriz[l][c]+" ");
            }
        }
    }
}
