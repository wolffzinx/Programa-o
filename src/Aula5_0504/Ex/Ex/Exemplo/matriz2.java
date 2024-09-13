package Aula5_0504.Ex.Ex.Exemplo;

import java.util.Scanner;

public class matriz2 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[10];
        int tamanho = vetor.length;
        System.out.println("O tamanho do vetor é"+tamanho);
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]+" ");
        }

    }
}
