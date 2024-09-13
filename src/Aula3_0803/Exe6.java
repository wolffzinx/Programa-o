package Aula3_0803;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite primeiro valor");
        int n1 = ler.nextInt();
        System.out.println("Digite o segundo valor");
        int n2 = ler.nextInt();
        if (n1>n2)
            System.out.println("O primeiro é maior");
        else if (n1<n2)
            System.out.println("O segundo é maior");
        else
            System.out.println("eles são iguais");

    }
}
