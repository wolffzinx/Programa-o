package Aula_20.exmploBanco;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Encontre com o nome do titular: ");
        String titular = ler.next();
        System.out.print("Entre com o deposito innical: ");
        float valor = ler.nextFloat();
        Conta c1 = new Conta(titular,valor);
        System.out.println("Conta cadastrada obteve id: "+c1.identificador);
        //crindo outra conta
        Conta c2 = new Conta("Jonas", 10);
        c1.nomeBanco = "Banco cimol";
        Conta.nomeBanco = "teste";
        System.out.println("Nome banco c1: "+c1.nomeBanco);
        System.out.println("Nome banco c1: "+c2.nomeBanco);
    }
}
