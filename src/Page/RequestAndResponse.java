package Page;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Page.Base.PageBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestAndResponse extends PageBase {
	
	public static void getWeatherDetils () throws ParseException{
		
		// Direct call
		/*RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();*/
		
		RequestSpecification httpRequest = getRequestSpec();
		
		Response response = httpRequest.get("/Delhi");
		System.out.println("Response in JSON format: \n"+response.asString());
		
		JSONParser jParser = new JSONParser ();
		JSONObject jObject = (JSONObject) jParser.parse(response.asString());
		
		
		System.out.println("\n*** Values after parsing REST API response in JSON to String ***");
		// getting City:
		String city = (String) jObject.get("City");
		System.out.println("City: "+city);
		
		System.out.println("Temperature: "+(String) jObject.get("Temperature"));
		System.out.println("Humidity: "+(String) jObject.get("Humidity"));
		System.out.println("WeatherDescription: "+(String) jObject.get("WeatherDescription"));
		System.out.println("WindSpeed: "+(String) jObject.get("WindSpeed"));
		
		
	}
}
