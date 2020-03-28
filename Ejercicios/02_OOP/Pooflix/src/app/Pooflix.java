package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Pooflix
 */
public class Pooflix {

    public List<Pelicula> peliculas = new ArrayList<Pelicula>();
    public List<Serie> series = new ArrayList<Serie>();

    public Serie buscarSerie(String titulo) {

        for (Serie s : this.series) {
            if (s.titulo.equals(titulo))
                return s;
        }
        return null;
    }

    public Pelicula buscarPeli(String titulo) {
        for (Pelicula p : this.peliculas) {
            if (p.titulo.equals(titulo))
                return p;
        }
        return null;
    }

    public void limpiarCatalogo() {
        this.peliculas.clear();
        this.series.clear();
    }

    public void inicializarCatalogo() {
        this.agregarBreakingBad();
        
    }

    public void agregarBreakingBad() {

        Serie breakingB = new Serie();
        breakingB.titulo = "Breaking Bad";

        Genero genero = new Genero();
        genero.nombre = "Drama";
        breakingB.generos.add(genero);

        Temporada t5 = new Temporada();
        t5.numero = 5;

        Episodio ep = new Episodio();

        ep.numero = 7;
        ep.nombre = "Say my name";
        ep.duracion = 43;

        t5.episodios.add(ep);

        Episodio epOtro = new Episodio();

        epOtro.numero = 5;
        epOtro.nombre = "Ozymandias";
        epOtro.duracion = 41;

        t5.episodios.add(epOtro);

        breakingB.temporadas.add(t5);

        this.series.add(breakingB);
    }
}
