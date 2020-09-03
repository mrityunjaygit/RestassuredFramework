package restassured123.restassured123;

public class BasicInfo {
	
	String firstname;
	String last;
	Address add;
	Address[] add2;
	public Address[] getAdd2() {
		return add2;
	}
	public void setAdd2(Address[] add2) {
		this.add2 = add2;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	String profile;
	

}
