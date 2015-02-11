package org.hibernate.tutorial.domain;
import java.util.HashSet;
import java.util.Set;
 
public class Employee {
     
    private Long employeeId;
    private String firstname;
    private String lastname;
    
    //El rol del supervisor (Un supervisor puede tener varios subordinados) Muchos a uno
    private Employee manager;
 
    //El rol del subordinado (Al subordinado lo dirige un supervisor) Uno a muchos
    private Set<Employee> subordinates = new HashSet<Employee>();
 
    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Set<Employee> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(Set<Employee> subordinates) {
		this.subordinates = subordinates;
	}        
 
}