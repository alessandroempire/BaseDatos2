package rabais;

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
    
    //Asociacion posee_tarjeta
    private Set<TarjetaCredito> tarjetas = new HashSet<TarjetaCredito>(); 
    //Asociacion compra
    private Set<Promocion> promociones_compradas = new HashSet<Promocion>(); 
    //Asociacion posee_amigo (self join)
    private Set<Usuario> tiene_amigo = new HashSet<Usuario>();
    private Set<Usuario> es_amigo = new HashSet<Usuario>();
    //Asocicacion compra con clase asociacion
    private Set<Compra> compra = new HashSet<Compra>();
    
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

    public Set<TarjetaCredito> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(Set<TarjetaCredito> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public Set<Promocion> getPromociones_compradas() {
        return promociones_compradas;
    }

    public void setPromociones_compradas(Set<Promocion> promociones_compradas) {
        this.promociones_compradas = promociones_compradas;
    }

    public Set<Usuario> getTiene_amigo() {
        return tiene_amigo;
    }

    public void setTiene_amigo(Set<Usuario> tiene_amigo) {
        this.tiene_amigo = tiene_amigo;
    }

    public Set<Usuario> getEs_amigo() {
        return es_amigo;
    }

    public void setEs_amigo(Set<Usuario> es_amigo) {
        this.es_amigo = es_amigo;
    }

    public Set<Compra> getCompra() {
        return compra;
    }

    public void setCompra(Set<Compra> compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        return "Usuario{" + "login=" + login + 
                ", password=" + password + 
                ", name=" + name + 
                ", last_name=" + last_name + 
                ", birth_date=" + birth_date + 
                ", email=" + email + 
                ", promotional_money=" + promotional_money + 
                ", coordinates=" + coordinates + 
                ", tarjetas=" + tarjetas + 
                //", promociones_compradas=" + promociones_compradas + 
                //", tiene_amigo=" + tiene_amigo + 
                //", es_amigo=" + es_amigo + 
                '}';
    }
}