package utils;

import static utils.CustomerUtils.duplicateCustomer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.core.Customer;
import com.core.ServicePlan;

import Custome_exceptions.CustomException;

public class CustomerUtils {

//to find the customer by email id
	public static Customer findByEmail(String email, List<Customer> list) throws CustomException {
		int index = list.indexOf(new Customer(email));
		if (index < 0)
			throw new CustomException("invalid email please enter valid email!");
		return list.get(index);
	}

//to update the password
	public static boolean updatePass(String email, String password, String newPassword, List<Customer> list)
			throws CustomException {
		Customer loggedIn = findByEmail(email, list);
		if (loggedIn.getPassword().equals(password)) {
			loggedIn.setPassword(newPassword);
			return true;
		}
		throw new CustomException("invalid password, password is not updated");
	}

//to remove customer using email 
	public static boolean removeCustomer(String email, List<Customer> list) throws CustomException {
		if (list.remove(new Customer(email))) {
			return true;
		}
		throw new CustomException("Customer not found!!");

	}
	public static List<Customer>sampleData(){
		List<Customer>sample=new ArrayList<>();
		sample.add(new Customer("Satyam", "basaiye", "s@.com", "sass", 2000, LocalDate.parse("2001-11-03"),ServicePlan.GOLD));
		sample.add(new Customer("tushar", "makude", "tm@.com", "tass", 5000, LocalDate.parse("2000-10-03"),ServicePlan.DIAMOND));
		sample.add(new Customer("amarsingh", "pardeshi", "ap@.com", "aass", 1000, LocalDate.parse("1996-11-25"),ServicePlan.SILVER));
		sample.add(new Customer("himanshu", "trivedi", "st@.com", "hass", 10000, LocalDate.parse("2000-01-20"),ServicePlan.PLATINUM));
		sample.add(new Customer("pratik", "warade", "pw@.com", "pass", 2000, LocalDate.parse("2000-01-03"),ServicePlan.GOLD));
		sample.add(new Customer("shivanshu", "dont Know", "sh@.com", "sass", 1000, LocalDate.parse("1999-08-03"),ServicePlan.SILVER));
		sample.add(new Customer("shivanshu4", "dont Know", "sh@.com4", "sass", 1000, LocalDate.parse("1999-08-03"),ServicePlan.SILVER));
		sample.add(new Customer("shivanshu2", "dont Know", "sh@.com2", "sass", 1000, LocalDate.parse("1999-08-03"),ServicePlan.SILVER));
		sample.add(new Customer("shivanshu3", "dont Know", "sh@.com3", "sass", 1000, LocalDate.parse("1999-08-03"),ServicePlan.SILVER));
		sample.add(new Customer("shivanshu1", "dont Know", "sh@.com1", "sass", 1000, LocalDate.parse("1999-08-03"),ServicePlan.SILVER));

		return sample;
	}
	public static String duplicateCustomer(String email,List<Customer>list)throws CustomException 
	{
		Customer cust=findByEmail(email, list);
		if(cust.getEmail().equals(email)) 
			throw new CustomException("Customer already exist!!!");
		
		return email;
	}
	
	}
