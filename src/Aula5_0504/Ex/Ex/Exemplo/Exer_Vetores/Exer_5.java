package Aula5_0504.Ex.Ex.Exemplo.Exer_Vetores;

import java.util.Random;
import java.util.Scanner;

public class Exer_5 {
    public static void main (String[]args){
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        int[] vetor = new int[20];
        int[] par = new int [20];
        int [] imp = new int[20];
        int ip = 0;
        int ii = 0;
        System.out.println("Dados no vetor...");
        for(int i =0; i< vetor.length; i++){
            vetor [i] = aleatorio.nextInt(1,50);
            if (vetor[i]%2==0){
                par [ip] = vetor[i];
                ip++;
            }
            else {
                imp[ii] = vetor[i];
                ii++;
            }
        }
        System.out.print("\n numeros pares\n");
        for (int i = 0; i<ip;i++){
            System.out.println(par[i]+" ");
        }
        System.out.print("\n numeros pares\n");
        for (int i = 0; i<ii;i++){
            System.out.println(imp[i]+" ");
        }


    }
}
