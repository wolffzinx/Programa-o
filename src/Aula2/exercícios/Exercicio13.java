package Aula2.exercícios;
//Escreva um programa para ler as dimensões de uma cozinha retangular (comprimento, largura e altura), calcular e escrever a quantidade de caixas de azulejos para se colocar em todas as suas paredes. Também deve ser lido um valor equivalente a área das Janelas e portas para descontar da área total. Cada caixa de azulejos possui 1,5 m2.

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o comprimento de sua cozinha: ");
        Float comp = ler.nextFloat();
        System.out.print("Digite a largura de sua cozinha: ");
        Float larg = ler.nextFloat();
        Float areaCozi = comp*larg;
        System.out.print("Digite o comprimento da sua porta: ");
        Float compPort = ler.nextFloat();
        System.out.print("Digite a largura de sua porta: ");
        Float largPort = ler.nextFloat();
        System.out.print("Digite o comprimento da sua janela: ");
        Float compJan = ler.nextFloat();
        System.out.print("Digite a largura de sua janela: ");
        Float largJan = ler.nextFloat();
        Float areaPortJan = (compJan*largJan)-(compPort*largPort);
        Float azulejo = (areaCozi - areaPortJan)/(float)1.5;
        System.out.println("O número de caixa de azulejos necessário é "+azulejo);

    }

}
