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
public class Viaje {
    private Ciudad ciudad_destino;
    
    //Constructor
    public Viaje(){}
    
    //Constructor
    public Viaje(Ciudad ciudad_destino){
        this.ciudad_destino = ciudad_destino;
    }

    public Ciudad getCiudad_destino() {
        return ciudad_destino;
    }

    public void setCiudad_destino(Ciudad ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
    }
}