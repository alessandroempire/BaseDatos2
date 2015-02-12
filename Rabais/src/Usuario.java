/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Date; 
import java.util.HashSet;
import java.util.Set;

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
    private Set<String>      email;                 //1 o mas correos. 
    private int              promotional_money;
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
        email             = new HashSet<>();
        email.add(correo);
        promotional_money = dinero;
        coordinates       = coor; 
    }
    
    //Getters y Setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public Set<String> getEmail() {
        return email;
    }

    public void setEmail(Set<String> email) {
        this.email = email;
    }

    public int getPromotional_money() {
        return promotional_money;
    }

    public void setPromotional_money(int promotional_money) {
        this.promotional_money = promotional_money;
    }

    public Coordenadas getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordenadas coordinates) {
        this.coordinates = coordinates;
    }
}