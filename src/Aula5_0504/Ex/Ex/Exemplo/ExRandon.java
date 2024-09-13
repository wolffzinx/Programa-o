package Aula5_0504.Ex.Ex.Exemplo;

import java.util.Random;
import java.util.Scanner;

public class ExRandon {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        int num = aleatorio.nextInt();
        System.out.println(num); //numero inteiro
        num = aleatorio.nextInt(10);
        System.out.println(num);
        num = aleatorio.nextInt(10,100);
        System.out.println(num);

        boolean flag = aleatorio.nextBoolean();
        System.out.println(flag);

        int[] numv = new int[10];
        for (int i = 0; i < numv.length; i++){
            numv[i] = aleatorio.nextInt(1,20);
            System.out.println(numv[i]+" ");
        }
    }
}
