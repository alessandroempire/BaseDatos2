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
 * 
 */

public class DMS {
    //Atributos
    private int degree;
    private int minutes;
    private int seconds; 
    
    //Constructor
    public DMS(){}
    
    //Constructor
    public DMS(int d, int m, int s){
        degree  = d;
        minutes = m;
        seconds = s;
    }
    
    public int get_degree(){
        return degree;
    }
    
    public void set_degree(int d){
        this.degree = d;
    }
    
    public int get_minutes(){
        return minutes;
    }
    
    public void set_minutes(int m){
        this.minutes = m;
    }
    
    public int get_seconds(){
        return seconds; 
    }
    
    public void set_seconds(int s){
        this.seconds = s;
    }
}
