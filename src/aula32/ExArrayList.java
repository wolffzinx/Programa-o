package aula32;

import java.util.ArrayList;

public class ExArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(10);
        lista.add("A");
        //lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("F");
        lista.add("G");
        System.out.println(lista);
        lista.add(1, "B");
        System.out.println(lista);
        if (lista.contains("A")) {
            System.out.println("O elemento A existe na lista");
        } else {
            System.out.println("Elemnto n existe na lista");
        }
        System.out.println("Apodicao do elemento 'c' na lista"+lista.indexOf("C"));
        lista.add("C");
        System.out.println(lista);
        System.out.println("Aultima posicao de 'c' na lista"+lista.lastIndexOf("C"));
        System.out.println("removendp elemento"+lista.remove(1));
        System.out.println("removendo o elemento"+lista.remove("D"));

        System.out.println("obtendo o elemento"+lista.get(2));
        System.out.println("o tamanho da lista é "+lista.size());
        lista.clear();
        System.out.println(lista);
        System.out.println("A lista está vazia? "+ lista.isEmpty());

    }
}
