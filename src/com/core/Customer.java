package com.core;

import java.time.LocalDate;

public class Customer {

	static int accid;
	static {
		accid = 1000;
	}

	private int customerId;
	private String fName, lName, email, password;
	private double regAmount;
	private LocalDate dob;
	private ServicePlan plan;

	public Customer(String fName, String lName, String email, String password, double regAmount, LocalDate dob,
			ServicePlan plan) {
		super();
		this.customerId = accid++;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", fName=" + fName + ", lName=" + lName + ", email=" + email
				+ ", regAmount=" + regAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			return this.email.equals(((Customer) obj).email);
		}
		return false;
	}

}
