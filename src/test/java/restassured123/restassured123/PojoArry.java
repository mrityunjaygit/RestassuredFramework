package restassured123.restassured123;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PojoArry {
	public static void main(String[] args) {
		AddressOfArray3[] add = new AddressOfArray3[3];
		add[0] = new AddressOfArray3();
		add[0].setQrno("2380");
		add[0].setStreet("croad");
		add[0].setCity("bokaro");
		
		add[1]= new AddressOfArray3();
		add[1].setQrno("1234");
		add[1].setStreet("broad");
		add[1].setCity("noida");
		
		BodyOfArray2 bodydata = new BodyOfArray2();
		bodydata.setPhone(1234);
		bodydata.setTittle("pojo array");
		bodydata.setAddress1(add);
		
		BodyOfArray1 b = new BodyOfArray1();
		b.setFirstname("mj");
		b.setLastname("kk");
		b.setBody(bodydata);
		
		Response res =
				given().contentType(ContentType.JSON).body(b).
				when().post("http://localhost:3000/friendRequest");
		System.out.println(res.statusCode());
		System.out.println(res.asString());
		
		
		
		
	}
	

}
