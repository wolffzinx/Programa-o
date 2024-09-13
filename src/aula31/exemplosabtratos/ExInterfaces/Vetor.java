package aula31.exemplosabtratos.ExInterfaces;

public class Vetor implements Lista{
    private String [] elementos;
    private int tamanho;

    public Vetor (int capacidade){
        elementos = new String[capacidade];
        tamanho = 0;
    }

    @Override
    public void adiciona (String elemento){
        elementos[tamanho] = elemento;
        tamanho++;
    }



    @Override
    public String remove() {
        if (tamanho>0){
            return elementos[--tamanho];
        }
        return null;
    }
    public int getTamanho(){
        return tamanho;
    }

    @Override
    public String toString(){
        String resultado = "[";
        if (tamanho>0){
            for(int i=0; i<tamanho-1;i++){
                resultado+=elementos[i]+", ";
            }
            resultado+=elementos[tamanho-1];

        }
        resultado+="]";
        return resultado;
    }
}
