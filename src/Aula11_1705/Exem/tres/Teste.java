package Aula11_1705.Exem.tres;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.sobrenome = "Silva";
        aluno1.email = "jgsilva@gmail.com";
        aluno1.codigo = 123;
        float n1, n2;

        System.out.println("Digite a primeira nota: ");
        n1 = ler.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2  = ler.nextFloat();
         aluno1.n1 = n1;
         aluno1.n2 = n2;
        System.out.println("O status do aluno é "+aluno1.verificando());

    }
}
