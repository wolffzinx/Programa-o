package Aula4_2203;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.println("Digite um valor N: ");
        n = ler.nextInt();
        for(; n >= 1; n--){
            System.out.println(n);
        }

    }
}
