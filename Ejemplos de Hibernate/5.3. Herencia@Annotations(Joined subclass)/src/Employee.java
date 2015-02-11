import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
 
@Entity
@Table(name="EMPLOYEE")
/*Both Employee and Owner classes are child of Person class. 
 * Thus while specifying the mappings, we used @PrimaryKeyJoinColumn to map it to 
 * parent table.
 * @PrimaryKeyJoinColumn – This annotation specifies a primary key column that is used as a 
 * foreign key to join to another table.
 */
@PrimaryKeyJoinColumn(name="PERSON_ID")
public class Employee extends Person {
 
    @Column(name="joining_date")
    private Date joiningDate;
    
	@Column(name="department_name")
    private String departmentName;
	
    public Employee(String firstname, String lastname, String departmentName, Date joiningDate) {
        
        super(firstname, lastname);
        this.departmentName = departmentName;
        this.joiningDate = joiningDate;
    }
     
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