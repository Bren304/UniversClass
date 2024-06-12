package Herencia;

public class Circulo extends FigurasGeometricas{
    //Atributos
    private double radio;

    //Metodos

    public Circulo() {
    }

    public Circulo(String nombre, byte cantLados,double radio) {
        super(nombre, cantLados); //Los atributos de la clase padre van primero
        this.radio = radio;
    }

    @Override
    public double areaFigura(){
        return Math.PI * Math.pow(this.radio, 2);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
