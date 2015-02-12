/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



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
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }
}