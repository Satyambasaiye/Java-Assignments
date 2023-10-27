package com.core;

public enum ServicePlan {
	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);

	private double planCost;

	ServicePlan(double planCost) {
		this.planCost = planCost;
	}

	public double getCost() {
		return this.planCost;
	}

	@Override
	public String toString() {
		return  planCost+ " "+name() ;
	}
}
