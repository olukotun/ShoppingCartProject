package com.olukotun.shoppingCart.creditCard;

import java.util.Date;

public class CreditCard {
	
	private String name;
	private String cardNo;
	
	private int cvc;
	
	private double amount=400.00;
	
	private String type;
	
	
	private Date expirationDate;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCardNo() {
		return cardNo;
	}


	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}


	public int getCvc() {
		return cvc;
	}


	public void setCvc(int cvc) {
		this.cvc = cvc;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Date getExpirationDate() {
		return expirationDate;
	}


	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
