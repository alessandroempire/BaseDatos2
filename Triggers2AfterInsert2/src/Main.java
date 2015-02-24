import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import paquete.Person1;

public class Main {
	
	public static void main(String[] args) 
	{
		 //Creo la persona 1
		 Person1 p1 = new Person1("Fabiana", "Reggio");
		
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	Session session = sessionFactory.openSession();
		session.beginTransaction();
              
	    session.save(p1);
	    //session.save(p2);
		session.getTransaction().commit();
		
		System.out.println("Person p1: " + p1.getFirst_name1() + p1.getLast_name1());  
		
		session.close();
		sessionFactory.close();
	}

}