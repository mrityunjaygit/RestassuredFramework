package restassured123.restassured123;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Day1 {
	
	public static void main(String[] args) {
		P2 p1=new P2();
		p1.setAddress("bokaro");
		p1.setQrno("2380");
		
		Pojo p = new Pojo();
		p.setName("pojo1");
		p.setId("12346");
		p.setDob("8th may");
		p.setP2(p1);
	Response res = given().contentType(ContentType.JSON).body(p)
		.when().post(" http://localhost:3000/comments");
	
	System.out.println("respose code is" +res.statusCode() );
	System.out.println(res.asString());
	
	
	}
	

}
