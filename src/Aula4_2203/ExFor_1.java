package Aula4_2203;

public class ExFor_1 {
    public static void main(String[]args){
        System.out.println("Exemplo 1:");
        for(int i=0;i<10; i++){
            System.out.println(i+" ");
        }
        System.out.println("Exemplo 2;");
        for(int i=0, j=9; i<10 && j>=0;i++,i--){
            System.out.println("i = "+i+",j = "+j);
        }
    }
}
