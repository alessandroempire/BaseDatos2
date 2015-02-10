/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rabais;

/**
 *
 * @author alessandro
 */
public class Ciudad {
    private String nombre;
    private String estado;
    private String pais;
    private Coordenadas coordenadas;
    
    //Constructor
    public Ciudad(){}
    
    //Constrcutor
    public Ciudad(String nombre, String estado, String pais, 
                    Coordenadas coordenadas){
        this.nombre      = nombre;
        this.estado      = estado;
        this.pais        = pais;
        this.coordenadas = coordenadas;
    }

    public String get_nombre(){
        return nombre;
    }
    
    public void set_nombre(String nombre){
        this.nombre = nombre;
    }
    
    public String get_estado(){
        return estado;
    }
    
    public void set_estado(String estado){
        this.estado = estado;
    }
    
    public String get_pais(){
        return pais;
    }
    
    public void set_pais(String pais){
        this.pais = pais;
    }
    
    public Coordenadas get_coordenadas(){
        return coordenadas;
    }
    
    public void set_coordenadas(Coordenadas coordenadas){
        this.coordenadas = coordenadas;
    }
}