import java.util.HashSet;
import java.util.Set;
 
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
 
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
     * 
     * Note that we have defined two attributes Set colleagues and Set teammates. 
     * Also the attribute colleagues is relationship owner here. This is because we have marked 
     * colleagues attribute with @JoinTable annotation and teammates attribute with mappedBy="colleagues".
     * Also note that the relationship is defined within table EMPLOYEE_COLLEAGUE which we marked using @JoinTable annotation.
	 * @ManyToMany annotation is defined on both colleagues and teammates attributes.
	 * 
     */
     
    @ManyToMany(cascade={CascadeType.ALL})
    @JoinTable(name="EMPLOYEE_COLLEAGUE",
        joinColumns={@JoinColumn(name="EMPLOYEE_ID")},
        inverseJoinColumns={@JoinColumn(name="COLLEAGUE_ID")})
    private Set<Employee> colleagues = new HashSet<Employee>();
 
    @ManyToMany(mappedBy="colleagues")
    private Set<Employee> teammates = new HashSet<Employee>();
 
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

	public Set<Employee> getColleagues() {
		return colleagues;
	}

	public void setColleagues(Set<Employee> colleagues) {
		this.colleagues = colleagues;
	}

	public Set<Employee> getTeammates() {
		return teammates;
	}

	public void setTeammates(Set<Employee> teammates) {
		this.teammates = teammates;
	}      

}