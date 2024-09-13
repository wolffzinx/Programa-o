package Aula3_0803;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] agrs) {
        Scanner ler = new Scanner(System.in);
        System.out.println("digite seu perfil:");
        String perfil = ler.next();

        if (perfil.equals("adimin")) {
            System.out.println("usuário adm");
        } else if (perfil.equals("usuário")) {
            System.out.println("usuário normal");
        } else {
            System.out.println("usuário visitante");
        }
    }
}
