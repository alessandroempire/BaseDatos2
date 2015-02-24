package org.hibernate.tutorial.domain;
import java.util.Date;

public class Contacts {

	private Long contactId;
    private String firstName;
	private String lastName;
	private Date birthday;
	private Date createdDate;
	private Date createdBy;
	
	public Contacts(String firstname, String lastname, Date birthday) {
	        this.firstName = firstname;
	        this.lastName = lastname;
	        this.birthday = birthday;
	   }
	 

    public Long getContactId() {
		return contactId;
	}
	public void setContactId(Long contactId) {
		this.contactId = contactId;
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Date createdBy) {
		this.createdBy = createdBy;
	}
    
}
 


     
