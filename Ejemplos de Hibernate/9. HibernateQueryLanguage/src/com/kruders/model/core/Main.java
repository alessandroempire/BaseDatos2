package com.kruders.model.core;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.kruders.model.bean.Employee;
import com.kruders.model.bean.EmployeeCopy;
import com.kruders.util.HibernateUtil;


public class Main {
	
	public static void main(String args[]) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			
			transaction = session.beginTransaction();
			
	        Employee employee1 = new Employee("Puneet","Aggarwal",500000);
	        Employee employee2 = new Employee("Rahul","Sharma",400000);
	        Employee employee3 = new Employee("Shally","Aggarwal",200000);
	        
	        session.save(employee1);   
	        session.save(employee2);
	        session.save(employee3);
	               
			transaction.commit();
		}catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		//Métodos definidos más adelante
		//Inserción de tuplas
		//insertEmployee();
		//Eliminación de tuplas
		//deleteEmployee();
		//Actualización de tuplas
		//updateEmployee();
		//Consultas
		countEmployee();
		listEmployees();
		totalSalary();
		sortFirstName();
		firstTwo();
		matchFirstName();
	}
	
	/* Método para insertar tuplas dentro de Empleado */
    public static void insertEmployee(){
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
        try{
        	transaction = session.beginTransaction();

	        EmployeeCopy empcpy = new EmployeeCopy("Fabiana","Reggio",500000);
	        session.save(empcpy);
	        
	        //Cuando hago el insert, coloco es el ClassName, no TableName.
	        //HQL no permite insertar INSERT INTO..VALUE.. SINO QUE DEBO TOMAR LAS TUPLAS DE OTRA TABLA
	        String hql = "INSERT INTO Employee(firstName,lastName,salary)" + "select firstName, lastName, salary from EmployeeCopy";
	        Query query = session.createQuery(hql); 
    	    int result = query.executeUpdate();
    		System.out.println("Rows affected: " + result);			
  
        	transaction.commit();
        } catch (HibernateException e) {
        	if (transaction!=null) transaction.rollback();
        	e.printStackTrace(); 
        } finally {
        	session.close(); 
        }
    }
    
	/* Método para eliminar tuplas dentro de Empleado */
    public static void deleteEmployee(){
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
        try{
        	transaction = session.beginTransaction();
  
	        //Eliminamos de la tabla EMPLOYEE donde el firstname es Puneet
	        String hql = "delete Employee where firstName = 'Puneet'";
	        Query query = session.createQuery(hql); 
    	    int result = query.executeUpdate();
    		System.out.println("Rows affected: " + result);			
  
        	transaction.commit();
        } catch (HibernateException e) {
        	if (transaction!=null) transaction.rollback();
        	e.printStackTrace(); 
        } finally {
        	session.close(); 
        }
    }
    
	/* Método para actualizar tuplas dentro de Empleado */
    public static void updateEmployee(){
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
        try{
        	transaction = session.beginTransaction();
  
	        //Actualizamos el salario de Puneet
	        String hql = "update Employee set salary = 1000000 where firstName = 'Puneet'";
	        Query query = session.createQuery(hql); 
    	    int result = query.executeUpdate();
    		System.out.println("Rows affected: " + result);			
  
        	transaction.commit();
        } catch (HibernateException e) {
        	if (transaction!=null) transaction.rollback();
        	e.printStackTrace(); 
        } finally {
        	session.close(); 
        }
    }
	
	/* Method to print total number of records */
    public static void countEmployee(){
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
    	try{
    		transaction = session.beginTransaction();
    		
    		// To get total row count.
    		Long count = (Long) session.createQuery("select count(*) from Employee").uniqueResult();
    		
    		System.out.println("Total Count: " + count );
    		transaction.commit();
    	}catch (HibernateException e) {
    		if (transaction!=null) transaction.rollback();
    		e.printStackTrace(); 
    	}finally {
    		session.close(); 
    	}
    }
    
    /* Method to print all the employees having salary more than 400000 */
    public static void listEmployees( ){
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
        try{
        	transaction = session.beginTransaction();
        
        	Query query =
    				session.createQuery("from Employee emp where emp.salary > 400000");
    				query.setFirstResult(0);
    				query.setMaxResults(2); //Para definir el número máximo de tuplas que quiero consultar
    	    
    		//Guardando en la lista todas las tuplas recibidas en el query	
    		List employees = query.list(); 

    		//Iterando sobre todas las tuplas almacenadas en la lista
        	for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
        		Employee employee = (Employee) iterator.next(); 
        		System.out.print("First Name: " + employee.getFirstName()); 
        		System.out.print("  Last Name: " + employee.getLastName()); 
        		System.out.println("  Salary: " + employee.getSalary()); 
        	}
        	transaction.commit();
        } catch (HibernateException e) {
        	if (transaction!=null) transaction.rollback();
        	e.printStackTrace(); 
        } finally {
        	session.close(); 
        }
    }
    
    /* Method to print sum of salaries */
    public static void totalSalary(){
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
    	try{
    		transaction = session.beginTransaction();
    		Long count = (Long) session.createQuery("select sum(salary) from Employee").uniqueResult();
    		
    		System.out.println("Total Salary: " + count );
    		transaction.commit();
    	} catch (HibernateException e) {
    		if (transaction!=null) transaction.rollback();
    		e.printStackTrace(); 
    	} finally {
    		session.close(); 
       }
    }
	
    /* Method to print all the employees sorted by firstName in descending order */
    public static void sortFirstName(){
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
    	try{
    		transaction = session.beginTransaction();
    		Query query =
    				session.createQuery("from Employee emp order by emp.firstName desc");
    				
    		List employees = query.list();

        	for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
        		Employee employee = (Employee) iterator.next(); 
        		System.out.print("First Name: " + employee.getFirstName()); 
        		System.out.print("  Last Name: " + employee.getLastName()); 
        		System.out.println("  Salary: " + employee.getSalary()); 
        	}

    		transaction.commit();
    	} catch (HibernateException e) {
    		if (transaction!=null) transaction.rollback();
    		e.printStackTrace(); 
    	} finally {
    		session.close(); 
       }
    }
    
    /* Method to print first 2 employees ascendente */
    public static void firstTwo(){
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
    	try{
    		transaction = session.beginTransaction();
    		Query query =
    				session.createQuery("from Employee emp order by emp.firstName asc");
    				query.setFirstResult(0);
    				query.setMaxResults(2);
    			
    		List employees = query.list();

        	for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
        		Employee employee = (Employee) iterator.next(); 
        		System.out.print("First Name: " + employee.getFirstName()); 
        		System.out.print("  Last Name: " + employee.getLastName()); 
        		System.out.println("  Salary: " + employee.getSalary()); 
        	}

    		transaction.commit();
    	} catch (HibernateException e) {
    		if (transaction!=null) transaction.rollback();
    		e.printStackTrace(); 
    	} finally {
    		session.close(); 
       }
    }
    
    /* Method to print all the employees that looks like 'Puneet'*/
    public static void matchFirstName(){
    	System.out.print("String Matching\n"); 
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
    	try{
    		transaction = session.beginTransaction();
    		Query query =
    				session.createQuery("from Employee emp where emp.firstName like 'P%'");
    			
    		List employees = query.list();

        	for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
        		Employee employee = (Employee) iterator.next(); 
        		System.out.print("First Name: " + employee.getFirstName()); 
        		System.out.print("  Last Name: " + employee.getLastName()); 
        		System.out.println("  Salary: " + employee.getSalary()); 
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
