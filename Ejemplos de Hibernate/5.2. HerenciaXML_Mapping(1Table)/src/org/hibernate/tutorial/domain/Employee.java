package org.hibernate.tutorial.domain;
import java.util.Date;

 
public class Employee extends Person {
 
    private Date joiningDate;
    private String departmentName;
     
    public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}