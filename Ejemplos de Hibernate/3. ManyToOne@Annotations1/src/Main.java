import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) 
	{
	    //Creo el Address
        StudentAddress studentAddress = new StudentAddress();
		studentAddress.setAddress_detail("San Antonio, Los Teques");
		
		//Creo dos estudiantes pero le coloco el mismo Address
		Student student1 = new Student();
		student1.setStudent_name("Fabiana");
		student1.setStudentAddress(studentAddress);
		
		Student student2 = new Student();
		student2.setStudent_name("María");
		student2.setStudentAddress(studentAddress);
		
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		//No estamos guardando studentAddress, pero el objeto será cargado en la BD.
		//Esto es lo bueno de Many to One Mapping
		session.save(student1);
		session.save(student2);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}