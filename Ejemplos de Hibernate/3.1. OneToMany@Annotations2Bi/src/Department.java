import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;
 
@Entity
@Table(name="DEPARTMENT")
public class Department {
 
    @Id
    @GeneratedValue
    @Column(name="DEPARTMENT_ID")
    private Long departmentId;
     
	@Column(name="DEPT_NAME")
    private String departmentName;
     
    //Esto es opcional, se está haciendo bidireccionalmente.
    //Mapeando desde Departamento a Empleado, ya que en el dpto trabajan muchos empleados.
	//Estoy colocando OneToMany, pero como es Many debo expresar que es un set de empleados.
    @OneToMany(mappedBy="department") //Mapeado desde el dpto (Nombre del private Department department)
    private Set<Employee> employees;
    //private Employee employees;

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public Long getDepartmentId() {
 		return departmentId;
 	}

 	public void setDepartmentId(Long departmentId) {
 		this.departmentId = departmentId;
 	}

 	public String getDepartmentName() {
 		return departmentName;
 	}

 	public void setDepartmentName(String departmentName) {
 		this.departmentName = departmentName;
 	}

 
}
