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
    
    //Getters y setters
    public DMS getLatitude() {
        return latitude;
    }

    public void setLatitude(DMS latitude) {
        this.latitude = latitude;
    }

    public DMS getLongitude() {
        return longitude;
    }

    public void setLongitude(DMS longitude) {
        this.longitude = longitude;
    }
}