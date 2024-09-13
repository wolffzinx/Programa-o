package Aula3_0803.Exemplo_Switch_Case;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] agrs){
        Scanner ler = new Scanner(System.in);
        System.out.println("Diigte seu perfil: ");
        String perfil = ler.next();
        switch (perfil){
            case "admin"-> System.out.println("Usuário administrador ");
            case "usuario"-> System.out.println("Usuário padrão ");
            default -> System.out.println("Usuário Inválido");
        }
    }
}
