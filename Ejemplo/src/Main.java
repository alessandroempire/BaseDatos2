
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alessandro
 */

public class Main {
	
	public static void main(String[] args) 
	{
		Student_Info student1 = new Student_Info();
		
		student1.setName("Fabiana");
		//student.setRollNo(12);
		
                Student_Info student2 = new Student_Info();
		
		student2.setName("Krisvely");
		
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(student1);
		session.save(student2);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}