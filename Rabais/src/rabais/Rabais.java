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
        
        //Tarjeta de credito
        TarjetaCredito t1 = new TarjetaCredito("123455", "ale", "MASTERCARD");
        TarjetaCredito t2 = new TarjetaCredito("876432", "cat", "MASTERCARD");
        TarjetaCredito t3 = new TarjetaCredito("987122", "fab", "AMERICAN EXPREESS");
        TarjetaCredito t4 = new TarjetaCredito("123459", "fab", "MASTERCARD");
        
        //Usuarios
        Date date = new Date(2015, 02, 13);
        Usuario u1 = new Usuario("ale", "alcpass", "alessandro", "la corte", 
                date, "alec@gmail.com", 1000, null);
        date = new Date(2014, 01, 12);
        Usuario u2 = new Usuario("cathe", "francesa", "catherine", "lollet", 
                date, "cathe@gmail.com", 6969, null);
        date = new Date(2013, 8, 3);
        Usuario u3 = new Usuario("fabi", "fabipass", "fabaiana", "reggio", 
                date, "fabi@gmail.com", 10000, null);
        
        //Asociacion entre tarjeta y usuario
        Set set1 = new HashSet();
        set1.add(t1);
        u1.setTarjetas(set1);
        t1.setUsuario(u1);
        
        Set set2 = new HashSet();
        set1.add(t2);
        u2.setTarjetas(set2);
        t2.setUsuario(u2);
        
        Set set3 = new HashSet();
        set1.add(t3);
        set1.add(t4);
        u3.setTarjetas(set3);
        t3.setUsuario(u3);
        t4.setUsuario(u3);
        
        //Empresas
        Direccion d1 = new Direccion("calle", "urba", "nombre", 5, "1080");
        
        Empresa e1 = new Empresa("empresa1", "belleza", "0414", "b@gmail.com", 10, d1);
        Empresa e2 = new Empresa("empresa2", "tecnologia", "0416", "t@gmail.com", 101, d1);
        Empresa e3 = new Empresa("empresa3", "de todo", "0426", "de@gmail.com", 60, d1);
        
        //Oferta
        date = new Date(2015, 17, 2);
        Set set4 = new HashSet();
        Date date1 = new Date(2015, 17, 3);
        set4.add(date1);
        Oferta o1 = new Oferta(date, 10, 30, 12, set4, e1, null);
        
        //Promocion
        
        
        //Categoria
        
        @SuppressWarnings("deprecation")
        //SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        SessionFactory sessionFactory = new Configuration().configure("rabais/hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(u1); //se tiene que salvar u1 antes que t1
        session.save(u2);
        session.save(u3);
        
        session.save(t1);
        session.save(t2);
        session.save(t3);
        session.save(t4);
        
        session.save(e1);
        session.save(e2);
        session.save(e3);
       
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        
    }
    
    public static void casoSimple(){
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
        
        //Asosiaciones posee_tarjeta entre usuario y tarjeta de credito
        Set set1 = new HashSet();
        set1.add(t1);
        u1.setTarjetas(set1);
        
        t1.setUsuario(u1);
        
        //Asosiacion posee_categoria entre promocion y categoria
        Set set2 = new HashSet();
        set2.add(c1);
        p1.setCategorias(set2);
        
        //Set set3 = new HashSet();
        //set3.add(p1);
        //c1.setPromocion(set3);
        
        //Asosiacion Compra entre usuario y promocion
        Set set4 = new HashSet();
        set4.add(p1);
        u1.setPromociones_compradas(set4);
        
        Set set5 = new HashSet();
        set5.add(u1);
        p1.setCompraron_usuarios(set5);
        
        @SuppressWarnings("deprecation")
        //SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        SessionFactory sessionFactory = new Configuration().configure("rabais/hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(u1); //se tiene que salvar u1 antes que t1
        session.save(t1);
        
        session.save(p1); //p1 antes que c1
        session.save(c1);
        
        session.save(e1);
        

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();   
    }
}

