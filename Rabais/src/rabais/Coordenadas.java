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
public class Coordenadas {
    //Atributos
    DMS latitude;
    DMS longitude; 
    
    //Constructor
    public Coordenadas(DMS la, DMS lo){
        latitude  = la;
        longitude = lo;
    }
}
