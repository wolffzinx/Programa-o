package Aula2.exercícios;

import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Entre com um número: ");
        int numero = ler.nextInt();
        System.out.println("O número digitado foi: "+numero);
        System.out.printf("O número digitado foi %d\n",numero);
        System.out.print("Digite um número real: ");
        float numeroReal = ler.nextFloat();
        System.out.println("O número com vírgula é: "+numeroReal);
        System.out.printf("O número com vírgula é: %.2f\n",numeroReal);
    }
}
