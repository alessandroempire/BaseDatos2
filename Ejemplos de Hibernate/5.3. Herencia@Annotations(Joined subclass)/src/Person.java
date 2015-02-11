import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
  
@Entity
@Table(name = "PERSON")

/*@InheritanceType – Defines inheritance strategy options. JOINED is a strategy in which fields
 *  that are specific to a subclass are mapped to a separate table than the fields that are 
 *  common to the parent class, and a join is performed to instantiate the subclass. Thus fields
 *   of Employee (joining_date, department) and Owner (stocks etc) are mapped to their respective tables.
 */

//Estrategia de herencia es Joined a través del PERSON_ID.
@Inheritance(strategy=InheritanceType.JOINED)

public class Person {
 
    @Id @GeneratedValue
    @Column(name = "PERSON_ID")
    private Long personId;
    
	@Column(name = "FIRSTNAME")
    private String firstname;
     
    @Column(name = "LASTNAME")
    private String lastname;
    
    /*The Person class is the root of hierarchy. Hence we have used some annotations to make it 
     * as the root.*/
    
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
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

}