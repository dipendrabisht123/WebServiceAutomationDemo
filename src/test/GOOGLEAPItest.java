package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class GOOGLEAPItest {

	/*@BeforeClass
	  public void setBaseUri () {

	    RestAssured.baseURI = "https://maps.googleapis.com";
	  }*/

	  @Test
	  public void testStatusCode () {
		/*RestAssured.baseURI = "https://maps.googleapis.com";
	    Response res = RestAssured.given ()
	    .param ("query", "restaurants in mumbai")
	    .param ("key", "")
	    .when()
	    .get ("/maps/api/place/textsearch/json");
	    
	    System.out.println(res.asString());

	    Assert.assertEquals (res.statusCode (), 200);*/
	  }
}
