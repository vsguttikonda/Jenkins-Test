package JenkinsTestCase;


import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.get;


public class ValidateCustomer {

		
		@Test
		public void sendGetRequest() {
		
					
			  Response response =  get ("https://reqres.in/api/users?page=2"); //sending get request and saving response
			  
			  response.prettyPrint();    //printing the response in json format
			  System.out.println ("Status code in response:-  "+response.statusCode());
			  System.out.println ("Response Time:-  "+response.getTime());
					
				}
		
}