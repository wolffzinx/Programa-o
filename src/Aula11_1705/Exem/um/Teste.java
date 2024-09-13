package Aula11_1705.Exem.um;

import Aula11_1705.Exem.um.Pessoa;

public class Teste {
    public static void main(String[]args){
        Pessoa pessoaum = new Pessoa();
        pessoaum.nome = "Ana";
        pessoaum.sobrenome = "Silva";
        pessoaum.dataNascimento = "25/05/2000";
        pessoaum.altura = 170;

        Pessoa pessoadois = new Pessoa();
        pessoadois.nome = "João";
        pessoadois.sobrenome = "Souza";
        pessoadois.dataNascimento = "10/03/1999";
        pessoadois.altura = 180;

        System.out.println("Nome completo da pessoa um é: "+pessoaum.nome+" "+pessoaum.sobrenome);

        pessoaum.andar();
        pessoadois.correr();
        pessoadois.falar();
    }

}
