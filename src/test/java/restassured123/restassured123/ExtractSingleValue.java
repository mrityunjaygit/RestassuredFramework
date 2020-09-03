package restassured123.restassured123;

import static com.jayway.restassured.RestAssured.*;

import org.json.JSONArray;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class ExtractSingleValue {

	public static void main(String[] args) {
		
		Response res = 
				given().contentType(ContentType.JSON)
				.when().get("http://localhost:3000/sendmessage");
		System.out.println(res.asString());
		
		JSONArray js = new JSONArray(res.asString());
		
	
				

	}

}
