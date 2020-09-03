package restassured123.restassured123;

import static com.jayway.restassured.RestAssured.*;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;



public class SimmplePojoPratice {
	public static void main(String[] args) {
		JSONObject jb = new JSONObject();
		jb.put("name", "lucky123");
		jb.put("id", "123");
		
		Response res = given()
				.contentType(ContentType.JSON).body(jb.toString())
				.when().post("ui");
		
		
		
		
		
		
		
		
		
	
	
	

	}
}
