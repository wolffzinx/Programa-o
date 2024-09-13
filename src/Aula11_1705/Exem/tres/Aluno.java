package Aula11_1705.Exem.tres;

public class Aluno {
    String nome;
    String sobrenome;
    String email;
    int codigo;
    float n1;
    float n2;

    float media(){
        return ((n1+n2)/2);
    }

    String verificando(){
        float media  = media();
        if (media>=8)
            return "aprovado";
        else if (media>=6)
            return "recuperação";
        else
            return "reprovado0";
    }

}
