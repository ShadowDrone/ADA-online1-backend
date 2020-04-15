package app;

public class Contenedor {

    private String idContenedor;
    private double pesoContenendor;
    private Puerto puerto;

    public String getIdContenedor() {
        return idContenedor;
    }

    public void setIdContenedor(String idContenedor) {
        this.idContenedor = idContenedor;
    }

    public double getPesoContenendor() {
        return pesoContenendor;
    }

    public void setPesoContenendor(double pesoContenendor) {
        this.pesoContenendor = pesoContenendor;
    }

    public Puerto getPuerto() {
        return puerto;
    }

    public void setPuerto(Puerto puerto) {
        this.puerto = puerto;
    }  

}