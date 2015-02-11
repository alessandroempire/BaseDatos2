package org.hibernate.tutorial.domain;
import java.util.HashSet;
import java.util.Set;
 
public class Person {
    private int personId;
    private String name;
     
    private Set<Person> persons = new HashSet<Person>();
    private Set<Person> friends = new HashSet<Person>();
     
    public Person() {
    }
     
    public Person(String name) {
        this.name = name;
    }
 
    public int getPersonId() {
        return personId;
    }
    public void setPersonId(int personId) {
        this.personId = personId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    public Set<Person> getPersons() {
        return persons;
    }
 
    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }
 
    public Set<Person> getFriends() {
        return friends;
    }
 
    public void setFriends(Set<Person> friends) {
        this.friends = friends;
    }
      
}
