package Aula2.exercícios;
//Escreva uma classe Java que peça um número e então mostre a mensagem ''O número informado foi [número]''.

import java.util.Scanner;
public class exercício1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o número que deseja: ");
        int numero = ler.nextInt();
        System.out.println("O número informado foi: "+numero);
    }

}
