package app;

public class Reloj extends Producto implements ISumergible {

    private boolean sumergible;
    private int profundidadMetros;

    public Reloj(int codigo, String nombre, double precioLista, double precioEnEfectivo, boolean sumergible) {
        super(codigo, nombre, precioLista, precioEnEfectivo);
        this.sumergible = sumergible;
    }

    @Override
    public boolean getSumergible() {
        return this.sumergible;
    }

    @Override
    public void setSumergible(boolean sumergible) {
        this.sumergible = sumergible;

    }

    @Override
    public int getProfundidadMetros() {
        return profundidadMetros;
    }

    @Override
    public void setProfundidaMetros(int profundidadMetros) {
        this.profundidadMetros = profundidadMetros;

    }

}