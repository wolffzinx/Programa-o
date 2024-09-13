package Aula2.exercícios;
//Escreva um programa que calcule a área e o perímetro de um quadrado

import java.util.Scanner;
public class Exercício10 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor da arestas: ");
        Float arestas = ler.nextFloat();
        Float area = (float)Math.pow(arestas, 2);
        Float peri = arestas*4;
        System.out.println("O valor da área "+area+" do perímetro "+peri);
    }
}
