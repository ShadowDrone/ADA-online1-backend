package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Contenido
 */
public class Contenido {

    // Declarar variables de instancia: accesor tipo NombreVariable:

    public String titulo;
    public List<String> premios;
    public Director director;
    public double tiempoVisto;
    public List<Genero> generos = new ArrayList<>();
    public List<Actor> actores = new ArrayList<>();
    public int calificacion;

    public boolean visto() {
        return true;
    }

    public void pausar() {

    }

    public void reproducir() {

    }
}