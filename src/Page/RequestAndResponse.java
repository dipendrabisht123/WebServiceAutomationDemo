package Page;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestAndResponse {
	
	public static void getWeatherDetils () throws ParseException{
		
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.get("/Bangalore");
		
		System.out.println(response.asString());
		
		JSONParser jParser = new JSONParser ();
		
		JSONObject jObject = (JSONObject) jParser.parse(response.asString());
		
		
		System.out.println("*** Values after parsing REST API response in JSON to String ***");
		// getting City:
		String city = (String) jObject.get("City");
		System.out.println("City: "+city);
		
		System.out.println("Temperature: "+(String) jObject.get("Temperature"));
		System.out.println("Humidity: "+(String) jObject.get("Humidity"));
		System.out.println("WeatherDescription: "+(String) jObject.get("WeatherDescription"));
		System.out.println("WindSpeed: "+(String) jObject.get("WindSpeed"));
		
		
	}
}
