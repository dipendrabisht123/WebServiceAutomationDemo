package Page.Base;

import Core.Base.RequestBase;
import io.restassured.specification.RequestSpecification;


public class PageBase {
	private static RequestSpecification httpRequest;
	
	public static RequestSpecification getRequestSpec() {
		httpRequest = RequestBase.getRequestBase().getRequestSpecification();
		
		return httpRequest;
	}
	
	
	
	
	

}
