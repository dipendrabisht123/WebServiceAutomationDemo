package Core.Base;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RequestBase {
	
	private static RequestBase requestBaseInstance = null;
	private static RequestSpecification httpRequest;
	
	
	private RequestBase() {
		
	}
	
	
	
	
	public static RequestBase getRequestBase() {
		if (requestBaseInstance == null)
			requestBaseInstance = new RequestBase();
				
		return requestBaseInstance;
	}
	
	public RequestSpecification getRequestSpecification() {
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		httpRequest = RestAssured.given();
		
		return httpRequest;
	}

	
	

}
