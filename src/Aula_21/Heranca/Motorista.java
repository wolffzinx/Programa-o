package Aula_21.Heranca;

public class Motorista extends Funcionario {
    private String cnh;

    public Motorista (String nome, String sobrenome, int matricula, String cnh){
        super(nome, sobrenome, matricula);
    }


    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
