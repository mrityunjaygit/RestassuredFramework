package restassured123.restassured123;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class ComplexPojo {

	public static void main(String[] args) {
		ComplexPh phone1 = new ComplexPh();
		phone1.setPhone(0000);
		
		ComplexAddress address = new ComplexAddress();
		address.setAddress("qr no.2380, noida");
		address.setPincode(201301);
		address.setNewphone(phone1);
		
		ComplexName name = new ComplexName();
		name.setFirstname("complex11");
		name.setLastname("pojo22");
		name.setId(300);
		name.setNewaddress(address);
	  
		Response res = 
				given().contentType(ContentType.JSON).body(name).
				when().post("http://localhost:3000/friendRequest");
		
		System.out.println("status code of complex pojo: "+ res.statusCode());
		System.out.println(res.asString());
		
		

	}

}
