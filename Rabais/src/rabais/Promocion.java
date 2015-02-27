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
public class Promocion {
    private long         id_oferta; 
    private String       nombre_promocion;
    private String       descripcion_breve;
    private String       descripcion_completa;
    private String       descripcion_adicional; //cardinalidad 0 1
    private double       monto_original;
    private Set<String>  palabras_claves; 
    private Set<String>  pagina_web;
    private int          cantidad_disponible;
    private double       puntaje_total;
    private String       estatus; 
    
    //Asociacion posee_categoria
    private Set<Categoria> categorias = new HashSet<Categoria>();
    //Asociacion compra
    private Set<Usuario> compraron_usuarios = new HashSet<Usuario>();
    //Asociacion Oferta
    private Oferta ofertadas;
    //Asociacion compra con clase asociacion
    private Compra comprado_por; 
    
    //Constructor
    public Promocion(){}
    
    //Constructor
    public Promocion(String nombre_promocion, String descripcion_breve,
                        String descripcion_completa, String descripcion_adicional,
                        double monto_original, String palabras_claves,
                        String pagina_web, int cantidad_disponible,
                        double puntaje_total){
        this.nombre_promocion      = nombre_promocion;
        this.descripcion_breve     = descripcion_breve;
        this.descripcion_completa  = descripcion_completa;
        this.descripcion_adicional = descripcion_adicional;
        this.monto_original        = monto_original;
        this.palabras_claves       = new HashSet<>();
        this.palabras_claves.add(palabras_claves);
        this.pagina_web            = new HashSet<>();
        this.pagina_web.add(pagina_web);
        this.cantidad_disponible   = cantidad_disponible;
        this.puntaje_total         = puntaje_total;
    }

    public Promocion(String nombre_promocion, String descripcion_breve, String descripcion_completa, String descripcion_adicional, double monto_original, Set<String> palabras_claves, Set<String> pagina_web, int cantidad_disponible, double puntaje_total, Oferta ofertadas) {
        this.nombre_promocion = nombre_promocion;
        this.descripcion_breve = descripcion_breve;
        this.descripcion_completa = descripcion_completa;
        this.descripcion_adicional = descripcion_adicional;
        this.monto_original = monto_original;
        this.palabras_claves = palabras_claves;
        this.pagina_web = pagina_web;
        this.cantidad_disponible = cantidad_disponible;
        this.puntaje_total = puntaje_total;
        this.ofertadas = ofertadas;
    }

    //Getters y Setters
    
    public long getId_oferta() {
        return id_oferta;
    }

    public void setId_oferta(long id_oferta) {
        this.id_oferta = id_oferta;
    }
    
    
    public String getNombre_promocion() {
        return nombre_promocion;
    }

    public void setNombre_promocion(String nombre_promocion) {
        this.nombre_promocion = nombre_promocion;
    }

    public String getDescripcion_breve() {
        return descripcion_breve;
    }

    public void setDescripcion_breve(String descripcion_breve) {
        this.descripcion_breve = descripcion_breve;
    }

    public String getDescripcion_completa() {
        return descripcion_completa;
    }

    public void setDescripcion_completa(String descripcion_completa) {
        this.descripcion_completa = descripcion_completa;
    }

    public String getDescripcion_adicional() {
        return descripcion_adicional;
    }

    public void setDescripcion_adicional(String descripcion_adicional) {
        this.descripcion_adicional = descripcion_adicional;
    }

    public double getMonto_original() {
        return monto_original;
    }

    public void setMonto_original(double monto_original) {
        this.monto_original = monto_original;
    }

    public Set<String> getPalabras_claves() {
        return palabras_claves;
    }

    public void setPalabras_claves(Set<String> palabras_claves) {
        this.palabras_claves = palabras_claves;
    }

    public Set<String> getPagina_web() {
        return pagina_web;
    }

    public void setPagina_web(Set<String> pagina_web) {
        this.pagina_web = pagina_web;
    }

    public int getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

    public double getPuntaje_total() {
        return puntaje_total;
    }

    public void setPuntaje_total(double puntaje_total) {
        this.puntaje_total = puntaje_total;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Set<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Set<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Set<Usuario> getCompraron_usuarios() {
        return compraron_usuarios;
    }

    public void setCompraron_usuarios(Set<Usuario> compraron_usuarios) {
        this.compraron_usuarios = compraron_usuarios;
    }

    public Oferta getOfertadas() {
        return ofertadas;
    }

    public void setOfertadas(Oferta ofertadas) {
        this.ofertadas = ofertadas;
    }

    public Compra getComprado_por() {
        return comprado_por;
    }

    public void setComprado_por(Compra comprado_por) {
        this.comprado_por = comprado_por;
    }

    @Override
    public String toString() {
        return "Promocion{" + "nombre_promocion=" + nombre_promocion + 
                ", descripcion_breve=" + descripcion_breve + 
                ", descripcion_completa=" + descripcion_completa + 
                ", descripcion_adicional=" + descripcion_adicional + 
                ", monto_original=" + monto_original + 
                ", palabras_claves=" + palabras_claves + 
                ", pagina_web=" + pagina_web + 
                ", cantidad_disponible=" + cantidad_disponible + 
                ", puntaje_total=" + puntaje_total + 
                //", categorias=" + categorias + 
                //", compraron_usuarios=" + compraron_usuarios + 
                //", ofertadas=" + ofertadas.toString() + 
                '}';
    }    
}