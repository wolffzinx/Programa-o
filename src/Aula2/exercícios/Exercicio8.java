package Aula2.exercícios;
//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9)

import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite fahrenheit: ");
        Float fah = ler.nextFloat();
        Float celsius = 5*(fah-32)/9;
        System.out.println("Sua temperatura em celsius "+celsius);
    }
}
