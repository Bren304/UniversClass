public class AsientoButaca {
    protected String refAsBut;
    private float anchoBut, diametroBut, radioAsBut;

    public AsientoButaca() {
    }

    public AsientoButaca(String refAsBut, float anchoBut, float diametroBut) {
        this.refAsBut = refAsBut;
        this.anchoBut = anchoBut;
        this.diametroBut = diametroBut;
    }

    public float areaAsBut(){
        float area;
        area = (float)(Math.pow((diametroBut/2), 2)*Math.PI);
        return area;
    }

    public float volumenAsBut(){
        float vol;
        vol = (float)(Math.pow((diametroBut/2), 2)*Math.PI*this.anchoBut);
        return vol;
    }
    public String informacionAsBut(){
        String informacion;
        informacion = "Ancho Asiento: " + anchoBut +
                "\nDiametro asiento: " + diametroBut +
                "\nRadio Asiento: " + radioAsBut +
                "\nÁrea Asiento: " + areaAsBut() +
                "\nVolumen Asiento: " + volumenAsBut();
        return informacion;
    }

    public String getRefAsBut() {
        return refAsBut;
    }

    public void setRefAsBut(String refAsBut) {
        this.refAsBut = refAsBut;
    }

    public float getAnchoBut() {
        return anchoBut;
    }

    public void setAnchoBut(float anchoBut) {
        this.anchoBut = anchoBut;
    }

    public float getDiametroBut() {
        return diametroBut;
    }

    public void setDiametroBut(float diametroBut) {
        this.diametroBut = diametroBut;
    }

    public float getRadioAsBut() {
        return radioAsBut;
    }

    public void setRadioAsBut(float radioAsBut) {
        this.radioAsBut = radioAsBut;
    }
}