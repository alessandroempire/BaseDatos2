import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tutorial.domain.Contacts;


import java.sql.Date;

public class Main {
	 
	public static void main(String[] args) 
	{
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
	   
	    Contacts contacts = new Contacts("Fabiana", "Reggio", new Date(0));
	    session.save(contacts);
	    
	    //  DELETE FROM CONTACTS where CONTACT_ID=1; 
		String sql = "DELETE FROM CONTACTS where CONTACT_ID=1";
        SQLQuery query = session.createSQLQuery(sql);
        int result = query.executeUpdate();
        System.out.println("Rows affected: " + result);	
           
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
	
    

}