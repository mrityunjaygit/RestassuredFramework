package restassured123.restassured123;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PostByPojo {

public static void main(String[] args) {
	
	/*Body body = new Body();
	body.setFirstname("Mrityunjay");
	body.setLastname("Kumar");
	body.setAge("26");
	body.setProfile("QA");
	body.setCompnyname("fran");
	
	
	Response res=
	given().contentType(ContentType.JSON).body(body)
	.when().post("http://localhost:3000/posts");
	 System.out.println(res.statusCode());
	 System.out.println(res.asString());*/
	
	//complex json........................
	
	/*Address ad=new Address();
	ad.setQr("2380");
	ad.setStreet("croad");
	
	BasicInfo bs = new BasicInfo();
	bs.setFirstname("LUCKY");
	bs.setLast("test");
	bs.setProfile("QA");
   bs.setAdd(ad);
   
  Response res=
		  (Response) given().contentType(ContentType.JSON)
  .body(bs)
  .when().post("http://localhost:3000/profile");
  System.out.println(res.statusCode());
  System.out.println(res.asString());
		  
	*/
	//Advanced program: ..................................
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
	
		
	}

}
