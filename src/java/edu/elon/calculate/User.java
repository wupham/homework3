/*
 Copyright © 2016 Wes Upham and Sarah Hennenkamp
 */
package edu.elon.calculate;

import java.io.Serializable;

public class User implements Serializable {

	private String amount;
	private double rate;
	private double years;
	private double value;

	public User() {
		amount = "";
		rate = 0;
		years = 0;
		value = 0;
	}

	public User(String amount, double rate, double years, double value) {
		this.amount = amount;
		this.rate = rate;
		this.years = years;
		this.value = value;
	}

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	/**
	 * @return the years
	 */
	public double getYears() {
		return years;
	}

	/**
	 * @param years the years to set
	 */
	public void setYears(double years) {
		this.years = years;
	}

	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}
}
