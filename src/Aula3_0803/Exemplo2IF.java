package Aula3_0803;

import java.util.Scanner;

public class Exemplo2IF {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        if(idade<0)
            System.out.println("Idade inválida");
        else if(idade<23)
            System.out.println("Juvenil");
        else if(idade<65)
            System.out.println("Adulto");
        else
            System.out.println("Terceira idade");
        }

    }
