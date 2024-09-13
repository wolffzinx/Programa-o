package aula32;

public class Main {
    public static void main(String[] args) {
        Lista<String> l1 = new Lista(5);
        l1.adiciona(" A");
        l1.adiciona(" C");
        l1.adiciona(" D");
        l1.adiciona(" E");
        l1.adiciona(" F");
        l1.adiciona(" G");
        System.out.println(l1);
        System.out.println("Obtendo o elemento da posição 2"+ l1.obterElemento(2));
        try{
            System.out.println("Obtendo o elemento da posição 10"+ l1.obterElemento(10));
        }catch (IllegalArgumentException e){
            System.out.println("O elemrnto 10 n exieste na lista");
        }
        System.out.println("Qual a posiccao do 'A' na lista?"+l1.posicaoDe("A"));
        System.out.println("Qual a posiccao do 'a' na lista?"+l1.posicaoDe("a"));
        l1.adiciona(1,"B");
        System.out.println(l1);
        System.out.println("Removendo o elemento da posição1"+l1.remove(1));
        System.out.println(l1);
    }
}
