package Aula4_2203;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.print("Digte o Numero q seja multiplicar");
        n = ler.nextInt();
        for (int i = 0; i <= 10; i++){
            System.out.println(""+n+" X "+i+" = "+n*i);
        }

    }
}
