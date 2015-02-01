/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rabais;

import java.util.Arrays;

/**
 * @Autores:
 * Alessandro La Corte
 * Catherine Lollett 
 * 
 * @Descripcion:
 */
public class TarjetaCredito {
    private int[] numero;
    private String tarjetahabiente;
    private String tipo; 
    
    //Constructor
    public TarjetaCredito(){}
    
    public int[] get_numero(){
        return numero;
    }
    
    public void set_numero(int[] num){
        this.numero = Arrays.copyOf(num, num.length);
    }
    
    public String get_tarjetahabiente(){
        return tarjetahabiente;
    }
    
    public void set_tarjetahabiente(String tarjetahabiente){
        this.tarjetahabiente = tarjetahabiente;
    }
    
    public String get_tipo(){
        return tipo;
    }
    
    public void set_tipo(String tipo){
        this.tipo = tipo;
    }
}