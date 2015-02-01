/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rabais;

import java.sql.Date; 
import java.util.ArrayList;
import java.util.List;

/**
 * @Autores:
 * Alessandro La Corte
 * Catherine Lollett 
 * 
 * @Descripcion:
 */
public class Usuario {
    private String           login; 
    private String           password;
    private String           name;
    private String           last_name;
    private Date             birth_date;
    private List<String>     email;                 //1 o mas correos. 
    private int              promocional_money;
    private Coordenadas      coordinates; 
    
    //Constructor
    public Usuario(){}
    
    public Usuario(String log, String pass, String nombre, String apellido,
                    Date fecha, String correo, int dinero, Coordenadas coor){
        login             = log;
        password          = pass;
        name              = nombre;
        last_name         = apellido;
        birth_date        = fecha;
        email             = new ArrayList<>();
        email.add(correo);
        promocional_money = dinero;
        coordinates       = coor; 
    }
    
    public String get_login(){
        return login;
    }
    
    public void set_login(String login){
        this.login = login;
    }
    
    public String get_password(){
        return password;
    }
    
    public void set_passwrod(String password){
        this.password = password; 
    }
    
    public String get_name(){
        return name;
    }
    
    public void set_name(String name){
        this.name = name;
    }
    
    public String get_last_name(){
        return last_name;
    }
    
    public void set_last_name(String last_name){
        this.last_name = last_name;
    }
    
    public Date get_birth_date(){
        return birth_date;
    }
    
    public void set_birth_date(Date birth_date){
        this.birth_date = birth_date;
    }
    
    public List<String> get_email(){
        return email; 
    }
    
    public void set_email(String email){
        if (this.email.isEmpty())
            this.email = new ArrayList<>();
        
        this.email.add(email);
    }
    
    public int get_promocional_money(){
        return promocional_money;
    }
    
    public void set_promocional_money(int promocional_money){
        this.promocional_money = promocional_money;
    }
    
    public Coordenadas get_coordinates(){
        return coordinates;
    }
    
    public void set_coordinates(Coordenadas coordinates){
        this.coordinates = coordinates; 
    }
}