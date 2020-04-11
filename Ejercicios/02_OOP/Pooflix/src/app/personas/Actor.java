package app.personas;

import app.INominable;

/**
 * Actor
 */
public class Actor extends Persona implements INominable {

    public String nivel;

    @Override
    public boolean ganoPreviamente() {
        if (this.nombre.equals("Leonardo Di Caprio"))
            return true;
        return false;
    }

    @Override
    public void reproducirTrailerNominacion() {
        // TODO Auto-generated method stub
        System.out.println("Aca reproducimos todas las scenas donde este el actor");
    }
}