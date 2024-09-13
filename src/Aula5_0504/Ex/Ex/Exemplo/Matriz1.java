package Aula5_0504.Ex.Ex.Exemplo;

import java.util.Scanner;

public class Matriz1 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        //vetor cm 10 elementos cm indices de 0 a 9
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) { //percorre o vetor
            System.out.print("vetor[" + i + "]: "); //pede o valor dos vetores
            vetor[i] = ler.nextInt(); //guarda os vetores nas casas
        }
        for (int i = 0; i < 10; i++) { //escreve o vetor na tela
            System.out.print(vetor[i] + " "); //mostra na tela os 10 vetores
        }
    }
}
