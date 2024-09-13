package Aula4_2203;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[]args){
        int nota;
        do {
            System.out.println("Digte a nota: ");
            nota = new Scanner(System.in).nextInt();
            }
        while(nota<0 || nota>10);
        }
    }

