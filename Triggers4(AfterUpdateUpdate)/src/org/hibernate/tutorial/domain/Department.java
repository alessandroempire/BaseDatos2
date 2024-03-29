package org.hibernate.tutorial.domain;
import java.util.Set;

public class Department {
 
    private int departmentId;
	private String departmentName;
    private Set<Employee> employees; //El dpto tiene un set de empleados
     
    
	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
    
}
 


     
