package Aula2.exercícios;
//Escreva uma classe Java que leia e imprima a soma e a multiplicação de dois números.

import java.util.Scanner;
public class Exercício9 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        Float n1 = ler.nextFloat();
        System.out.print("Digite outro valor: ");
        Float n2 = ler.nextFloat();
        Float total = n1*n2;
        System.out.println("A soma dos valores: "+total);
    }
}
