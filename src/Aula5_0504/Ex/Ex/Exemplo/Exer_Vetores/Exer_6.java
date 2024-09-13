package Aula5_0504.Ex.Ex.Exemplo.Exer_Vetores;

import java.util.Scanner;

public class Exer_6 {
    public static void main (String[]args){
        Scanner ler = new Scanner(System.in);
        String[] nomes = {"Luana", "João", "Maria", "Pedro", "Sofia", "Lucas", "Laura", "Gabriel", "Carolina", "Miguel"};
        System.out.println("Qual o nome devo pesquisar: ");
        String nome = ler.next();
        boolean achei =false;
        for (int i =0; i <nomes.length;i++){
            if(nomes[i].equalsIgnoreCase(nome)){
                achei = true;
            }
        }
        if(achei){
            System.out.println(nome+" esta na lista!");
        }
        else{
            System.out.println(nome+" não está na lista!");
        }
    }
}
