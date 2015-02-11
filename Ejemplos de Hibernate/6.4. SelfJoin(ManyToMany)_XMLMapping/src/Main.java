import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tutorial.domain.Person;

public class Main {
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		  
	    //3 personas
	    Person person1 = new Person("Anny");
        Person person2 = new Person("Marisol");
        Person person3 = new Person("Vicente");
        
        //Conjunto de amigos
        Set<Person> friends = new HashSet<Person>();

        //Al set de amigos le agrego Marisol, Vicente
        friends.add(person2);
        friends.add(person3);
        //Y a Anny le seteo sus amigos que ahora serán M y V.
        person1.setFriends(friends);
                     
        session.save(person2);
        session.save(person3);
        session.save(person1);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}