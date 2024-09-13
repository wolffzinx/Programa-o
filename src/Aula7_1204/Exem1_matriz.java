package Aula7_1204;

import java.util.Scanner;

public class Exem1_matriz {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        //tipo[][] nome = new tipo[linhas][colunas]
        int[][] matriz = new int[4][3];
        //lendo matrizes do teclado
        for (int l= 0; l<4; l++){
            for (int c=0; c<3;c++){
                System.out.printf("matriz[%d][%d]: ",l,c);
                matriz[l][c] = ler.nextInt();
            }
        }
        // for para mostrar na tela
        for (int l =0; l<4;l++){
            for(int c=0; c<3;c++){
                System.out.printf("%02d ",matriz[l][c]);
            }
            //para não ficar um gigantesco vetor
            System.out.println();
        }
    }
}
