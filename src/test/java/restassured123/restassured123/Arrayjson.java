package restassured123.restassured123;

import static com.jayway.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Arrayjson {
	public static void main(String[] args) {
		JSONObject obj1 = new JSONObject();
		obj1.put("company", "franconnect");
		obj1.put("profile", "Qa");

		JSONObject obj2 = new JSONObject();
		obj2.put("Address", "Noida");

		JSONArray ar1 = new JSONArray();
		ar1.put(0, obj1);
		ar1.put(1, obj2);

		JSONObject obj3 = new JSONObject();
		obj3.put("Testing", "Arrayjson");
		obj3.put("array", ar1);

		JSONObject obj4 = new JSONObject();
		obj4.put("Name", "Mrityunjay123");
		obj4.put("Lastname", "K2");
		obj4.put("id", "003");
		obj4.put("object", obj3);

		Response res = given().contentType(ContentType.JSON).body(obj4.toString()).when()
				.post("http://localhost:3000/comments");
		System.out.println(res.statusCode());
		System.out.println(res.asString());

	}

}
