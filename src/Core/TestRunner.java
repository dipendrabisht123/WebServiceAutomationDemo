package Core;

import java.awt.PageAttributes.MediaType;

import org.json.simple.parser.ParseException;
import org.omg.CORBA.Request;

import Page.RequestAndResponse;
import io.restassured.response.Response;

public class TestRunner {

	public static void main(String[] args) throws ParseException {
		
		RequestAndResponse.getWeatherDetils();
		
		
	}

}
