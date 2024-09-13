package Aula4_2203;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        int cont = 0;
        int num, soma=0;
        do {
            System.out.println("Digite os numeros positivos: ");
            num = ler.nextInt();
            if(num!=-1){
                cont++;
                soma = soma+num;
            }

        }
        while (num>0);
        System.out.println("Você digitou"+cont+" positvos q somados dão "+soma);

    }
}
