package Aula3_0803;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite valor");
        int v1 = ler.nextInt();
        System.out.println("Digite valor 2");
        int v2 = ler.nextInt();
        System.out.println("Digite 1 para soma, 2 para subtração, 3 para multiolicar, 4 para dividir");
        int opc = ler.nextInt();
        if( opc == 1) {
            int som = v1 + v2;
            System.out.println("A soma deu " + som);
        }
        else if( opc == 2) {
            int sub = v1 - v2;
            System.out.println("A subtração deu " + sub);
        }
        else if( opc == 3) {
            int mul = v1 * v2;
            System.out.println("A subtração deu " + mul);
        }
        else if( opc == 4) {
            int div = v1 / v2;
            System.out.println("A subtração deu " + div);
        }
    }
}
