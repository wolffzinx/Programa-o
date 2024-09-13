package Aula3_0803;
//n%2==0
import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor:");
        int n = ler.nextInt();
        if(n%2==0)
            System.out.println("Numero par");
        else
            System.out.println("Numero impar");
    }
}
