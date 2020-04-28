package app;

import java.util.ArrayList;
import java.util.List;

public class ECommerce {

    private List<Producto> catalogoDeProductos = new ArrayList();

    public void inicializarCatalogo() {

        Brazalete brazalete = new Brazalete(1, "Brazalete Oro", 20, 18, "Oro");

        catalogoDeProductos.add(brazalete);

        brazalete = new Brazalete(2, "Brazalete Plata", 15, 13, "Plata");

        catalogoDeProductos.add(brazalete);

        Anillo anillo = new Anillo(3, "Anillo de Promocion", 10, 8);
        // este se vende individual
        anillo.setDeAPares(false);

        catalogoDeProductos.add(anillo);

        anillo = new Anillo(3, "Anillo de Bodas", 34, 30);
        // Este se vende de a pares si o si
        anillo.setDeAPares(true);

        catalogoDeProductos.add(anillo);

        Reloj reloj = new Reloj(50, "Reloj sumergible CASIO", 30, 25, true);

        // 3Metros de profundidad.

        reloj.setProfundidaMetros(3);

        catalogoDeProductos.add(reloj);

        reloj = new Reloj(52, "Reloj sumergible SEIKO", 30, 25, true);

        // 3Metros de profundidad.
        reloj.setProfundidaMetros(5);

        catalogoDeProductos.add(reloj);

        reloj = new Reloj(60, "ROLEX ORO", 1000, 1000, false);

        catalogoDeProductos.add(reloj);

    }

    public List<Reloj> obtenerCatalogoRelojes() {

        // Con isntanceof, detecto el tipo de producto y si es un reloj
        // genero una lista con solo esos elementos

        List<Reloj> soloRelojes = new ArrayList();

        /// Recorro el catalogo de productos
        // y pregunto de que tipo es cada uno
        // si es de un tipo X lo casteo, para poder agregarlo a la lista
        // ya que a la lista hay que agregarlo como Reloj y no como Producto
        for (Producto producto : this.catalogoDeProductos) {
            if (producto instanceof Reloj) {
                Reloj reloj = (Reloj) producto; // Lo tengo que castear porque necesito tenerlo como reloj para
                                                // agregarlo a la lista
                soloRelojes.add(reloj);
            }
        }
        return soloRelojes;
    }

    public List<Anillo> obtenerCatalogoAnillos() {
        // Con isntanceof, detecto el tipo de producto y si es un reloj
        // genero una lista con solo esos elementos

        List<Anillo> soloAnillos = new ArrayList();

        /// Recorro el catalogo de productos
        // y pregunto de que tipo es cada uno
        // si es de un tipo X lo casteo, para poder agregarlo a la lista
        // ya que a la lista hay que agregarlo como Anillo y no como Producto
        for (Producto producto : this.catalogoDeProductos) {
            if (producto instanceof Anillo) {
                Anillo anillo = (Anillo) producto; // Lo tengo que castear porque necesito tenerlo como reloj para
                                                   // agregarlo a la lista
                soloAnillos.add(anillo);
            }
        }
        return soloAnillos;
    }

    /***
     * Imprimo catalogo completo, pero en los casos de Anillos ademas imprimo si se
     * vende de a pares y en el caso de relojes imprimo si es sumergible y si lo es,
     * la profundidad.
     */
    public void imprimeCatalogo() {

        System.out.println("===================================================");
        // Necesito un FOR porque tengo que recorrerr los productos
        for (Producto producto : catalogoDeProductos) {

            System.out.print(producto.getCodigo() + " - ");
            System.out.print(producto.getNombre() + " ");

            // Aca voy a mostrar el instanceof de 2 maneras
            // Una es casteando en una variable (para Anillos)
            // y la otra es directamente sin variable intermedia
            // usando parentesis

            // Anillo: pregunto primero si es una anillo
            // usando casteo intermedio en una variable(anillo)
            if (producto instanceof Anillo) {
                // Lo casteo a una variable, porque si no el compilador de java llora(esa es la
                // razon real)

                Anillo anillo = (Anillo) producto;

                // La unica forma de acceder al metodo getDeAPares() es casteaando previamente
                // (linea de arriba: anillo = (Anillo)producto;
                if (anillo.getDeAPares()) {
                    System.out.print("(**Se vende de a pares**)");
                }
                // Si no no imprime nada
            }

            if (producto instanceof Reloj) {

                // La unica forma de acceder al metodo getDeAPares() es casteaando previamente
                // Aca voy a castear INLINE (o sea, en linea)
                // y luego del casteo, llamo al metodo
                if (((Reloj) producto).getSumergible()) {
                    System.out.print("(" + ((Reloj) producto).getProfundidadMetros() + "mts)");
                }
                // ((Reloj)producto) -> eso se tranforma en un reloj
                // .getSumergible() -> a lo anterior, que estaba casteado como reloj se llama el
                // metodo
                //Los parentesis son importantes, porque dicen que se evalua primero
                //de izq a derecha
                
            }

            System.out.print(" Precio: ");
            System.out.print(producto.getPrecioLista());
            System.out.println();
        }
        System.out.println("===================================================");

    }

}