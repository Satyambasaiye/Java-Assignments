package com.core;

import java.time.LocalDate;

public class Customer implements Comparable<Customer> {

	static int accid;
	static {
		accid = 1000;
	}

	private int customerId;
	private String fName, lName, email, password;
	private double regAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private LocalDate lastSubscriptionPaidDate;

	public Customer(String fName, String lName, String email, String password, double regAmount, LocalDate dob,
			ServicePlan plan, LocalDate lastSubscriptionPaidDate) {
		super();
		this.customerId = accid++;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
		this.lastSubscriptionPaidDate = lastSubscriptionPaidDate;
	}

	public LocalDate getLastSubscriptionPaidDate() {
		return lastSubscriptionPaidDate;
	}

	public void setLastSubscriptionPaidDate(LocalDate lastSubscriptionPaidDate) {
		this.lastSubscriptionPaidDate = lastSubscriptionPaidDate;
	}

	public static int getAccid() {
		return accid;
	}

	public int getCustomerId() {
		return customerId;
	}

	@Override
	public int compareTo(Customer obj) {

		return this.email.compareTo(obj.email);
	}

	public Customer(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "cust.Id=" + customerId + ", Name=" + fName + " " + lName + ", email=" + email + ", regAmount="
				+ regAmount + ", dob=" + dob + ", plan=" + plan + ", last sub. Date=" + lastSubscriptionPaidDate;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			return this.email.equals(((Customer) obj).email);
		}
		return false;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public LocalDate lastSubscriptionPaidDate() {
		return lastSubscriptionPaidDate;
	}

}
