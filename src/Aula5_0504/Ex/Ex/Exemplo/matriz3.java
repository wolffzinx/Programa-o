package Aula5_0504.Ex.Ex.Exemplo;

import java.util.Scanner;

public class matriz3 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        //vetor cm 7 elementos e indice de 0 a 6
        int[] vetor ={1,2,3,4,5,6,10};
        System.out.println("Dados no vetor ...");
        // para cada elemento do vetor copia para i e mostra na tela
        for(int i:vetor){
            System.out.print(i+" ");
        }
    }
}
