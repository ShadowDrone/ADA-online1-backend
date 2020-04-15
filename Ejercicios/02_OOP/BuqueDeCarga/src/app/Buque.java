package app;

import java.util.ArrayList;
import java.util.List;


public class Buque {

    private List<Contenedor> contenedores = new ArrayList<>();

    /**
     * @return the contenedores
     */
    public List<Contenedor> getContenedores() {
        return contenedores;
    }
    
    /**
     * @param contenedores the contenedores to set
     */
    public void setContenedores(List<Contenedor> contenedores) {
        this.contenedores = contenedores;
    }

    public double calcularPeso(){

        double pesoTotal = 0;

        for (Contenedor contenedor : contenedores) {

            pesoTotal = pesoTotal + contenedor.getPesoContenendor();
            
        }

        return pesoTotal;
    }

    public Contenedor identificarMaximo(){

        double pesoMaximo = 0;
        Contenedor maxContenedor = null;

        for (Contenedor contenedor : contenedores) {

            if (contenedor.getPesoContenendor() > pesoMaximo){
                pesoMaximo = contenedor.getPesoContenendor();
                maxContenedor = contenedor; 
            }            
        }

        return maxContenedor;
    }

    public int contarContenedores(int numeroPuerto){
        int cantidad = 0;

        for (Contenedor contenedor : contenedores) {

            if (contenedor.getPuerto().getNumeroPuerto() == numeroPuerto){
                cantidad++;
            }            

        }

        return cantidad;
    }

}