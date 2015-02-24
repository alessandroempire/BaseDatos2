package paquete;

public class Person1 {

	private Integer id1;
	private String first_name1;
    private String last_name1;
    
    public Person1(String firstname, String lastname) {
        this.first_name1 = firstname;
        this.last_name1 = lastname;
    }
     
    //setter-getter methods
 
    public Integer getId1() {
		return id1;
	}

	public void setId1(Integer id1) {
		this.id1 = id1;
	}

	public String getFirst_name1() {
		return first_name1;
	}

	public void setFirst_name1(String first_name1) {
		this.first_name1 = first_name1;
	}

	public String getLast_name1() {
		return last_name1;
	}

	public void setLast_name1(String last_name1) {
		this.last_name1 = last_name1;
	}

}