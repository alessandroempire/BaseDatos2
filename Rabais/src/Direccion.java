/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Arrays;

/**
 * @Autores:
 * Alessandro La Corte
 * Catherine Lollett 
 * 
 * @Descripcion:
 */
public class Direccion {
    private String calle;
    private String urbanizacion;
    private String nombre;
    private int    numero;
    private String codigo_postal;
    
    //Constructor
    public Direccion(){}
    
    //Constructor con todos los argumentos
    public Direccion(String calle, String urbanizacion, String nombre,
                        int numero, String codigo_postal){
        this.calle = calle;
        this.urbanizacion = urbanizacion;
        this.nombre = nombre;
        this.numero = numero;
        this.codigo_postal = codigo_postal;
    }
    
    //Getters and Setters
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getUrbanizacion() {
        return urbanizacion;
    }

    public void setUrbanizacion(String urbanizacion) {
        this.urbanizacion = urbanizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
    
}