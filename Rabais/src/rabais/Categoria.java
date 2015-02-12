package rabais;

import java.util.HashSet;
import java.util.Set;



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
public class Categoria {
    private String nombre; 
    //Asociaciones
    private Set<Promocion> promocion = new HashSet<Promocion>(); 
    
    //Constructor
    public Categoria(){}
    
    //Constructor
    public Categoria(String category){
        nombre = category;
    }
    
    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Promocion> getPromocion() {
        return promocion;
    }

    public void setPromocion(Set<Promocion> promocion) {
        this.promocion = promocion;
    }
}
