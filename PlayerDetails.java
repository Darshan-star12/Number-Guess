package com.Numberguess;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Playerdetails {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private long contact;
	private int age;
	private double amount;
	private double investAmount;
	private String userEnetredNumber;
	private String systemGeneratedNumber;
	public String getSystemGeneratedNumber() {
		return systemGeneratedNumber;
	}
	public void setSystemGeneratedNumber(String systemGeneratedNumber) {
		this.systemGeneratedNumber = systemGeneratedNumber;
	}
	private double totalAmountEarnedAfterTheMatch;

	
	public double getInvestAmount() {
		return investAmount;
	}
	public void setInvestAmount(double investAmount) {
		this.investAmount = investAmount;
	}
	public String getUserEnetredNumber() {
		return userEnetredNumber;
	}
	public void setUserEnetredNumber(String userEnetredNumber) {
		this.userEnetredNumber = userEnetredNumber;
	}
	public double getTotalAmountEarnedAfterTheMatch() {
		return totalAmountEarnedAfterTheMatch;
	}
	public void setTotalAmountEarnedAfterTheMatch(double totalAmountEarnedAfterTheMatch) {
		this.totalAmountEarnedAfterTheMatch = totalAmountEarnedAfterTheMatch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	

}
