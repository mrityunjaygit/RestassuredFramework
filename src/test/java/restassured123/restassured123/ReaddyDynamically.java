package restassured123.restassured123;

import static com.jayway.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;


public class ReaddyDynamically {
	public static void main(String[] args) throws FileNotFoundException {
		
	File f = new File("../restassured123/DynamicallyDataFile.json");
	FileReader read = new FileReader(f);
	JSONTokener js = new JSONTokener(read);
	JSONObject obj = new JSONObject(js);
	String bodydata = obj.toString();
	bodydata = bodydata.replaceAll(Pattern.quote("{{"+"firstname" + "}}"), "new mrityunjay");
	bodydata = bodydata.replaceAll(Pattern.quote("{{"+"lastname" + "}}"), "lastname mrityunjay");
	bodydata = bodydata.replaceAll(Pattern.quote("{{"+"tille" + "}}"), "QAAA");
	System.out.println(bodydata);
	
	Response res = 
			given().contentType(ContentType.JSON).body(bodydata)
			.when().post("http://localhost:3000/friendRequest");
	
	System.out.println(res.getStatusCode());
	System.out.println(res.asString());
	
	
	
	
	
	
	}	

}
