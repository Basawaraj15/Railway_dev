package com.example.shop.util;

import java.io.UnsupportedEncodingException;

import com.example.shop.model.OrderAddress;
import com.example.shop.model.Product;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.example.shop.model.ProductOrder;
import com.example.shop.model.UserDtls;
import com.example.shop.service.UserService;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class CommonUtil {

	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private UserService userService;

	public Boolean sendMailForProductOrder1(ProductOrder order, String status) throws Exception {

	    msg = "<p>Hello [[name]],</p>"
	            + "<p>Thank you order <b>[[orderStatus]]</b>.</p>"
	            + "<p><b>Product Details:</b></p>"
	            + "<p>Name : [[productName]]</p>"
	            + "<p>Category : [[category]]</p>"
	            + "<p>Quantity : [[quantity]]</p>"
	            + "<p>Price : [[price]]</p>"
	            + "<p>Payment Type : [[paymentType]]</p>";

	    MimeMessage message = mailSender.createMimeMessage();
	    MimeMessageHelper helper = new MimeMessageHelper(message);

	    helper.setFrom("basavarajhiremath632@gmail.com",
	 "E-commerce");
	    OrderAddress orderAddress = order.getOrderAddress();
	    String recipientEmail = orderAddress.getEmail();
	    helper.setTo(recipientEmail);

	    // Access properties directly using getter methods (assuming they exist)
	    msg = msg.replace("[[name]]", orderAddress.getName()); // Assuming OrderAddress has a getName() method
	    msg = msg.replace("[[orderStatus]]", status);
	    msg = msg.replace("[[productName]]", order.getProduct().getTitle()); // Assuming Product has a getTitle() method
	    msg = msg.replace("[[category]]", order.getProduct().getCategory()); // Assuming Product has a getCategory() method
	    msg = msg.replace("[[quantity]]", order.getQuantity().toString());
	    msg = msg.replace("[[price]]", order.getPrice().toString());
	    msg = msg.replace("[[paymentType]]", order.getPaymentType());

	    helper.setSubject("Product Order Status");
	    helper.setText(msg, true);
	    mailSender.send(message);
	    return true;
	}
	public static String generateUrl(HttpServletRequest request) {

		// http://localhost:8080/forgot-password
		String siteUrl = request.getRequestURL().toString();

		return siteUrl.replace(request.getServletPath(), "");
	}
	
	String msg=null;;
	
	public Boolean sendMailForProductOrder(ProductOrder order,String status) throws Exception
	{
		
		msg="<p>Hello [[name]],</p>"
				+ "<p>Thank you order <b>[[orderStatus]]</b>.</p>"
				+ "<p><b>Product Details:</b></p>"
				+ "<p>Name : [[productName]]</p>"
				+ "<p>Category : [[category]]</p>"
				+ "<p>Quantity : [[quantity]]</p>"
				+ "<p>Price : [[price]]</p>"
				+ "<p>Payment Type : [[paymentType]]</p>";
		
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		helper.setFrom("basavarajhiremath632@gmail.com", "E-commerce");
		OrderAddress orderAddress = order.getOrderAddress(); // No casting needed here
	    String recipientEmail = orderAddress.getEmail(); 
	    helper.setTo(recipientEmail);

	    msg = msg.replace("[[name]]", orderAddress.getName());
	    msg=msg.replace("[[orderStatus]]",status);
	    msg = msg.replace("[[productName]]", order.getProduct().getTitle());
	    msg = msg.replace("[[category]]", order.getProduct().getCategory());
		msg=msg.replace("[[quantity]]", order.getQuantity().toString());
		msg=msg.replace("[[price]]", order.getPrice().toString());
		msg=msg.replace("[[paymentType]]", order.getPaymentType());
		
		helper.setSubject("Product Order Status");
		helper.setText(msg, true);
		mailSender.send(message);
		return true;
	}
	
	public UserDtls getLoggedInUserDetails(Principal p) {
		String email = p.getName();
		UserDtls userDtls = userService.getUserByEmail(email);
		return userDtls;
	}
	public Boolean sendMail(String recipientEmail, String url) throws MessagingException {
	    // Create a MimeMessage and MimeMessageHelper
	    MimeMessage message = mailSender.createMimeMessage();
	    MimeMessageHelper helper = new MimeMessageHelper(message, true);  // true to indicate HTML content

	    // Set sender, recipient, subject, and content
	    helper.setFrom("basavarajhiremath632@gmail.com");
	    helper.setTo(recipientEmail);  // Ensure this is a valid email address

	    // Corrected HTML content with proper anchor tag
	    String content1 = "<p>Hello,</p>"
	            + "<p>You have requested to reset your password.</p>"
	            + "<p>Click the link below to change your password:</p>"
	            + "<p><a href=\"" + url + "\">Change my password</a></p>";  // Corrected href attribute

	    helper.setSubject("Password Reset");
	    helper.setText(content1, true);  // true to send HTML content

	    // Send the email
	    mailSender.send(message);
	    return true;
	}


}
	

