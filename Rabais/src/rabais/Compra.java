/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rabais;

import java.util.HashSet;
import java.util.Set;

/**
 * @Autores:
 * Alessandro La Corte
 * Catherine Lollett 
 * 
 * @Descripcion:
 */
public class Compra {
    private long id;
    private int cantidad;
    //asociacion con usuario
    Set<Usuario> compradores = new HashSet();
    //asociaion con promocion
    Promocion promocion;

    //Constructor 
    public Compra() {
    }
    
    //contructor
    public Compra(long id, int cantidad, Promocion promocion) {
        this.id = id;
        this.cantidad = cantidad;
        this.promocion = promocion;
    }
    
    //Getters y Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Set<Usuario> getCompradores() {
        return compradores;
    }

    public void setCompradores(Set<Usuario> compradores) {
        this.compradores = compradores;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }
    
}
