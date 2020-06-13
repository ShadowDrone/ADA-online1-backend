package ar.com.ada.api.creditos.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "prestamo")
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
    @Column(name = "estado_id")
    private int estadoId; // Por ahora vamos a crear este como int
    
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

    public EstadoPrestamoEnum getEstadoId() {

        return EstadoPrestamoEnum.parse(this.estadoId);
    }

    public void setEstadoId(EstadoPrestamoEnum estadoId) {
        this.estadoId = estadoId.getValue();
    }

    public enum EstadoPrestamoEnum {
        SOLICITADO(1), 
        RECHAZADO(2),
        PENDIENTE_APROBACION(3),
        APROBADO(4),
        PREAPROBADO(100);

        private final int value;

        // NOTE: Enum constructor tiene que estar en privado
        private EstadoPrestamoEnum(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static EstadoPrestamoEnum parse(int id) {
            EstadoPrestamoEnum status = null; // Default
            for (EstadoPrestamoEnum item : EstadoPrestamoEnum.values()) {
                if (item.getValue() == id) {
                    status = item;
                    break;
                }
            }
            return status;
        }
    }


}
