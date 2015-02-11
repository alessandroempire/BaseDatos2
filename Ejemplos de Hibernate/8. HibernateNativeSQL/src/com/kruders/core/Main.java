package com.kruders.core;

//import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
 
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
//import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;

import com.kruders.model.bean.Employee;
import com.kruders.util.HibernateUtil;

public class Main {
 	public static void main(String args[]) {
        
    	Main mClass= new Main();
    	mClass.scalarQueries();
    	mClass.entityQueries();
    }
 	
    public void scalarQueries(){
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
        try {
             
            transaction = session.beginTransaction();
            
            Employee empleado1 = new Employee("Edna");
            session.save(empleado1);
             
            String sql = "SELECT name FROM EMPLOYEE";
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            for(Object object : data)
            {
               Map row = (Map)object;
               System.out.print("First Name: " + row.get("name")); 
              
            }
            transaction.commit();
        }catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    
    public void entityQueries(){
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
        try {
             
            transaction = session.beginTransaction();
             
            String sql = "SELECT * FROM EMPLOYEE";
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity(Employee.class);
            List employees = query.list();

            for (Iterator iterator = 
                              employees.iterator(); iterator.hasNext();){
               Employee employee = (Employee) iterator.next(); 
               System.out.print("Employee ID: " + employee.getEmployeeId() + " "); 
               System.out.print("Name: " + employee.getName()); 
            }
            transaction.commit();
        }catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}