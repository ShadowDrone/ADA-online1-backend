package app;

/**
 * Peli
 */
public class Pelicula extends Contenido implements INominable {
    public boolean filmadaEnImax;

    @Override
    public boolean ganoPreviamente(){
        //aca va la logica

        return true;
    }

    @Override
    public void reproducirTrailerNominacion() {
        System.out.println("Aca van los avances de la pelicula");
    }

}