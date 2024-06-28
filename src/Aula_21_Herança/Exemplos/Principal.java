package Aula_21_Herança.Exemplos;

public class Principal {
    public static void main(String[] args) {
        Motorista m1= new Motorista("Jonas", "silva",1234,"21");
        Engenheiro e1 = new Engenheiro("jose", "santos", 2345, "123");

        m1.setNome("jonas");
        m1.setSobrenome("silva");
        m1.setMatricula(1234);
        m1.setCnh("21");

        e1.setNome("jose");
        e1.setSobrenome("santos");
        e1.setMatricula(2345);
        e1.setCrea("123");
    }
}
