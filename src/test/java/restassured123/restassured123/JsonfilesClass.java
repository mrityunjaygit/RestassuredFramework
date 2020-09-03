package restassured123.restassured123;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;



public class JsonfilesClass {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("../restassured123/BodyData.json");
		FileReader fr = new FileReader(f);
		JSONTokener jk = new JSONTokener(fr);
		JSONObject obj = new JSONObject(jk);
		
		System.out.println(obj.toString());
		
	 Response res =
			 given().contentType(ContentType.JSON).body(obj).
			 when().post("http://localhost:3000/friendRequest");
				System.out.println(res.statusCode());
				System.out.println(res.toString());
		
				
	
	}

}
