package Aula2.exercícios;
/*Crie uma classe java que leia dois números inteiros e que depois mostre:
O primeiro valor elevado ao segundo valor use Math.pow(número, expoente)
O primeiro valor vezes o segundo valor
O número inverso do primeiro valor (1/número)
A soma do segundo número com a metade do primeiro número
A diferença do primeiro número com o segundo
O número oposto ao primeiro valor (número *(-1) */


import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um num: ");
        Float n1 = ler.nextFloat();
        System.out.print("Digite outro num: ");
        Float n2 = ler.nextFloat();

        Float elev = (float)Math.pow(n1,n2);
        Float veze = n1*n2;
        Float inv = 1/n1;
        Float soma = n2+(n1/2);
        Float meno = n1-n2;
        Float opos = n1*(-1);

        System.out.println("O primeiro valor elevado ao segundo valor: "+elev);
        System.out.println("O primeiro valor vezes o segundo valor: "+veze);
        System.out.println("O número inverso do primeiro valor: "+inv);
        System.out.println("A soma do segundo número com a metade do primeiro número: "+soma);
        System.out.println("A diferença do primeiro número com o segundo: "+meno);
        System.out.println("O número oposto ao primeiro valor: "+opos);
    }
}
