package com.CRM.SDET37.GenericUtility;

import io.restassured.response.Response;

public class RestAssuredLibrary {
	
	public String getJsonData(Response response, String path) {
		String jsonData = response.jsonPath().get(path);
		return jsonData;
	}
}
