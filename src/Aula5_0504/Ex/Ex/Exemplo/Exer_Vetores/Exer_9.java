package Aula5_0504.Ex.Ex.Exemplo.Exer_Vetores;

import java.util.Random;
import java.util.Scanner;

public class Exer_9 {
    public static void main (String[]args){
        Scanner ler = new Scanner(System.in);
        Random aleatorio =new Random();
        int[] vetorR = new int[5];
        int[] vetorS = new int[10];
        int[] vetorX = new int[15];
        System.out.print("dados no vetor R:");
        for(int i =0; i < vetorR.length;i++){
            vetorR[i] = aleatorio.nextInt(20);
            System.out.println(vetorR[i]+" ");
        }
        System.out.print("dados no vetor S:");
        for(int i =0; i < vetorS.length;i++){
            vetorS[i] = aleatorio.nextInt(20);
            System.out.println(vetorS[i]+" ");
        }
        System.out.print("dados no vetor X:");
        for (int i =0; i< vetorX.length;i++){
            if(i<5){
                vetorX[i] = vetorR[i];
            }
            else{
                vetorX[i]= vetorS[i-5];
            }
            System.out.print(vetorX[i]+" ");
        }

    }
}
