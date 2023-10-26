package com.core;

import java.time.LocalDate;

public class ValidationRules {

	public static ServicePlan validatePlan(String plan) {
		return ServicePlan.valueOf(plan.toUpperCase());
	}

	public static double ValidateRegAmount(String plan, double regAmt) throws CustomException {
		if (ServicePlan.valueOf(plan).getCost() != regAmt) {
			throw new CustomException("registraction amount is not matched with plan amount");
		}
		return regAmt;
	}

	public static Customer validateAll(String fName, String lName, String email, String password, double regAmount,
			String dob, String plan) throws CustomException, IllegalArgumentException

	{
//		public Customer(String fName, String lName, String email, String password, double regAmount, LocalDate dob,ServicePlan plan) {

		return new Customer(fName, lName, email, password, ValidateRegAmount(plan, regAmount), LocalDate.parse(dob),
				validatePlan(plan));

	}

}
