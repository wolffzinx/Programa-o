package Aula2.exercícios;
//Um motorista de táxi deseja calcular o rendimento de seu carro na praça. Sabendo-se que o preço do combustível é de R$ 4,15, escreva um programa para ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia, o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros. Calcular e escrever: a média do consumo em Km/L e o lucro (líquido) do dia.

import java.util.Scanner;

public class Exercício14 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        int n1 = ler.nextInt();
        if(n1>=0 && n1<=10){
            System.out.println("Nota válida");
        }
        else{
            System.out.println("Nota inválida:");
        }
    }
}
