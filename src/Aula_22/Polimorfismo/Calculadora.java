package Aula_22.Polimorfismo;

public class Calculadora {
    public static void main(String[] args) {
        Operacoes op = new Operacoes();
        System.out.println("Somando dois numeros: "+op.soma(5,6));
        System.out.println("Somando três numeros: "+op.soma(6,7,1));
        System.out.println("Soamndo duas Strings: "+op.soma("Palavra","casa"));
    }
}
