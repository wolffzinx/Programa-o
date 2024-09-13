package Aula3_0803;
//Crie um programa em que o usuário informa o nome de um mês (ex: janeiro) e o programa exibe o número correspondente a esse mesmo mês (ex: 1);

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o mês: ");
        String mes = ler.next();
        switch (mes) {
            case "Janeiro" -> System.out.println("01 ");
            case "Fevereiro" -> System.out.println("02 ");
            case "Março" -> System.out.println("03 ");
            case "Abril" -> System.out.println("04 ");
            case "Maio" -> System.out.println("05 ");
            case "Junho" -> System.out.println("06 ");
            case "Julho" -> System.out.println("07");
            case "Agosto" -> System.out.println("08 ");
            case "Setembro" -> System.out.println("09 ");
            case "Outubro" -> System.out.println("10 ");
            case "Novembro" -> System.out.println("11 ");
            case "Dezembro" -> System.out.println("12 ");
            default -> System.out.println("Usuário Inválido");
        }
    }
}
