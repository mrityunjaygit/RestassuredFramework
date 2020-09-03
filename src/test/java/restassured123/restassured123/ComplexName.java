package restassured123.restassured123;

public class ComplexName {
	String firstname;
	String lastname;
	String address;
	ComplexAddress newaddress;

	public ComplexAddress getNewaddress() {
		return newaddress;
	}
	public void setNewaddress(ComplexAddress newaddress) {
		this.newaddress = newaddress;
	}
	int id;
	public String getFirstname() {
		return firstname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
