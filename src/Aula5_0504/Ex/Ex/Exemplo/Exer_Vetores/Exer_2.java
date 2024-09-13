package Aula5_0504.Ex.Ex.Exemplo.Exer_Vetores;

import java.util.Scanner;

public class Exer_2 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[100];
        int cont = 0;
        int num;
        do{
            System.out.println("Digite um número 0 para encerrar: ");
            num = ler.nextInt();
            if (num<0){
                vetor[cont]=num;
                cont++;
            }
        }
        while(num>0 && cont<100);

        for(int i=0; i<cont; i++){
            System.out.println(vetor[1]+" ");
        }
    }
}
