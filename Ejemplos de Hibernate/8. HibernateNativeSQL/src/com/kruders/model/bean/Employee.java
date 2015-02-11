package com.kruders.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "EMPLOYEE_ID")
	private int employeeId;
	
	@Column(name = "Name")
    private String name;
    
    public Employee() {
    }
    public Employee(String name) {
        this.name = name;
    }
 
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}