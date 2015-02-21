import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.annotations.Cascade;

//import com.kruders.util.HibernateUtil;
 
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private long id;
 
    @Column(name = "emp_name")
    private String name;
 
    @Column(name = "emp_salary")
    private double salary;
 
    @OneToOne(mappedBy = "employee")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private Address address;
 
    public Employee(String name, double salary) {
    	this.name = name;
    	this.salary = salary;
 	}

	public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public Address getAddress() {
        return address;
    }
 
    public void setAddress(Address address) {
        this.address = address;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public double getSalary() {
        return salary;
    }
 
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
	   public static void consulta(){
               System.out.println("CONUSLTAAAA");
	    	Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
	        try{
	        	transaction = session.beginTransaction();
	        
	        	Query query =
	    				session.createQuery("select e.name, a.city from Employee e " + "INNER JOIN e.address a");
	        	
	        	 List<Object[]> list = query.list();
	             for(Object[] arr : list){
	                 System.out.println(Arrays.toString(arr));
	             }
	    	
	        	transaction.commit();
	        } catch (HibernateException e) {
	        	if (transaction!=null) transaction.rollback();
	        	e.printStackTrace(); 
	        } finally {
	        	session.close(); 
	        }
	    }
 
}