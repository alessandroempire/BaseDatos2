/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author alessandro
 */
public class Viaje {
    private Ciudad ciudad_destino;
    private Promocion recomendaciones; 

    //Constructor
    public Viaje(){}
    
    //Constructor
    public Viaje(Ciudad ciudad_destino, Promocion recomendaciones){
        this.ciudad_destino = ciudad_destino;
        this.recomendaciones = recomendaciones;
    }
    
    //Getters y Setters
    public Ciudad getCiudad_destino() {
        return ciudad_destino;
    }

    public void setCiudad_destino(Ciudad ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
    }

    public Promocion getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(Promocion recomendaciones) {
        this.recomendaciones = recomendaciones;
    }
}