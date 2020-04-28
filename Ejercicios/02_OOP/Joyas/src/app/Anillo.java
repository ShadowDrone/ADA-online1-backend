package app;

public class Anillo extends Joya {

    public Anillo(int codigo, String nombre, double precioLista, double precioEnEfectivo) {
        super(codigo, nombre, precioLista, precioEnEfectivo);
        // TODO Auto-generated constructor stub
    }

    private boolean deAPares;

    public boolean getDeAPares() {
        return deAPares;
    }

    public void setDeAPares(boolean deAPares) {
        this.deAPares = deAPares;
    }


}