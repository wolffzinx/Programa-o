package Aula4_2203;

import java.util.Scanner;

public class Exer3 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int num;
        do{
            System.out.println("Digite um valor: ");
            num = ler.nextInt();
        }
        while(num<1 || num>10);
            System.out.println("o num é: "+num);

    }
}