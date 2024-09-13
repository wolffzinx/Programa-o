package Aula2.exercícios;
//Escreva um programa que leia o nome e o sobrenome de uma pessoa separadamente e mostre uma mensagem, “Bem vindo Nome Sobrenome”.

import java.util.Scanner;
public class exercício2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = ler.next();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = ler.next();
        System.out.println("Olá seja bem vindo "+nome+" "+sobrenome);
    }
}
