package app;

/**
 * Episodio
 */
public class Episodio {

    public int numero;
    public String nombre;
    public double duracion;

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

    public void reproducir() {
        System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre);
    }
}