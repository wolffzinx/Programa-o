package Aula11_1705.Exem.dois;

import Aula11_1705.Exem.um.Pessoa;

public class Teste {
    public static void main(String[]args){
        Lampada lamp1 = new Lampada();
        lamp1.marca = "Philips";
        lamp1.modelo = "Led";
        lamp1.cor = "branca";

        Lampada lamp2 = new Lampada();
        lamp2.marca = "Philips";
        lamp2.modelo = "Branca";
        lamp2.cor = "branca";

        Lampada lamp3 = new Lampada();
        lamp3.marca = "Sansung";
        lamp3.modelo = "Negra";
        lamp3.cor = "rosa";

        Lampada lamp4 = new Lampada();
        lamp4.marca = "apple";
        lamp4.modelo = "Alogena";
        lamp4.cor = "roxa";

        Lampada lamp5 = new Lampada();
        lamp5.marca = "benq";
        lamp5.modelo = "fosca";
        lamp5.cor = "preto";

        lamp1.ligada();
        if(lamp1.estaligada()){
            System.out.println(lamp1.marca+" está ligada");
        }

        lamp2.desligada();
        if(lamp2.estaligada()){
            System.out.println(lamp2.marca+" está desligada");
        }

        lamp3.desligada();
        if(lamp3.estaligada()){
            System.out.println(lamp3.marca+" está desligada");
        }

        lamp4.ligada();
        if(lamp4.estaligada()){
            System.out.println(lamp4.marca+" está ligada");
        }

        lamp5.desligada();
        if(lamp5.estaligada()){
            System.out.println(lamp4.marca+" está desligada");
        }
        //pessoaum.andar();
    }
}
