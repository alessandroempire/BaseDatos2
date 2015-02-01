/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rabais;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List; 

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
    private List<int[]>  telefonos;
    private List<String> correos;
    private int          numero_clientes;
    private Direccion    address; 
    
    //Constructor
    public Empresa(){}
    
    //constructor 
    public Empresa(String name, String social, int[] tlf, String email,
                    int num, Direccion dir){
        nombre = name;
        razon_social = social;
        telefonos = new ArrayList<>();
        telefonos.add(Arrays.copyOf(tlf, tlf.length));
        correos = new ArrayList<>();
        correos.add(email);
        numero_clientes = num;
        address = dir;         
    }
    
    public String get_nombre(){
        return nombre;
    }
    
    public void set_nombre(String name){
        this.nombre = name;
    }
    
    public String get_razon_social(){
        return razon_social;
    }
    
    public void set_razon_social(String razon_social){
        this.razon_social = razon_social; 
    }
    
    public List<int[]> get_telefonos(){
        return telefonos;
    }
    
    public void set_telefonos(int[] tlf){
        if (this.telefonos.isEmpty())
            this.telefonos = new ArrayList<>();
        
        this.telefonos.add(Arrays.copyOf(tlf, tlf.length));
    }
    
    public List<String> get_correos(){
        return correos;
    }
    
    public void set_correos(String email){
        if (this.correos.isEmpty())
            this.correos = new ArrayList<>();
        
        this.correos.add(email);
    }
    
    public int get_numero_clientes(){
        return numero_clientes;
    }
    
    public void set_numero_clientes(int n){
        this.numero_clientes = n;
    }
    
    public Direccion get_address(){
        return address;
    }
    
    public void set_address(Direccion dir){
        this.address = dir; 
    }
}