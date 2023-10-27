package utils;

import java.util.List;

import com.core.Customer;

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
}
