package Aula4_2203;

import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int cont=0; //inicia em 0
        while (cont <= 10) {
            System.out.print(cont+"");
            cont++; //para incerar o código
        }
    }
}
