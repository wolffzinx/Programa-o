package aula31.exemplosabtratos.ExAbstratos;

public class Retangulo extends Figura{
    private double base;
    private double altura;

    public Retangulo(){
        super.setNomeFigura("Retangulo");
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return altura*base;
    }


    @Override
    public double calculaPerimetro() {
        return 2*altura+2*base;
    }
}
