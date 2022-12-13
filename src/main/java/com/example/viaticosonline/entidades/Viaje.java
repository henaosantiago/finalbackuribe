package com.example.viaticosonline.entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name="viajes")
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="destino")
    private String destino;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="fechainicio")
    private String fechaInicio;

    @Column(name="fechafin")
    private String fechaFin;

    @Column(name="gastospasajes")
    private Double gastosPasajes;

    @Column(name="gastotransporte")
    private Double gastosTransporte;

    @Column(name="gastosalimentacion")
    private Double gastosAlimentacion;

    @ManyToOne(optional = false)
    @JoinColumn(name="fk_viaje",referencedColumnName = "id")
    @JsonBackReference
    private Empleado empleado;


    public Viaje() {
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getGastosPasajes() {
        return gastosPasajes;
    }

    public void setGastosPasajes(Double gastosPasajes) {
        this.gastosPasajes = gastosPasajes;
    }

    public Double getGastosTransporte() {
        return gastosTransporte;
    }

    public void setGastosTransporte(Double gastosTransporte) {
        this.gastosTransporte = gastosTransporte;
    }

    public Double getGastosAlimentacion() {
        return gastosAlimentacion;
    }

    public void setGastosAlimentacion(Double gastosAlimentacion) {
        this.gastosAlimentacion = gastosAlimentacion;
    }
}
