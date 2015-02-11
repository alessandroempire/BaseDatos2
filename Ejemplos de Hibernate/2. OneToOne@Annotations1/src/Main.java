import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) 
	{
		Student student = new Student();
		student.setStudent_name("Fabiana");
		
        StudentDetail studentDetail = new StudentDetail();
		studentDetail.setStudent_mobile_number("04142547863");
		
		studentDetail.setStudent(student);
		
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(studentDetail);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}