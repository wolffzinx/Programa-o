package Aula_22.Polimorfismo;

public class Aluno extends Pessoa{
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String obterDados() {
        return "Nome: "+getNome()+" "+getSobrenome()+" Matricula: "+matricula;
    }
}
