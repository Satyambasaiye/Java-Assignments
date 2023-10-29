package utils;

import java.time.LocalDate;
import com.core.Customer;
import java.util.*;
import static utils.CustomerUtils.*;
import com.core.ServicePlan;

import Custome_exceptions.CustomException;

public class ValidationRules {
//validate plan
	public static ServicePlan validatePlan(String plan) {
		return ServicePlan.valueOf(plan.toUpperCase());
	}

//validate registration amount with plan
	public static double ValidateRegAmount(String plan, double regAmt) throws CustomException {
		if (ServicePlan.valueOf(plan).getCost() != regAmt) {
			throw new CustomException("There is no plan of amount:" + regAmt);
		}
		return regAmt;
	}

//validate customere
	public static boolean validateCustomer(String email, String password, List<Customer> list) throws CustomException {
		// List<Customer> list

		Customer loggedIn = findByEmail(email, list);

		if (loggedIn.getPassword().equals(password) == false) {
			throw new CustomException("invalid password try again!");
		}
		return true;
	}

//validate all inputes
	public static Customer validateAll(String fName, String lName, String email, String password, double regAmount,
			String dob, String plan,List<Customer>list) throws CustomException, IllegalArgumentException

	{
		return new Customer(fName, lName, duplicateCustomer(email,list), password, ValidateRegAmount(plan, regAmount), LocalDate.parse(dob),
				validatePlan(plan));
	}
}
