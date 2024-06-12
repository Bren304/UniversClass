package taller4_Brennedy_Munoz;

public class Cliente {
    //Entradas
    private String nombre, apellido, email;
    private char genero;
    private int cc;
    private long celular;

    //Metodos

    public Cliente() {
    }
    public Cliente(String nombre, String apellido, String email, char genero, int cc,
                   long celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
        this.cc = cc;
        this.celular = celular;
    }

    public String informacionCliente(){
        String informacion = "Nombre: " + nombre + "\nApellido: " + apellido +
                "\nEmail: " + email + "\nGenero: " + genero + "\nCC: " + cc +
                "\nCelular: " + celular;
        return informacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }
}
