package Aula2.exercícios;
//Faça um programa em Java que calcule a área de um círculo

import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Para calcular o circulo digite o raio: ");
        Float raio = ler.nextFloat();
        Float area = (float)Math.PI*(raio*raio);
        System.out.println("A área do seu círculo: "+area);


    }
}
