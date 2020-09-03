package restassured123.restassured123;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class GivenRequest {
  
	public static void main(String[] args) {
		Response res =
				     given().contentType(ContentType.JSON)
		     .when().get("http://localhost:3000/friends");
		System.out.println(res.statusCode());
		System.out.println(res.asString());
	}
	
}
