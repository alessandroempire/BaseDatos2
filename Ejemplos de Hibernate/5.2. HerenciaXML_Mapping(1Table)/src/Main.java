import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tutorial.domain.Employee;
import org.hibernate.tutorial.domain.Person;

import java.util.*;

public class Main {
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		 Person person = new Person();
		 person.setFirstname("Fabi");
		 person.setLastname("Reggio");
	     session.save(person);
	 
	     Employee employee = new Employee();
	     employee.setJoiningDate(new Date());
	     employee.setDepartmentName("Marketing");
	     employee.setFirstname("Vicen");
	     employee.setLastname("Reggio");
	     session.save(employee);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}