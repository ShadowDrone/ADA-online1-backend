package ar.com.ada.abmcliente.entities;

import javax.persistence.*;

import ar.com.ada.abmcliente.excepciones.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @Column(name = "cliente_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clienteId;
    private String nombre;
    private int dni;
    private String domicilio;
    @Column(name = "domicilio_alternativo")
    private String domicilioAlternativo;

    public Cliente(String nombre) {
        this.nombre = nombre;

    }

    public Cliente() {
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) throws ClienteDNIException {

        if (dni < 0) {
            // no se ejecuta nada mas despues del throw
            throw new ClienteDNIException(this, "ocurrio un error con el DNI");

        }
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Cliente [dni=" + dni + ", nombre=" + nombre + "]";
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDomicilioAlternativo() {
        return domicilioAlternativo;
    }

    public void setDomicilioAlternativo(String domicilioAlternativo) {
        this.domicilioAlternativo = domicilioAlternativo;
    }

}