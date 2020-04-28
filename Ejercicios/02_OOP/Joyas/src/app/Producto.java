
package app;

public abstract class Producto {

    //Codigo Producto
    private int codigo;
    //Nombre producto
    private String nombre;
    //precio Lista
    private double precioLista;
    //pago en efectivo
    private double precioEnEfectivo;



    ///Constructor con los atributos(por ahora puse todos, pero no se deberia estilar poner todos)
    public Producto(int codigo, String nombre, double precioLista, double precioEnEfectivo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioLista = precioLista;
        this.precioEnEfectivo = precioEnEfectivo;
    }

    //Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(double precioLista) {
        this.precioLista = precioLista;
    }

    public double getPrecioEnEfectivo() {
        return precioEnEfectivo;
    }

    public void setPrecioEnEfectivo(double precioEnEfectivo) {
        this.precioEnEfectivo = precioEnEfectivo;
    }


    

}