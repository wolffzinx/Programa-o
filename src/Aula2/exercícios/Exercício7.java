package Aula2.exercícios;
//Faça uma classe Java que leia a altura e o peso de uma pessoa e calcule seu IMC IMC = peso/altura²

import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Qual é sua altura: ");
        Float altura = ler.nextFloat();
        System.out.print("Qual é o seu peso: ");
        Float peso = ler.nextFloat();
        Float imc = peso/(float)Math.pow(altura, 2);
        System.out.println("Seu IMC: "+imc);
    }
}
