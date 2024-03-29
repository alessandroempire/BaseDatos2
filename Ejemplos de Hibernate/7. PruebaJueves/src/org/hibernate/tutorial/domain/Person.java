package org.hibernate.tutorial.domain;

import java.util.Set; //Importo el tipo Set
import java.util.HashSet; //Importo el tipo HashSet
import org.hibernate.tutorial.domain.Event;

public class Person {

    private Long id;
	private int age;
    private String firstname;
    private String lastname;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

    Set<Event> events = new HashSet<Event>();
    	
    public Set<Event> getEvents() {
         return events;
    }
        
    public void setEvents(Set<Event> events) {
         this.events = events;
    }
        		
}