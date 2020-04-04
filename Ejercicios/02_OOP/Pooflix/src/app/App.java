package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Pooflix miPooflix = new Pooflix();

        System.out.println("Iniciando Catalogo....");

        miPooflix.inicializarCatalogo();

        Serie bb = miPooflix.buscarSerie("The Walking Dead");

        Temporada laMejorTemporada = bb.getTemporada(4);

        Episodio epiDemo;

        int posicion = 0;

        /// En base a un numero de posicion de episodio, obtenerlo de la lista
        System.out.println("Ingrese la posicion");

        posicion = Teclado.nextInt();

        epiDemo = laMejorTemporada.getEpisodioAtPosicion(posicion);

        epiDemo.reproducir();

        // instanceof: devuelve si la variable es de tipo Clase X
        // En este caso, devuelve si epiDemo declarado como Episodio apunta a una clase
        // Websodio
        if (epiDemo instanceof Websodio) {
            System.out.println("Estoy reproduciendo un websodio");

            // (clase): Operador casteo.
            // Casteo lo que hace es acomodar la variable a castear, a una clase especifica
            // da error si no se puede acomodar. por eso siempre se pregunta antes con un
            // instance of
            Websodio webso = (Websodio) epiDemo;
            webso.enviarAlertaDeQueEstaOnline();
        } else
            System.out.println("Estoy reproduciendo un Episodio");

        Episodio elTop;

        elTop = laMejorTemporada.getEpisodio(1);

        elTop.reproducir();

        Episodio otroEpi;

        otroEpi = laMejorTemporada.getEpisodio(9);

        otroEpi.reproducir();

    }

}