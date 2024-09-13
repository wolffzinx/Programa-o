package Aula2.exercícios;
//Uma equipe de Fórmula 1 deseja calcular o número mínimo de litros que deverá colocar no tanque de seu carro para que ele possa percorrer um determinado número de voltas até o primeiro reabastecimento. Escreva um programa que leia o comprimento da pista (em metros), o número total de voltas a serem percorridas no grande prêmio, o número de reabastecimentos desejados e o consumo de combustível do carro (em Km/L). Calcular e escrever o número mínimo de litros necessários para percorrer até o primeiro reabastecimento. Observação: Considere que o número de voltas entre os reabastecimentos é o mesmo.

import java.util.Scanner;

public class Exercício15 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("tamanho da pista de metros: ");
        Float pista = ler.nextFloat()/1000;
        System.out.println("Números de voltas: ");
        Float nVoltas = ler.nextFloat();
        System.out.println("Abastecimentos: ");
        Float abst = ler.nextFloat();
    }
}
