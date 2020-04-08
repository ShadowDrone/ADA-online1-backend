package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Temporada
 */
public class Temporada {
    public int numero;
    public List<Episodio> episodios = new ArrayList<>();

    /**
     * Obtiene un episodio en base a su numero de episodio
     * 
     * @param nro
     * @return
     */
    public Episodio getEpisodio(int nro) {
        // Recorrer cada episodio
        // Si el nro de episodio del ciclo es igual a "nro"
        // Devolver esa episodio

        for (Episodio epi : this.episodios) {
            if (epi.getNumero() == nro) {
                return epi;
            }

        }

        return null;
    }

    /**
     * Obtiene un episodio en base al nombre (es una sobrecarga del metodo
     * getEpisodio(int nro))
     * 
     * @param nombre
     * @return
     */
    public Episodio getEpisodio(String nombre) {
        // Recorrer cada episodio
        // Si el nombre de episodio del ciclo es igual a "nombre"
        // Devolver esa episodio

        for (Episodio epi : this.episodios) {
            if (epi.getNombre().equalsIgnoreCase(nombre)) {
                return epi;
            }

        }

        return null;
    }

    /**
     * Obtiene un episodio en base a la posicion dentro del ArrayList. Recordar que
     * los arraylist la primer posicion es la 0
     * 
     * @param pos
     * @return
     */
    public Episodio getEpisodioAtPosicion(int pos) {
        return this.episodios.get(pos);
    }

    /**
     * Obtiene el nro de posicion(no el nro de episodio) de un episodio dentro de la
     * lista
     * 
     * @param nro
     * @return
     */
    public int getEpisodioPosition(int nro) {

        int pos = 0;
        for (Episodio epi : this.episodios) {
            if (epi.getNumero() == nro) {
                return pos;
            }
            pos++;
        }
        if (this.episodios.size() == pos)
            return -1;
        return pos;
    }
}