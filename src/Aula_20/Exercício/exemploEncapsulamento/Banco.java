package Aula_20.Exercício.exemploEncapsulamento;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Encontre com o nome do titular: ");
        String titular = ler.next();
        System.out.print("Entre com o deposito innical: ");
        float valor = ler.nextFloat();
        Conta c1 = new Conta(titular,valor);
        System.out.println("Conta cadastrada obteve id: "+c1.getIdentificador());
        //crindo outra conta
        System.out.println(c1.verificaSaldo());
        c1.depositar(10);
        System.out.println(c1.verificaSaldo());
        c1.sacar(20);
        System.out.println(c1.verificaSaldo());

    }
}
