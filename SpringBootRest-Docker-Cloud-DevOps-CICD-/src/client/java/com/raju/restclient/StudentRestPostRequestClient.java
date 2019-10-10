package com.raju.restclient;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class StudentRestPostRequestClient {

	public static void main(String[] args) {
		// create request body
		/*{
			  "name": "Microservices",
			  "description": "10 Steps",
			  "steps": [
			    "Learn How to Break Things Up",
			    "Automate the hell out of everything",
			    "Have fun"
			  ]
			}*/
		
//		JSONObject request = new JSONObject();
//		request.put("name", "Microservices");
//		request.put("description", "10 Steps");

		// set headers
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		//HttpEntity<String> entity = new HttpEntity<String>(request.toString(), headers);

		// send request and parse result
		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<String> loginResponse = restTemplate
//		  .exchange("http://localhost:8080/students/Student1/courses", HttpMethod.POST, entity, String.class);
//		if (loginResponse.getStatusCode() == HttpStatus.OK) {
//		  JSONObject userJson = new JSONObject(loginResponse.getBody());
//		} else if (loginResponse.getStatusCode() == HttpStatus.UNAUTHORIZED) {
//		  // nono... bad credentials
//		}
	}
}
