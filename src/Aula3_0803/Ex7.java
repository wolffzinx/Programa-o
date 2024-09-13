package Aula3_0803;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println(" 1 de celsius para farenheit, 2 de farenheit para celsius");
        int opc = ler.nextInt();
        if (opc == 1){
            System.out.println("Qual a temp em fareheit");
            Float fh = ler.nextFloat();
            Float tempF = (fh - 32)/ (float)1.8;
            System.out.println("A temp em fareheit "+tempF);
        }
        else if(opc == 2){
            System.out.println("Qual a temp em celsius");
            Float ce = ler.nextFloat();
            Float tempC = (float)1.8* ce + 32;
            System.out.println("A temp em fareheit "+tempC);
        }
        else
            System.out.println("Vamo grêmio");
    }
}
