package restassured123.restassured123;

import static com.jayway.restassured.RestAssured.*;

import org.json.JSONArray;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class GetRequest {
	public static void main(String[] args) {

		Response res = given().contentType(ContentType.JSON).when().get("http://localhost:3000/friends");

		// System.out.println("Data fetched:"+ res.asString());

		JSONArray js = new JSONArray(res.asString());

		int l = js.length();
		for (int i = 0; i < l; i++) {

			String value = js.getJSONObject(i).getString("firstname");
			// int id1 = Integer.parseInt(js.getJSONObject(2).getString("id"));
			System.out.println(value);
		}

		System.out.println("Status Code:" + res.statusCode());

	}

}
