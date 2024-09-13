package Aula5_0504.Ex.Ex.Exemplo.Exer_Vetores;

import java.util.Scanner;

public class Exer_3 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] vetInver = new int[10];
        for (int i = 0; i <10; i++){ //percorre o vetor
            System.out.print("Digite os valores do vetor A["+i+"]: "); //pede o valor dos vetores
            vetor[i] = ler.nextInt(); //guarda os vetores nas casas
        }

        for (int i = 0; i < vetor.length; i++){
            vetInver[i] = vetor[vetor.length -1 -i]; //Enqunto o vetor principal desce o inver faz ao contrário
        }
        System.out.println("Vetor inverso é");
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetInver[i]+" ");
        }

    }
}
