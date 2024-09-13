package Aula11_1705.Exem.dois;

public class Lampada {
    String marca;
    String modelo;
    String cor;
    boolean estaligada;

    void ligada(){
        estaligada = true;
    }

    void desligada(){
        estaligada = false;
    }

    boolean estaligada(){
        return estaligada;
    }
}
