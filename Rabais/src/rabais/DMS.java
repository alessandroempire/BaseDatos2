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
    
    //Getters y setters
    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "DMS{" + "degree=" + degree + 
                ", minutes=" + minutes + 
                ", seconds=" + seconds + '}';
    }
}
