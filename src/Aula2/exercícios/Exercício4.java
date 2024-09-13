package Aula2.exercícios;
//Escreva uma classe Java que converta metros para centímetros.

import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite quantos metros desejas converter: ");
        Float metro = ler.nextFloat();
        Float centimetros = metro*100;
        System.out.println("A conversão resultou em: "+centimetros);
    }
}
