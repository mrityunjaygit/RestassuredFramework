package restassured123.restassured123;

public class ComplexAddress {
	String address;
	int pincode;
	ComplexPh newphone;
	public ComplexPh getNewphone() {
		return newphone;
	}
	public void setNewphone(ComplexPh newphone) {
		this.newphone = newphone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
