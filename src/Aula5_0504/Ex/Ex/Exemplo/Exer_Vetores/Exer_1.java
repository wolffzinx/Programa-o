package Aula5_0504.Ex.Ex.Exemplo.Exer_Vetores;

import java.util.Scanner;

public class Exer_1 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        //vetor cm 10 elementos cm indices de 0 a 9
        int[] soma = new int[10];
        int[] vetorA = new int[10];
            for (int i = 0; i <10; i++){ //percorre o vetor
                System.out.print("Digite os valores do vetor A["+i+"]: "); //pede o valor dos vetores
                vetorA[i] = ler.nextInt(); //guarda os vetores nas casas
            }
        int[] vetorB = new int[10];
        for (int i = 0; i <10; i++){ //percorre o vetor
            System.out.print("Digite os valores do vetor B["+i+"]: "); //pede o valor dos vetores
            vetorB[i] = ler.nextInt(); //guarda os vetores nas casas
        }
        for (int i = 0;i<10;i++) {
            soma[i] = vetorA[i] + vetorB[i];
            System.out.println(soma[i] + " ");
        }

    }
}
