package Calculadora;

public class Calculadora {
    private float valor1;
    float valor2;

    //Metodos

    public Calculadora() {
    }

    public Calculadora(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public float getValor1() {
        return valor1;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public float suma(){
        float suma;
        suma = this.valor1 + this.valor2;
        return suma;
    }

    public float resta(){
        float resta;
        resta = this.valor1 - this.valor2;
        return resta;
    }

    public float mult(){
        float mult;
        mult = this.valor1 * this.valor2;
        return mult;
    }

    public float div(){
        float div;
        if(this.valor2 != 0){
            return this.valor1/this.valor2;
        }return 0;
    }
}
