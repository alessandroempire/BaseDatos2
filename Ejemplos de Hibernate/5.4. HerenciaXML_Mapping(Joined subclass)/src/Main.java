import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tutorial.domain.Employee;
import org.hibernate.tutorial.domain.Owner;
import org.hibernate.tutorial.domain.Person;

import java.util.*;

public class Main {
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		 Person person = new Person("Fabiana", "Reggio");
	     session.save(person);
	     
	     Employee employee = new Employee("Vicente", "Reggio", "Marketing", new Date());
	     session.save(employee);
	     
	     Owner owner = new Owner("Bill", "Gates", 300L, 20L);
	     session.save(owner);
	 
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}