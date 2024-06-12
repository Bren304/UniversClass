package Herencia;

import javax.swing.*;

public class Main_Herencia {
    public static void main(String[] args) {
        //Declarar objetos de las clases del diagrama
        FigurasGeometricas fig = new Cuadrado();
        JOptionPane.showMessageDialog(null, "Figura: " + fig +
        "\nNombre: " + fig.getNombre() +
                "\nCantidad de lados: " + fig.getCantLados() +
                "\nArea: " + fig.areaFigura());

        System.out.println("-----------");
        Cuadrado cuad1 = new Cuadrado("Square", (byte) 4, 6.1f);
        JOptionPane.showMessageDialog(null, "Figura: " + cuad1 +
                "\nNombre: " + cuad1.getNombre() +
                "\nCantidad de lados: " + cuad1.getCantLados() +
                "\nArea: " + cuad1.areaFigura());
    }
}
