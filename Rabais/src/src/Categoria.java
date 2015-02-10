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
public class Categoria {
    private String nombre; 
    
    //Constructor
    public Categoria(){}
    
    //Constructor
    public Categoria(String category){
        nombre = category;
    }
    
    public String get_Nombre(){
        return nombre; 
    }
    
    public void set_Nombre(String name){
        this.nombre = name; 
    }
}
