package rabais;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author alessandro
 */
public class Articulo {
    private Direccion direccion_envio;    
    private String nombre_enviado;
    private String mensaje;
    private double precio_envio;
    private String detalle_envio; 
    
    //Constructor
    public Articulo(){}
    
    //Constructor
    public Articulo(Direccion direccion_envio, String nombre_enviado, 
                String mensaje, double precio_envio, String descripcion_envio) {
        this.direccion_envio = direccion_envio;
        this.nombre_enviado = nombre_enviado;
        this.mensaje = mensaje;
        this.precio_envio = precio_envio;
        this.detalle_envio = descripcion_envio;
    }

    //Getters y setters
    public Direccion getDireccion_envio() {
        return direccion_envio;
    }

    public void setDireccion_envio(Direccion direccion_envio) {
        this.direccion_envio = direccion_envio;
    }

    public String getNombre_enviado() {
        return nombre_enviado;
    }

    public void setNombre_enviado(String nombre_enviado) {
        this.nombre_enviado = nombre_enviado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public double getPrecio_envio() {
        return precio_envio;
    }

    public void setPrecio_envio(double precio_envio) {
        this.precio_envio = precio_envio;
    }

    public String getDetalle_envio() {
        return detalle_envio;
    }

    public void setDetalle_envio(String detalle_envio) {
        this.detalle_envio = detalle_envio;
    }
}