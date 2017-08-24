package com.nareen.myservice;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

public class CardServiceTester {
	private Client client;
	private String REST_SERVICE_URL = "http://localhost:8080/MyCarRestDemo/rest/CarService";
	private static final String SUCCESS_RESULT = "<result>success</result>";
	private static final String PASS = "pass";
	private static final String FAIL = "fail";

	private void init() {
		this.client = ClientBuilder.newClient();
	}

	public static void main(String[] args) {
		CardServiceTester cardTester = new CardServiceTester();

		cardTester.init();
		String res=cardTester.checkCardDetails("nareen","5312600011000000","123","2017");
		System.out.println(res);

	}

	public String checkCardDetails(String userName, String cardDetails, String cardCvv, String cardExp) {

		String result = null;
		Form form = new Form();
		form.param("userName", userName);
		form.param("cardDetails", cardDetails);
		form.param("cardCvv", cardCvv);
		form.param("cardExp", cardExp);

		String callResult = client.target(REST_SERVICE_URL ).request(MediaType.APPLICATION_XML)
				.put(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE), String.class);
		result = PASS;
		if (!SUCCESS_RESULT.equals(callResult)) {
			result = FAIL;
		}
		return result;
	}

}
