package Aula5_0504.Ex.Ex.Exemplo.Exer_Vetores;

import java.util.Scanner;

public class Exer_4 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        //vetor cm 10 elementos cm indices de 0 a 9
        int[] vetorM = new int[10];
        int[] vetorA = new int[10];
        int[] vetorMul = new int[10];
        int x;
        for (int i = 0; i <10; i++){ //percorre o vetor
            System.out.print("Digite os valores do vetor A["+i+"]: "); //pede o valor dos vetores
            vetorA[i] = ler.nextInt(); //guarda os vetores nas casas
        }
        System.out.println("Digite o valor pelo qual deseja multiplicar: ");
         x = ler.nextInt();
        for (int i = 0;i<10;i++) {
            vetorMul[i] = vetorA[i] * x;
        }
        for (int i = 0; i < vetorMul.length ;i++){
            System.out.println(vetorA[i]+" * "+ x +" = "+vetorMul[i]);
        }
    }
}

