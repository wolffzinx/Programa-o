package Aula2.exercícios;
//Escreva um programa que calcula a área de um triângulo

import java.util.Scanner;

public class Exercício11 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor da base: ");
        Float base = ler.nextFloat();
        System.out.print("Digite o valor da altura: ");
        Float alt = ler.nextFloat();
        Float area = (base*alt)/2;
        System.out.println("Sua área resultou "+area);
    }

}
