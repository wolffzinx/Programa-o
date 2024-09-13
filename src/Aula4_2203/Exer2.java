package Aula4_2203;

import java.util.Scanner;

public class Exer2 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int cont=0;
        for(int i = 0; i<10; i++){
            System.out.println("Digite um numero: ");
            int num = ler.nextInt();
            if(num>10 && num<20)
                cont++;
        }
        System.out.println(+cont+" ");
    }
}
