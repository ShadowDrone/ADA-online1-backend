package app;

public class Brazalete extends Joya {

    public Brazalete(int codigo, String nombre, double precioLista, double precioEnEfectivo, String material) {
        super(codigo, nombre, precioLista, precioEnEfectivo);
        this.material = material;
    }

    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}