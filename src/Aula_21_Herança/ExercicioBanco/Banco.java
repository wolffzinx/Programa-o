package Aula_21_Herança.ExercicioBanco;

import java.util.Scanner;

public class Banco {
    public static String leString(String mensagem ){
        Scanner ler = new Scanner(System.in);
        System.out.print(mensagem+": ");
        return

    }
    public static void main(String[] args) {
        ContaCorrente[] listaCC = new ContaCorrente[20;
        ContaPoupanca[] listaPC = new ContaPoupanca[20];
        int contaCC = 0;
        int contaCp = 0;
        String opc;

        do{
            System.out.println("selecione uma opção: ");
            System.out.println("cc - cadastrar conta corrente");
            System.out.println("cp - cadastrar conta poupança");
            System.out.println("ac - acessar conta corrente");
            System.out.println("ap - acessar conta poupança");
            System.out.println("e - sair");
            opc = leString("");
        }
        while (!resposta.equals)
    }
}
