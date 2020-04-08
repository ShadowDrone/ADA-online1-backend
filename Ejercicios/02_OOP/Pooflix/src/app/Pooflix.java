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
        agregarWalkingDead();

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

        ep.setNumero(7);
        ep.setNombre("Say my name");
        ep.setDuracion(43);

        t5.episodios.add(ep);

        Episodio epOtro = new Episodio();

        epOtro.setNumero(5);
        epOtro.setNombre("Ozymandias");
        epOtro.setDuracion(41);

        t5.episodios.add(epOtro);

        breakingB.temporadas.add(t5);

        this.series.add(breakingB);
    }

    public void agregarWalkingDead() {

        Serie theWalkingDead = new Serie();

        theWalkingDead.titulo = "The Walking Dead";

        Serie theWD2 = theWalkingDead;

        // theWD2.titulo = "hOLA MANOTAS";

        Genero genero = new Genero();

        genero.nombre = "post-apocaliptica";

        theWalkingDead.generos.add(genero);

        Temporada t4 = new Temporada();
        t4.numero = 4;

        // AGrego un websodio
        Websodio websodio = new Websodio(1, "A new Day");

        websodio.setNumero(1);
        websodio.setNombre("A New Day");
        websodio.setDuracion(20);

        websodio.url = "http.//jajaj.com";
        t4.episodios.add(websodio);

        websodio = new Websodio(2, "Alone");

        websodio.setDuracion(20);
        websodio.url = "http.//jajaja.com";

        t4.episodios.add(websodio);

        Episodio epii = new Episodio(8, "Too Far Gone", 43);

        t4.episodios.add(epii);

        Episodio epiii = new Episodio(9, "After", 43);

        t4.episodios.add(epiii);

        theWalkingDead.temporadas.add(t4);

        Temporada t7 = new Temporada();

        t7.numero = 7;

        Episodio epp = new Episodio(1, "The Day Will Come When You Won't Be");

        // epp.numero = 1;
        // epp.nombre = "The Day Will Come When You Won't Be";
        epp.setDuracion(45);

        t7.episodios.add(epp);
        Episodio eppp = new Episodio();

        eppp.setNumero(3);
        eppp.setNombre("The Cell");
        eppp.setDuracion(43);

        t7.episodios.add(eppp);
        theWalkingDead.temporadas.add(t7);

        this.series.add(theWalkingDead);

    }
}
