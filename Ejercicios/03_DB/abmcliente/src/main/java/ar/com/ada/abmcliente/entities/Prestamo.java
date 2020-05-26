package ar.com.ada.abmcliente.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;


//@Entity indica que esa clase actuara como entidad
//@Table indica a que tabla va a persistirse ese objeto. 
@Entity
@Table(name="prestamo")
public class Prestamo {

    @Id //que es una PK.
    @Column(name="prestamo_id") //Nombre con el que se mapea a la base de datos.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincremental
    private int prestamoId;
    private BigDecimal importe; //En este caso automaticamente se mapea a la columa "importe"
    private Date fecha;
    private int cuotas;
    @Column(name="fecha_alta")
    private Date fechaAlta;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "cliente_id")
    private Cliente cliente;

    public int getPrestamoId() {
        return prestamoId;
    }

    public void setPrestamoId(int prestamoId) {
        this.prestamoId = prestamoId;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente; //ademas de setear el cliente
        this.cliente.getPrestamos().add(this); //agrega el prestamo actual a la lista del cliente
    }

}