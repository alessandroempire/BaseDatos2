package rabais;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.sql.Date; 
import java.util.HashSet;
import java.util.HashSet;
import java.util.Set;

/**
 * @Autores:
 * Alessandro La Corte
 * Catherine Lollett 
 * 
 * @Descripcion:
 */
public class Rabais {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Rabais!");
        
        TarjetaCredito t1 = new TarjetaCredito("123455", "ale", "MASTERCARD");
        
        Categoria c1 = new Categoria("categoria 1");
        
        Direccion d1 = new Direccion("calle", "urba", "nombre", 5, "1080");
        Empresa e1 = new Empresa("empresa1", "social", "1234", "alc@gmail.com", 10, d1);

        Promocion p1 = new Promocion("nombre promotion", "des breve", "des comple", 
                "desp adicional", 10.2, "words claves", "www algo", 
                666, 4.5);
        
        Date date = new Date(2015, 02, 13);
        DMS dms1 = new DMS(1, 2, 3);
        DMS dms2 = new DMS(4,5, 6);
        Coordenadas coor= new Coordenadas(dms2, dms1);
        Usuario u1 = new Usuario("ale", "alcpass", "alessandro", "la corte", 
                date, "alec@gmail.com", 1000, coor);
        
        //Asosiaciones usuario y tarjeta de credito
        Set set1 = new HashSet();
        set1.add(t1);
        u1.setTarjetas(set1);
        
        t1.setUsuario(u1);
        
        //
        
        
        @SuppressWarnings("deprecation")
        //SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        SessionFactory sessionFactory = new Configuration().configure("rabais/hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(u1); //se tiene que salvar u1 antes que t1
        session.save(t1);
        session.save(c1);
        session.save(e1);
        session.save(p1);
        

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
    
    public static void agregarTarjetaCreditos(){
        
    }
}

