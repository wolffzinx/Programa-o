package Aula2.exercícios;
//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;

public class Exercício6 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Quanto vc ganha por hora: ");
        Float valor = ler.nextFloat();
        System.out.print
                ("Quantas horas vc trabalha por mês: ");
        Float hora = ler.nextFloat();
        Float total = hora*valor;
        System.out.println("Você recebe por mês R$"+total);
    }
}


