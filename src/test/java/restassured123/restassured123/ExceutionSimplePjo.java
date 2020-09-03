package restassured123.restassured123;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class ExceutionSimplePjo {

	public static void main(String[] args) {
		
		SimplePojo sp = new SimplePojo();
		sp.setFirstname("Simple");
		sp.setLastname("Pojo");
		sp.setId(100);
		sp.setRecording(5);
		
		Response res = 
				given().contentType(ContentType.JSON).body(sp)
				.when().post("http://localhost:3000/sendmessage");
		
		System.out.println("simple pojo code:" + res.statusCode() );
		System.out.println("Simple pojo body to be print: " + res.asString());
		

	}

}
