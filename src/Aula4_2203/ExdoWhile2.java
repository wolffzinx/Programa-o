package Aula4_2203;

public class ExdoWhile2 {
    public static void main(String[]args){
        int cont = 10;
        while(cont<10){
            System.out.println(cont+" ");
            cont++;
        }
        do {
            System.out.println(cont+" ");
            cont++;
        }
        while(cont<10);
    }

}
