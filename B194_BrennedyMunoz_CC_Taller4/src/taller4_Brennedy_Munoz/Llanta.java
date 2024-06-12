package taller4_Brennedy_Munoz;

import java.sql.SQLOutput;

public class Llanta {
    //Entradas
    protected String fabricante;
    private float alto, ancho, rin;

    //Metodos

    public Llanta() {
    }

    public Llanta(String fabricante, float alto, float ancho, float rin) {
        this.fabricante = fabricante;
        this.alto = alto;
        this.ancho = ancho;
        this.rin = rin;
    }

    public String informacionLlanta(){
        String informacion = "Fabricante: " + fabricante +
                "\nalto: " + alto +
                "\nancho: " + ancho +
                "\nrin: " + rin;
        return informacion;
    }
}
