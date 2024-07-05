package Aula_22.Final;

public class Exemplo1 {
    //declarando uma variavel do tipo final
    final double numero;
    //como n foi definifo um valor no momneto dadeclaração, esse valor deverá ser atribuido até o final do construtor
    //criando uma constante
    // p q funcione ela tem acesso universal -> public
    //exite independente da criaçção instanvcia -> static
    //n pode ser modificada -> final
    public static final double PI = 3.141592653589793;


    public Exemplo1(){
        numero = 10;
    }
}
