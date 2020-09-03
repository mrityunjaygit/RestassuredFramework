package restassured123.restassured123;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class ComplexJson {
	public static void main(String[] args) {
		JSONObject obj1 = new JSONObject();
		obj1.put("Address", "Noida");
		obj1.put("job", "Qa");

		JSONObject obj2 = new JSONObject();
		obj2.put("Name", "Mrityunjay");
		obj2.put("lastname", "k2");
		obj2.put("Innervalue", "obj1");

		Response res = given().contentType(ContentType.JSON).body(obj2.toString())
				.when()
				.post("http://localhost:3000/comments");
		System.out.println(res.statusCode());
		System.out.println(res.asString());

	}

}
