import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
	    Employee manager1 = new Employee("Edna", "Ruckhaus");
        
        Employee employee1 = new Employee("David", "Prieto");
        Employee employee2 = new Employee("Cathe", "Lollet");
 
        //A cada subordinado le seteo su manager
        employee1.setManager(manager1);
        employee2.setManager(manager1);
         
        session.save(employee1);
        session.save(employee2);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}