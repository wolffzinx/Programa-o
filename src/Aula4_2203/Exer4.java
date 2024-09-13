package Aula4_2203;

import java.util.Scanner;

public class Exer4 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite sua idade: ");
            num = ler.nextInt();
        }
        while (num < 1 || num > 150);
        System.out.println("o num é: " + num);
    }
}
