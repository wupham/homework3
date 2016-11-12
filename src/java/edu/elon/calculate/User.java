/*
 Copyright © 2016 Wes Upham, Sarah Hennenkamp, and Nick Richu
 */
package edu.elon.calculate;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

	private String amount;
	private double rate;
	private double years;
	private ArrayList value;
        private ArrayList numYears;
        

	public User() {
		amount = "";
		rate = 0;
		years = 0;
		value = null;
                numYears = null;
	}

	public User(String amount, double rate, double years, ArrayList value, ArrayList numYears) {
		this.amount = amount;
		this.rate = rate;
		this.years = years;
		this.value = value;
                this.numYears = numYears;
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
	public ArrayList getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(ArrayList value) {
		this.value = value;
	}
        
        public ArrayList getNumYears() {
		return numYears;
	}

	/**
	 * @param numYears the value to set
	 */
	public void setNumYears(ArrayList numYears) {
		this.numYears=numYears;
	}
}
