package com.kruders.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_COPY")
public class EmployeeCopy {
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "EMPLOYEE_ID")
	private Integer employeeId;
	
	@Column(name = "FirstName")
	private String firstName; 
	
	@Column(name = "LastName")
	private String lastName;  
	
	@Column(name = "Salary")
	private Integer salary;
	
	public EmployeeCopy() {
		
	}
	
	public EmployeeCopy(String firstName, String lastName, Integer salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	} 
}
