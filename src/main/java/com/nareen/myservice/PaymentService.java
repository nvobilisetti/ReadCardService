package com.nareen.myservice;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@Path("/PaymentService")
public class PaymentService {

	private static final Logger log = LogManager.getLogger(PaymentService.class);
	ManageUser manageUser = new ManageUser();
	private final static String SUCCESS = "<response>SUCCESS</response>";
	private final static String FAILURE = "<response>FAILURE</response>";

	@POST
	@Path("/authenticate") //TODO: use appropriate naming for REST resource
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_XML)
	public String authenticate(@FormParam("userName") String userName, @FormParam("cardDetails") String cardDetails,
			@FormParam("cardCvv") String cardCvv, @FormParam("cardExp") int cardExp, @FormParam("price") int price) {

		cardDetails = manageUser.generateHash(cardDetails);
		cardCvv = manageUser.generateHash(cardCvv);
		List<User> list = manageUser.userList(userName, cardDetails, cardCvv, cardExp, price);
		if (list != null) {
			// Asuming that only one unique entry per table//
			log.info("yes user foundddd");
			int userId = list.get(0).getUserId();
			log.info("user id is "+userId);
			manageUser.updateBalance(userId, (list.get(0).getBalance() - price));
			log.info("Succefully updated");
			return SUCCESS;
		} else {
			log.info("Failed to updated");
			return FAILURE;
		}

	}
}
