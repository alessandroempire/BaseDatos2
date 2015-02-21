import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Main {
	
	public static void main(String[] args) 
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			
			Address address = new Address("addressLine1", "1024", "Caracas");
	        
	        Employee employee = new Employee("Fabi", 50);
	        employee.setAddress(address);
	        address.setEmployee(employee);
	        session.save(employee);
	    	transaction.commit();
	    	
		
		}catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		Employee.consulta();
	
	}
	

}
