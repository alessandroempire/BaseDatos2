import java.util.HashSet;
import java.util.Set;
 
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="EMPLOYEE")
public class Employee {
     
    @Id
    @Column(name="EMPLOYEE_ID")
    @GeneratedValue
    private Long employeeId;
     
	@Column(name="FIRSTNAME")
    private String firstname;
     
    @Column(name="LASTNAME")
    private String lastname;
     
    /*
     * @ManyToMany – Is used to create many-to-many relationship between Employee and Meeting entities. 
     * If the Collection is defined using generics to specify the element type, the associated target 
     * entity class does not need to be specified; otherwise it must be specified. Every many-to-many 
     * association has two sides, the owning side and the non-owning, or inverse, side. The join table 
     * is specified on the owning side. 
     * If the association is bidirectional, either side may be designated as the owning side.
     * 
     */
    @ManyToMany(cascade = {CascadeType.ALL})
    
    /*
     * @JoinTable – Is used to define the join table (link table) for many-to-many relationship.
     * It is specified on the owning side of a many-to-many association, or in a unidirectional 
     * one-to-many association. 
     * In this case the join table is EMPLOYEE_MEETING.
     * @JoinColumn – Is used to define the join column (linking column) in both main tables.
     */
    @JoinTable(name="EMPLOYEE_MEETING", //Tabla intermedia
                joinColumns={@JoinColumn(name="EMPLOYEE_ID")}, //ID DE EMPLEADO
                inverseJoinColumns={@JoinColumn(name="MEETING_ID")}) //ID DE METTING
   
    private Set<Meeting> meetings = new HashSet<Meeting>();
    
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

	public Set<Meeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(Set<Meeting> meetings) {
		this.meetings = meetings;
	}

}