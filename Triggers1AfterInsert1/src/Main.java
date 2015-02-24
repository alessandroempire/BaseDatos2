import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import paquete.Person1;

public class Main {
	
	public static void main(String[] args) 
	{
		 //Creo la persona 1
		 Person1 p1 = new Person1();
		
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	Session session = sessionFactory.openSession();
		session.beginTransaction();
              
	    session.save(p1);
		session.getTransaction().commit();
		
		System.out.println("Person p1: " + p1.getId1());
		//session.save(p2);
		//System.out.println("Person p2: " + p2.getId());      
		
		session.close();
		sessionFactory.close();
	}

}