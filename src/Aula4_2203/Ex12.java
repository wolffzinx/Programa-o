package Aula4_2203;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        int num;
        System.out.print("Digite o num: ");
        num = ler.nextInt();
        int contDiv = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contDiv++;
            }
        }
        if(contDiv == 2){
            System.out.println("O seu numero é primo: "+num);
        }
        else
            System.out.println("O seu numero n é primo: "+num);
        }

}
