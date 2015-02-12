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
    
    //Asociacion posee_categoria
    private Set<Promocion> promocion = new HashSet<Promocion>(); 
    
    //Asosiacion posee_subcategoria
        //El rol de categoria (una subcategoria tiene una categoria)
    private Categoria super_categoria;
        //El rol de subcategoria (una categoria tiene varias subcategorias)
    private Set<Categoria> sub_categorias = new HashSet<Categoria>();
    
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

    public Categoria getSuper_categoria() {
        return super_categoria;
    }

    public void setSuper_categoria(Categoria super_categoria) {
        this.super_categoria = super_categoria;
    }

    public Set<Categoria> getSub_categorias() {
        return sub_categorias;
    }

    public void setSub_categorias(Set<Categoria> sub_categorias) {
        this.sub_categorias = sub_categorias;
    }
    
}
