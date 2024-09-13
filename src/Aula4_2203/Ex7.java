package Aula4_2203;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        int cont = 0;
        int senha = 12345;
        int senhaD;
        do {
            System.out.println("Digite sua senha: ");
            senhaD = ler.nextInt();
            cont++;
        }
        while (senhaD != senha);
        System.out.println("Quantidades de tentativas"+cont);
    }
}
