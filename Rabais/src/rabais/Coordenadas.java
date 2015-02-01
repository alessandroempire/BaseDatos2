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
public class Coordenadas {
    //Atributos
    private DMS latitude;
    private DMS longitude; 
    
    //Constructor
    public Coordenadas(){}
    
    //Constructor
    public Coordenadas(DMS la, DMS lo){
        latitude  = la;
        longitude = lo;
    }
    
    public DMS get_latitud(){
        return latitude;
    }
    
    public void set_latitud(DMS la){
        this.latitude = la;
    }
    
    public DMS get_longitude(){
        return longitude;
    }
    
    public void set_longitude(DMS lo){
        this.longitude = lo;
    }
}