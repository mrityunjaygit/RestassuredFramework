package restassured123.restassured123;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class SimpleJson {

	public static void main(String[] args) {
		JSONObject obj1 = new JSONObject();
		obj1.put("Name", "Mrityunjay");
		obj1.put("lastname", "kumar");
		obj1.put("phone", "9540099***");
		obj1.put("id", "0001");

		Response res = given().contentType(ContentType.JSON).body(obj1.toString())
				.when()
				.post("http://localhost:3000/friends");
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
	}

}
