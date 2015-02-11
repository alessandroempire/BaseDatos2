
import java.util.HashSet;
import java.util.Set;
 
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="EMPLOYEE")
public class Employee {
     
    @Id
    @Column(name="EMPLOYEE_ID")
    @GeneratedValue
    private Long employeeId;

	@Column(name="FIRST_NAME")
    private String firstname;
     
    @Column(name="LAST_NAME")
    private String lastname;
    
    /*
     * Note that in Employee entity class, we defined two new attributes: Employee manager and Set 
     * subordinates. Attribute manager is mapped with @ManyToOne annotation and subordinates is mapped 
     * with @OneToMany. Also within @OneToMany attribute we defined mappedBy="manager" making manager as 
     * the relationship owner and thus which manages the foreign relationship within table.
     * Also the annotation @JoinColumn is defined on manager making it the relationship owner. 
     * @JoinColumn defines the joining column which in our case is manager_id.
     */
     
    //El rol del supervisor (Un supervisor puede tener varios subordinados) Muchos a uno
    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="manager_id") //Owner de la relación es el manager
    private Employee manager;
 
    //El rol del subordinado (Al subordinado lo dirige un supervisor) Uno a muchos
    @OneToMany(mappedBy="manager") //Mapeado desde el manager que es el owner de la relación
    private Set<Employee> subordinates = new HashSet<Employee>();
 
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

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Set<Employee> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(Set<Employee> subordinates) {
		this.subordinates = subordinates;
	}        
 
}