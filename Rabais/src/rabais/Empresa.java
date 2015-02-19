package rabais;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashSet;
import java.util.Set;

/**
 * @Autores:
 * Alessandro La Corte
 * Catherine Lollett 
 * 
 * @Descripcion:
 */
public class Empresa {
    private String       nombre;
    private String       razon_social;
    private Set<String>  telefonos;
    private Set<String>  correos;
    private int          numero_clientes;
    private Direccion    address; 
    //Asociacion oferta
    private Set<Oferta> oferta = new HashSet<Oferta>();
    
    //Constructor
    public Empresa(){}
    
    //constructor 
    public Empresa(String name, String social, String tlf, String email,
                    int num, Direccion dir){
        nombre          = name;
        razon_social    = social;
        telefonos       = new HashSet<>();
        telefonos.add(tlf);
        correos         = new HashSet<>();
        correos.add(email);
        numero_clientes = num;
        address         = dir;         
    }

    //Getters and Setters 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public Set<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(Set<String> telefonos) {
        this.telefonos = telefonos;
    }

    public Set<String> getCorreos() {
        return correos;
    }

    public void setCorreos(Set<String> correos) {
        this.correos = correos;
    }

    public int getNumero_clientes() {
        return numero_clientes;
    }

    public void setNumero_clientes(int numero_clientes) {
        this.numero_clientes = numero_clientes;
    }

    public Direccion getAddress() {
        return address;
    }

    public void setAddress(Direccion address) {
        this.address = address;
    }

    public Set<Oferta> getOferta() {
        return oferta;
    }

    public void setOferta(Set<Oferta> oferta) {
        this.oferta = oferta;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + 
                ", razon_social=" + razon_social + 
                ", telefonos=" + telefonos + 
                ", correos=" + correos + 
                ", numero_clientes=" + numero_clientes + 
                ", address=" + address + 
                ", oferta=" + oferta + '}';
    }
}