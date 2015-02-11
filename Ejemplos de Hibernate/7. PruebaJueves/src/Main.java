import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.*; //Para date

import org.hibernate.tutorial.domain.Event; //Importo la clase Event.java 
import org.hibernate.tutorial.domain.Person; //Importo la clase Person.java 

public class Main {

    public static void main(String[] args) {
    	
    	//Creo un evento
        Event evento = new Event();
        evento.setTitle("El evento");
        evento.setDate(new Date());
        
        //Creo a la persona
        Person persona = new Person();
        persona.setId(100000L);
        persona.setAge(24);
        persona.setFirstname("Fabiana");
        persona.setLastname("Reggio");
    	
        @SuppressWarnings("deprecation")
       	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
        session.save(evento); //Guardo el evento
		persona.getEvents().add(evento); //A la persona le agrego los eventos
        session.save(persona); //Guardo a la persona
        
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        
    }
    
}
    