import java.util.Date;
import java.util.HashSet;
import java.util.Set;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="MEETING")
public class Meeting {
 
    @Id
    @Column(name="MEETING_ID")
    @GeneratedValue
    private Long meetingId;
 
	@Column(name="SUBJECT")
    private String subject;
     
    @Column(name="MEETING_DATE")
    private Date meetingDate;
     
   //Mapeando desde Meeting, y meeting tiene un set de empleados 
    @ManyToMany(mappedBy="meetings") //Se debe colocar el nombre del set de meetings que se creo en Employee
    private Set<Employee> employees = new HashSet<Employee>();
     
    public Meeting(String subject) {
        this.subject = subject;
        this.meetingDate = new Date();
    }
    
    public Long getMeetingId() {
  		return meetingId;
  	}

  	public void setMeetingId(Long meetingId) {
  		this.meetingId = meetingId;
  	}

  	public String getSubject() {
  		return subject;
  	}

  	public void setSubject(String subject) {
  		this.subject = subject;
  	}

  	public Date getMeetingDate() {
  		return meetingDate;
  	}

  	public void setMeetingDate(Date meetingDate) {
  		this.meetingDate = meetingDate;
  	}

  	public Set<Employee> getEmployees() {
  		return employees;
  	}

  	public void setEmployees(Set<Employee> employees) {
  		this.employees = employees;
  	} 
   
}