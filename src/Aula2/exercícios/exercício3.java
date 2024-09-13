package Aula2.exercícios;
//Faça uma classe Java que peça as 4 notas bimestrais e mostre a média

import java.util.Scanner;

public class exercício3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a 1 nota do aluno: ");
        Float n1 = ler.nextFloat();
        System.out.print("Digite a 2 nota do aluno: ");
        Float n2 = ler.nextFloat();
        System.out.print("Digite a 3 nota do aluno: ");
        Float n3 = ler.nextFloat();
        System.out.print("Digite a 4 nota do aluno: ");
        Float n4 = ler.nextFloat();
        Float media = (n1+n2+n3+n4)/4;
        System.out.println("A média Bimestral do aluno é: "+media);

    }
}
