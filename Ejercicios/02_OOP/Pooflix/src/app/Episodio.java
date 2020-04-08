package app;

/**
 * Episodio
 */
public class Episodio {

    public Episodio() {
        this.duracion = 40;
    }

    public Episodio(int numero, String nombre, double duracion) {

        this.numero = numero;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Episodio(int numero, String nombre) {

        this();
        this.numero = numero;
        this.nombre = nombre;

    }

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private double duracion;

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void reproducir() {
        System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre);
    }

}