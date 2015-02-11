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
	   
		//Dos meetings
		Meeting meeting1 = new Meeting("Reunión de ventas");
	    Meeting meeting2 = new Meeting("Reunión de recursos humanos");
	    
	    //Dos empleados
	    Employee employee1 = new Employee("Maria", "Pérez");
	    Employee employee2 = new Employee("José", "Gómez");
	 
	    //Empleado 1 con dos meetings
	    employee1.getMeetings().add(meeting1);
	    employee1.getMeetings().add(meeting2);
	    
	    //Empleado 2 con un meeting
	    employee2.getMeetings().add(meeting1);
	         
	    session.save(employee1);
	    session.save(employee2);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}