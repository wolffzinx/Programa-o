package Aula3_0803;

import java.util.Scanner;
public class Exemplo1IF {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        int n1 = ler.nextInt();
        if(n1>=0 && n1<=10){
            System.out.println("Nota válida");
        }
        else{
            System.out.println("Nota inválida:");
        }
    }
}
