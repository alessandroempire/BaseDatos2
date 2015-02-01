/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rabais;

import java.util.ArrayList;
import java.util.List; 

/**
 * @Autores:
 * Alessandro La Corte
 * Catherine Lollett 
 * 
 * @Descripcion:
 */
public class Promocion {
    private String       nombre_promocion;
    private String       descripcion_breve;
    private String       descripcion_completa;
    private String       descripcion_adicional;
    private double       monto_original;
    private List<String> palabras_claves; 
    private List<String> pagina_web;
    private int          cantidad_disponible;
    private double       puntaje_total; 
    //imagenes?
    
    //Constructor
    public Promocion(){}
    
    public String get_nombre_promocion(){
        return nombre_promocion;
    }
    
    public void set_nombre_promocion(String nombre_promocion){
        this.nombre_promocion = nombre_promocion;
    }
    
    public String get_descripcion_breve(){
        return descripcion_breve;
    }
    
    public void set_descripcion_breve(String descripcion_breve){
        this.descripcion_breve = descripcion_breve;
    }

    public String get_descripcion_completa(){
        return descripcion_completa;
    }
    
    public void set_descripcion_completa(String descripcion_completa){
        this.descripcion_completa = descripcion_completa;
    }
    
        public String get_descripcion_adicional(){
        return descripcion_adicional;
    }
    
    public void set_descripcion_adicional(String descripcion_adicional){
        this.descripcion_adicional = descripcion_adicional;
    }
    
    public double get_monto_original(){
        return monto_original;
    }
    
    public void set_monto_original(double monto_original){
        this.monto_original = monto_original;
    }
    
    public List<String> get_palabras_claves(){
        return palabras_claves;
    }
    
    public void set_palabras_claves(String palabras_claves){
        if (this.palabras_claves.isEmpty())
            this.palabras_claves = new ArrayList<>();
        
        if (this.palabras_claves.size() > 6)
            System.out.println("No se pueden agregar mas de 6 palabras claves");
        else         
            this.palabras_claves.add(palabras_claves);
    }
    
    public List<String> get_pagina_web(){
        return pagina_web;
    }
    
    public void set_pagina_web(String pagina_web){
        if (this.pagina_web.isEmpty())
            this.pagina_web = new ArrayList<>();
        
        this.pagina_web.add(pagina_web);
    }
    
    public int get_cantidad_disponible(){
        return cantidad_disponible;
    }
    
    public void set_cantidad_disponible(int cantidad_disponible){
        this.cantidad_disponible = cantidad_disponible;
    }
    
    public double get_puntaje_total(){
        return puntaje_total;
    }
    
    public void set_puntaje_total(double puntaje_total){
        this.puntaje_total = puntaje_total;
    }
}