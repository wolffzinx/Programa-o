package exem_contru;

public class Revendedora {
    public static void main(String[]args){
        Carro c1 = new Carro("uno","fiat");
        c1.km = 150000;

        Carro c2 = new Carro();
        c2.montadora = "vw";
        c2.modelo = "fusca";
        c2.km = 200000;

        Carro[] estoque = new Carro[10];
        estoque[0] = new Carro();

        estoque[0]. modelo = "Onix";
        estoque[0]. montadora = "Chevrolet";

        estoque[1] = new Carro ("500", "Fiat");
    }
}
