import javax.swing.*;

public class Butaca {
    protected String nombreBut;
    private long idBut;
    byte cantPatasBut;
    private AsientoButaca asientoButaca;
    private float alturaBut;

    public Butaca() {
        this.asientoButaca = new AsientoButaca();
    }

    public Butaca(String nombreBut, long idBut, byte cantPatasBut, String refAsBut,
                  float anchoAsBut, float diametroAsBut , float alturaBut) {
        this.nombreBut = nombreBut;
        this.idBut = idBut;
        this.cantPatasBut = cantPatasBut;
        this.asientoButaca = new AsientoButaca(refAsBut, anchoAsBut, diametroAsBut);
        this.alturaBut = alturaBut;
    }

    public void mostrarInformacion(){
        JOptionPane.showMessageDialog(null, "Informacion Butaca: "+
                "\n " +
                "\n " +
                "Nombre Producto: " + nombreBut +
                "\nCódigo Producto: " + idBut +
                "\nCantidad de patas: " + cantPatasBut +
                "\nReferencia Asiento: " + asientoButaca.getRefAsBut() +
                "\nAncho Asiento: " + asientoButaca.getAnchoBut() +
                "\nDiametro Asiento: " + asientoButaca.getDiametroBut() +
                "\nRadio Asiento: " + asientoButaca.getRadioAsBut() +
                "\nÁrea Asiento: " + asientoButaca.areaAsBut() +
                "\nVolumen Asiento: " + asientoButaca.volumenAsBut() +
                "\nAltura Producto: " + alturaBut);
    }
}