package Aula3_0803;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor");
        Float val = ler.nextFloat();
        if( val<=10 && val>=15)
            System.out.println("Parabéns");
        else
            System.out.println("Errado!");
    }
}
