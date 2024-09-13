package Aula4_2203;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, n3;
        String resp;

        do{
            System.out.print("Digite n1: ");
            n1 = ler.nextInt();
            System.out.print("Digite n2: ");
            n2 = ler.nextInt();
            System.out.print("Digite n3: ");
            n3 = ler.nextInt();
            float media = (n1+n2+n3)/3;
            System.out.println("Digite 'S' se deseja repetir a operação: ");
            resp = ler.next();
        }
        while ( resp.equals("s"));
    }
}
