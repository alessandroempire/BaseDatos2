package rabais;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @Autores:
 * Alessandro La Corte
 * Catherine Lollett 
 * 
 * @Descripcion:
 */
public class Oferta {
    private Date      fecha_publicacion;
    private int       cantidad;
    private double    monto_ofertado;
    private int       porcentaje_descuento;
    private Set<Date> fecha_de_vigencia;

    //constructor
    public Oferta(){}
    
    //Constructor
    public Oferta(Date fecha_publicacion, int cantidad, double monto_ofertado,
                    int porcentaje_descuento, Date fecha_de_vigencia){
        this.fecha_publicacion    = fecha_publicacion;
        this.cantidad             = cantidad;
        this.monto_ofertado       = monto_ofertado;
        this.porcentaje_descuento = porcentaje_descuento;
        this.fecha_de_vigencia    = new HashSet<>();
        this.fecha_de_vigencia.add(fecha_de_vigencia);
    }
    
    //Getters y Setters
    public Date getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(Date fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getMonto_ofertado() {
        return monto_ofertado;
    }

    public void setMonto_ofertado(double monto_ofertado) {
        this.monto_ofertado = monto_ofertado;
    }

    public int getPorcentaje_descuento() {
        return porcentaje_descuento;
    }

    public void setPorcentaje_descuento(int porcentaje_descuento) {
        this.porcentaje_descuento = porcentaje_descuento;
    }

    public Set<Date> getFecha_de_vigencia() {
        return fecha_de_vigencia;
    }

    public void setFecha_de_vigencia(Set<Date> fecha_de_vigencia) {
        this.fecha_de_vigencia = fecha_de_vigencia;
    }
}
