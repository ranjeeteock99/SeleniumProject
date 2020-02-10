package restAssuredTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class getRequest {
	@Test
	public void getWeatherDetails()
	{
		given()
	    .when()
		   .get("https://reqres.in/api/users?page=2")
		   .then()
		   .statusCode(200);
		
		
		
	}




}