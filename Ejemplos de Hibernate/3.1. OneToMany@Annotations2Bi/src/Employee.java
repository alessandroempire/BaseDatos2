import java.sql.Date;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 

@Entity
@Table(name="EMPLOYEE")
public class Employee {
 
    @Id
    @GeneratedValue
    @Column(name="employee_id")
    private Long employeeId;
     
    @Column(name="firstname")
    private String firstname;
     
    @Column(name="lastname")
    private String lastname;
     
    @Column(name="birth_date")
    private Date birthDate;
     
    @Column(name="cell_phone")
    private String cellphone;
 
    
    @ManyToOne //Significa que estoy mapeando de muchos a uno, porque el empleado trabaja en 1 dpto
    @JoinColumn(name="department_id") //La columna por la que hace Join es department_id
    private Department department;
     
	public Employee(String firstname, String lastname, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        //this.birthDate = new Date(System.currentTimeMillis());
        this.cellphone = phone;
    }
 
    public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}