import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tutorial.domain.Employee;
import org.hibernate.tutorial.domain.EmployeeDetail;

public class Main {
	
	public static void main(String[] args) 
	{
	
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		EmployeeDetail employeeDetail = new EmployeeDetail("Calle 12", "Caracas", "Miranda", "Vzla");
        
        Employee employee = new Employee("Fabi", "Reggio", new Date(121212), "114-857-965");
        employee.setEmployeeDetail(employeeDetail);
        employeeDetail.setEmployee(employee);
        
        /* Como se hace bidireccionalmente, puede en otro caso guardarse el employeeDetail
        y se obtiene lo mismo */
        
        session.save(employee);
        
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}