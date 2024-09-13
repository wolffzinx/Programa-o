package Aula_21.ExercicioBanco;

import java.util.Scanner;

public class Banco {
    public static String leString(String mensagem ){
        Scanner ler = new Scanner(System.in);
        System.out.print(mensagem+": ");
        return ler.nextLine();
    }

    public static float leFloat (String mensagem){
        Scanner ler = new Scanner(System.in);
        System.out.println(mensagem+": ");
        return ler.nextFloat();
    }

    public static ContaCorrente acessarCC(ContaCorrente c1){
        String opc;
        System.out.println("acessar a conta"+c1.getIdentificador());
        System.out.println("Bem vindo, "+c1.getTitular());
        do {
            System.out.println("selecione um opc: ");
            System.out.println("d - realizar depósito");
            System.out.println("s - realizar um saque");
            System.out.println("v - verificar um saldo");
            System.out.println("a - alterar senha");
            System.out.println("e - sair");
            opc = leString(" ").toLowerCase();
            switch (opc){
                case "d"->{
                    float valor = leFloat("Qual valor vc deseja deposiar");
                    if (c1.sacar(valor))
                        System.out.println("saque realizado");
                    else
                        System.out.println("saldo mais limite insuficiente");
                }
                case "v"-> System.out.println(c1.verificaSaldo);

                case "a"->{
                    String senha = leString("Qual a nova senha ");
                    c1.setSenha(senha);
                }
            }
            while (!opc.equals("e"));
            return c1;
        }
    }


    public static contaCorrente cadastrarCC (){
        String titular = leString("Qual o titular da conta");
        String senha = leString("Qual a senha");
        float limite = leFloat("Qual o limite inicial");
        contaCorrente c1 = new contaCorrente(titular,senha,limite);
        System.out.println("Conta cadastrada cm o identificador"+c1.getIdentificador);
        return c1;
    }

    public static ContaPoupanca cadastrarCP(){
        String titular = leString("Qual o titular da conta");
        String senha = leString("Qual a senha");
        float depositar = leFloat("Qual o valor do deposito");
        contaPoupanca
    }
    public static void main(String[] args) {
        ContaCorrente[] listaCC = new ContaCorrente[20];
        ContaPoupanca[] listaCP= new ContaPoupanca[20];
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
            switch (opc){
                case "cc" ->{
                    listaCC[contCC] = cadastrarCC();
                    contCC++;
                }
                case "cp" ->{
                    listaCP[contaCp] = cadastrarCP();
                    contCP++;
                }
                case "ac" ->{
                    String identificador = leString("Qual o identificador");
                    String senha = leString("Qual a senha");
                    int posicao = -1;
                    for (int i = 0; i < contCC; i++) {
                        if (listaCC[i].validaAcesso(identificador,senha))
                            posicao = i;
                    }
                    if (posicao>=0){
                        listaCC[posicao] = acessarCC(listaCC[posicao]);
                    }
                    else{
                        System.out.println("conta inexistente");
                    }
                }
            }
        }
        while (!opc.equals("e"));

    }


