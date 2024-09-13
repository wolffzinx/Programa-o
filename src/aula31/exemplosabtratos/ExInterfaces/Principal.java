package aula31.exemplosabtratos.ExInterfaces;

public class Principal {
    public static void main(String[] args) {
        Vetor v1 = new Vetor(10);
        v1.adiciona("A");
        v1.adiciona("B");
        v1.adiciona("C");
        v1.adiciona("D");
        System.out.println("Qual é o tamanho da lista "+v1.getTamanho());
        System.out.println(v1);
        System.out.println("Removedo o elemento"+v1.remove());
        System.out.println(v1);
    }
}
