package app;

/**
 * Episodio
 */
public class Episodio {

    public int numero;
    public String nombre;
    public double duracion;

    public void reproducir() {
        System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre);
    }
}