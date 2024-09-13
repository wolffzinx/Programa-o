package Aula4_2203;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2;
        do{
            System.out.println("Digite n1: ");
            n1 = ler.nextInt();
            System.out.println("Digite n2: ");
            n2 = ler.nextInt();
        }
        while(n1<0.0 || n1>10.0 && n2>0.0 || n2>10.0);
        float media = (n1+n2)/2;
        System.out.println("essa é a media"+media);
    }
}
