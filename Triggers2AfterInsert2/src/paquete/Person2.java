package paquete;

public class Person2 {

	private Integer id2;
	private String first_name2;
    private String last_name2;
    
    public Person2() {
	}

    public Person2(String firstname, String lastname) {
        this.first_name2 = firstname;
        this.last_name2 = lastname;
    }

    //setter-getter methods
    
    public Integer getId2() {
		return id2;
	}

	public void setId2(Integer id2) {
		this.id2 = id2;
	}

	public String getFirst_name2() {
		return first_name2;
	}

	public void setFirst_name2(String first_name2) {
		this.first_name2 = first_name2;
	}

	public String getLast_name2() {
		return last_name2;
	}

	public void setLast_name2(String last_name2) {
		this.last_name2 = last_name2;
	}
    

}