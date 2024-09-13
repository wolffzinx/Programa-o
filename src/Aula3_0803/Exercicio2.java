package Aula3_0803;
//

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o nome do nadador");
        String nome = ler.next();
        System.out.println("Qual a idade do nadador");
        int id = ler.nextInt();
        if(id<5)
            System.out.println("Idade não permitida");
        else if(id<8)
            System.out.println("Infantil A");
        else if(id<11)
            System.out.println("Infantil B");
        else if(id<14)
            System.out.println("Juvenil A");
        else if(id<18)
            System.out.println("Juvenil B");
        else
            System.out.println("Adulto");
    }
}
