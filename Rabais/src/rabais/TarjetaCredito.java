package rabais;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 * @Autores:
 * Alessandro La Corte
 * Catherine Lollett 
 * 
 * @Descripcion:
 */
public class TarjetaCredito {
    private String numero;
    private String tarjetahabiente;
    private String tipo; 
    //Asociaciones
    private Usuario usuario; 
    
    //Constructor
    public TarjetaCredito(){}
    
    //Constructor
    public TarjetaCredito(String numero, String tarjetahabiente, String tipo){
        this.numero          = numero;
        this.tarjetahabiente = tarjetahabiente;
        this.tipo            = tipo;
    }
    
    //Getters and setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTarjetahabiente() {
        return tarjetahabiente;
    }

    public void setTarjetahabiente(String tarjetahabiente) {
        this.tarjetahabiente = tarjetahabiente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}