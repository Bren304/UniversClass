package Calculadora;

import javax.swing.*;

public class Main_cal {
    public static void main(String[] args) {
        //Declarar e insertar
        Calculadora cal1 = new Calculadora();
        cal1.setValor1(4.4f);
        cal1.valor2 = 6.6F;
        //cal1.setValor2(6.6f);
        System.out.println("Suma = " + cal1.suma());
        System.out.println("Resta = " + cal1.resta());
        System.out.println("Mult = " + cal1.mult());
        System.out.println("Div = " + cal1.div());

        JOptionPane.showMessageDialog(null, "Resultado calculadora"+
                "\nvalor1: " + cal1.getValor1() +
                "\nvalor2: " + cal1.valor2 +
                "\nsuma: " + cal1.suma() +
                "\nresta: " + cal1.resta() +
                "\nmultipicación: " + cal1.mult() +
                "\ndivisión: " + cal1.div()
        );

        float v1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el val. 1"));
        float v2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el val. 2"));
        Calculadora cal2 = new Calculadora(v1, v2);

        JOptionPane.showMessageDialog(null, "Obj cal2: " + cal2 +
                "\nResultado calculadora"+
                "\nvalor1: " + cal2.getValor1() +
                "\nvalor2: " + cal2.valor2 +
                "\nsuma: " + cal2.suma() +
                "\nresta: " + cal2.resta() +
                "\nmultipicación: " + cal2.mult() +
                "\ndivisión: " + cal2.div()
        );
    }
}
