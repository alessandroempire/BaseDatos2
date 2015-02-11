import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class Main {
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Cat gato = new Cat();	
		gato.setBirthdate(new Date());
		session.save(gato);
		
		DomesticCat gatito = new DomesticCat();
		gatito.setBirthdate(new Date());
		gatito.setName("Miau");
		session.save(gatito);
		
		session.getTransaction().commit();
		session.close();
		//sessionFactory.close();
	}

}