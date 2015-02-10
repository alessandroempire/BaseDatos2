/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rabais;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;


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
        
        TarjetaCredito t1 = new TarjetaCredito("123456", "ale", "MASTERCARD");
        
        /*
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        session.save(t1);

        session.getTransaction().commit();
        
        session.close();
        */
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(t1);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}

