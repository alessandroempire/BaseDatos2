/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rabais;

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
    private int[]  codigo_postal;
    
    //Constructor
    public Direccion(){}
    
    //Constructor con todos los argumentos?
    
    public String get_calle(){
        return calle;
    }
    
    public void set_calle(String street){
        this.calle = street;
    }
    
    public String get_urbanizacion(){
        return urbanizacion;
    }
    
    public void set_urbanizacion(String urba){
        this.urbanizacion = urba;
    }
    
    public String get_nombre(){
        return nombre;
    }
    
    public void set_nombre(String name){
        this.nombre = name;
    }
    
    public int get_numero(){
        return numero;
    }
    
    public void set_numero(int n){
        this.numero = n;
    }
    
    public int[] get_codigo_postal(){
        return codigo_postal;
    }
    
    //Nota: codigo se un arreglo de i < 5
    public void set_codigo_postal(int[] codigo){
        this.codigo_postal = new int[codigo.length];
        for(int i = 0; i < 5; i++){
            this.codigo_postal[i] = codigo[i];
        }
    }
}