<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="http://localhost:8080/myCardservice/rest/PaymentService2/authenticate2" method="POST">
		<label><b>Name on Card</b></label><br />
		<input type="text" placeholder="Enter CardHolder Name" name="userName" required>
		<br/> 
		<label><b>Card Number</b></label><br />
		<input type="text" placeholder="Enter Card Details" name="cardDetails"required>
		 <br/>
		 <label><b>Card CVV</b></label><br />
		 <input type="password" placeholder="Enter Card CVV" name="cardCvv"required>
		 <br/>
		 <input type="text" placeholder="Enter Exp Year" name="cardExp"required>
		 <br/>
		  <input type="text" placeholder="price" name="price"required>
		 <br/>
		 <input type="submit" value="Make Payment">
	</form>
</body>
</html>