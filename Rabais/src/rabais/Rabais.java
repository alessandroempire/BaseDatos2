package rabais;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import java.sql.Date; 
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @Autores:
 * Alessandro La Corte
 * Catherine Lollett 
 * 
 * @Descripcion:
 */
public class Rabais {
    
    //Dar toda la informacion de una promocion.
    public static List consulta1(String nombre_promocion, Session session){
        System.out.println("CONSULTA1");
        String hql = "FROM rabais.Promocion p " + 
                     "WHERE p.nombre_promocion = :promotion_name";
        Query q = session.createQuery(hql);
        q.setParameter("promotion_name", nombre_promocion);
        List list = q.list();
        
        //Imprimir el resultado
        for (int i=0; i < list.size(); i++){
            String info = list.get(i).toString();
            System.out.println(info);
        }
        
        return list; 
    }
    
        public static void consulta2(double lower_price, double high_price, 
            Session session){
        
        System.out.println("CONSULTA2");
     
        /*
        String hql = "select f.promocion "
                   + "from Oferta f "
                   + "where f.monto_ofertado > :lw and f.monto_ofertado < :hp ";
        */
        String hql = "select p "
                   + "from Promocion p " 
                   + "join p.ofertadas as offer "
                   + "where offer.monto_ofertado > :lw and offer.monto_ofertado < :hp ";
        
        Query q = session.createQuery(hql);
        q.setParameter("lw", lower_price);
        q.setParameter("hp", high_price);
        
        Iterator i = q.list().iterator();
        
        while(i.hasNext()){
            Promocion p = (Promocion) i.next();
            System.out.println(p.getNombre_promocion());
        }
        
    }

    
    //dada una categoria, listar todas las promociones
    public static void consulta3(String categorias, Session session){
        
        System.out.println("CONSULTA3");
     
        String hql = "select distinct c.promocion "
                   + "from Categoria c "
                   + "where c.nombre = :category";
        
        Query q = session.createQuery(hql);
        q.setParameter("category", categorias);
        
        Iterator i = q.list().iterator();
        
        while(i.hasNext()){
            Promocion p = (Promocion) i.next();
            System.out.println(p.getNombre_promocion());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Rabais!");
        
//        FechaActual fecha = new FechaActual(new Date(0, 3, 1));
//        System.out.println(fecha.toString());
//        fecha.nextDay();
//        System.out.println(fecha.toString());
//        System.exit(1);
        
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
        Empresa e3 = new Empresa("empresa3", "comida", "0426", "de@gmail.com", 60, d1);
        
        //Oferta
        date = new Date(1, 0, 1);
        Date dateI = new Date(1, 0, 2);
        Date date1 = new Date(1, 0, 4);
        Date date2 = new Date(1, 1, 5);
        Date date3 = new Date(1, 1, 10);
        Date date4 = new Date(2, 1, 1);
        Date date5 = new Date(2, 1, 1);
        
        DateTuple tuple1 = new DateTuple(dateI, date1);
        DateTuple tuple12 = new DateTuple(date2, date3);
        DateTuple tuple4 = new DateTuple(dateI, date4);
        DateTuple tuple5 = new DateTuple(dateI, date5);
        
        Set set4 = new HashSet();
        Set set42 = new HashSet();
        Set set43 = new HashSet();
        
        set4.add(tuple1);
        set4.add(tuple12);
        set42.add(tuple4);
        set43.add(tuple5);
        
        //Crear las ofertas
        Oferta o1 = new Oferta(date, 10, 80, 2, set4, e1, null);
        date = new Date(2013, 1, 10);
        Oferta o2 = new Oferta(date, 20, 91, 12, set42, e2, null);
        date = new Date(2015, 21, 9);
        Oferta o3 = new Oferta(date, 3, 76, 32, set43, e3, null);
        
        //Promocion
        Promocion p1 = new Promocion("depilado", "des breve", "des comple", 
                "desp adicional", 10.2, "depilado", "www.waxof.com", 
                12, 4.0);
        Promocion p2 = new Promocion("iphone barato", "des breve", "des comple", 
                "desp adicional", 10.2, "iphone", "www apple.com", 
                100, 4.2);
        Promocion p3 = new Promocion("pizzas ricas", "des breve", "des comple", 
                "desp adicional", 10.2, "pizza", "www.romanina.com", 
                500, 5);
        
        //sett el status
        p1.setEstatus("habilitado");
        p2.setEstatus("habilitado");
        p3.setEstatus("habilitado");
        
        //Clase asosiacion oferta
            //a cada empresa le agregamos una oferta (puede ser null)
        Set seto1 = new HashSet();
        seto1.add(o1);
        e1.setOferta(seto1);
        
        Set seto2 = new HashSet();
        seto2.add(o2);
        e2.setOferta(seto2);
        
        Set seto3 = new HashSet();
        seto3.add(o3);
        e3.setOferta(seto3);
        e3.setOferta(seto2);
        e3.setOferta(seto1);
        
            //a cada oferta le agregamos la promocion
        o1.setPromocion(p1);
        o2.setPromocion(p2);
        o3.setPromocion(p3);
        
            //a cada oferta le agregmaos la empresa
        o1.setEmpresa(e1);
        o2.setEmpresa(e2);
        o3.setEmpresa(e3);
            //a cada promocion le colocamos su oferta
        p1.setOfertadas(o1);
        p2.setOfertadas(o2);
        p3.setOfertadas(o3);
        
        //Categoria
        Categoria c1 = new Categoria("electrodomestico");
        Categoria c11 = new Categoria("celulares");
        Categoria c2 = new Categoria("belleza corporal");
        Categoria c3 = new Categoria("restaurantes");
        
        //Probar las subcategorais
        Set set5 = new HashSet();
        set5.add(c11);
        c1.setSub_categorias(set5);
        c11.setSuper_categoria(c1);
        
        //cada promocion tiene subcategorias
        Set set6 = new HashSet();
        set6.add(c1);
        p1.setCategorias(set6);
        
        Set set7 = new HashSet();
        set7.add(c2);
        p2.setCategorias(set7);
        
        Set set8 = new HashSet();
        set8.add(c3);
        p3.setCategorias(set8);
        
        //categorias tienen promociones 
        Set setc1 = new HashSet();
        setc1.add(p1);
        //setc1.add(p2);
        setc1.add(p3);
        c1.setPromocion(setc1);
        
        Set setc2 = new HashSet();
        setc2.add(p2);
        c2.setPromocion(setc2);
        
        Set setc3 = new HashSet();
        setc3.add(p3);
        c3.setPromocion(setc3);
        
        //los que compran promociones
        u1.setPromociones_compradas(setc1);
        u2.setPromociones_compradas(setc2);
        u3.setPromociones_compradas(setc3);
        
        //Compra
        Compra compra1 = new Compra(1, u1, p1);
        //Compra compra12 = new Compra(1, u1, p2);
        Compra compra2 = new Compra(1, u2, p2);
        //Compra compra21 = new Compra(1, u2, p1);
        Compra compra3 = new Compra(1, u3, p3);
        
        //Hacer los sets correctos
            //de usuario a compra
        Set setcom1 = new HashSet();
        setcom1.add(compra1);
        //setcom1.add(compra12);
        u1.setCompra(setcom1);
        
        Set setcom2 = new HashSet();
        setcom2.add(compra2);
        //setcom2.add(compra21);
        u2.setCompra(setcom2);
        
        Set setcom3 = new HashSet();
        setcom3.add(compra3);
        u3.setCompra(setcom3);
        
            //de promocion a compra
        Set compraset1 = new HashSet();
        compraset1.add(compra1);
        p1.setComprado_por(compraset1);
        
        Set compraset2 = new HashSet();
        compraset2.add(compra2);
        p2.setComprado_por(compraset2);
        
        Set compraset3 = new HashSet();
        compraset3.add(compra3);
        p3.setComprado_por(compraset3);
        
        //Abrir session
        
        @SuppressWarnings("deprecation")
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
        
        session.save(c1);
        session.save(c11);
        session.save(c2);
        session.save(c3);
        
        session.save(o1);
        session.save(o2);
        session.save(o3);
        
        session.save(p1);
        session.save(p2);
        session.save(p3);
        
        session.save(compra1);
        session.save(compra2);
        session.save(compra3);
       
        session.getTransaction().commit();
        
        //consulta1
        consulta1("depilado", session);
        consulta1("iphone barato", session);
        
        //Consulta2
        consulta2(78.0, 100.0, session);
        
        //Consulta3
        consulta3("electrodomestico", session);
        
        //Simulacion de las fechas
        //Simular la fecha y probar el patron state
        //FechaActual fecha = new FechaActual(new Date(1, 0, 3));
        o1.doAction(new Date(1, 0, 3));
        //fecha.nextDay();
        o1.doAction(new Date(1, 0, 5));
        
        
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