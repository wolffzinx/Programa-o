package Aula5_0504.Ex.Ex.Exemplo.Exer_Vetores;



import java.util.Scanner;

public class Exer_1_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho;
        do {
            System.out.println("digite um valor entre 1 e 10: ");
            tamanho = ler.nextInt();
        }
        while (tamanho<1 || tamanho>10);
        int vetorA []= new int[tamanho];
        int vetorB [] = new int[tamanho];
        int soma [] = new int[tamanho];
        System.out.println("lendo dados para o vetor A");
        for (int i=0;i<tamanho;i++){
            System.out.println("vetor["+i+"]: ");
            vetorA[i] = ler.nextInt();
        }
        System.out.println("\nLendo dados para o vetor B");
        for (int i=0;i<tamanho;i++){
            System.out.println("vetor["+i+"]:");
            vetorB[i] = ler.nextInt();
        }
        System.out.println("\nsomando e mostrando o vetor...");
        for (int i=0;i<tamanho;i++){
            soma[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorA[i]+" + "+ vetorB[i]+" = "+soma[i]);
        }
    }
}

