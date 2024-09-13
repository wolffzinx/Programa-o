package aula31.exemplosabtratos.ExAbstratos;

public class Principal {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.setRaio(5);
        System.out.println(c1);

        Retangulo c2 = new Retangulo();
        c2.setAltura(2);
        c2.setBase(4);
        System.out.println(c2);
    }
}
