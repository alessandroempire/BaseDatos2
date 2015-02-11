package org.hibernate.tutorial.domain;
import java.util.Set;

public class Department {
 
    private Long departmentId;
	private String departmentName;
    private Set<Employee> employees; //El dpto tiene un set de empleados
     
    public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
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
 


     
