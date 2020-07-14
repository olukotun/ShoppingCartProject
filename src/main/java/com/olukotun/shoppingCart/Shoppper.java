package com.olukotun.shoppingCart;

import java.util.List;

import com.olukotun.shoppingCart.creditCard.CreditCard;
import com.olukotun.shoppingCart.item.Items;

public class Shoppper {
	
	private String name;
	private int age;
	
	
	
	private CreditCard creditCard;
	
	
	private List<Items> items;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	public Shoppper(List<Items> items) {
		super();
		this.items = items;
	}


	public Shoppper(String name, int age, CreditCard creditCard, List<Items> items) {
		super();
		this.name = name;
		this.age = age;
		this.creditCard = creditCard;
		this.items = items;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public CreditCard getCreditCard() {
		return creditCard;
	}


	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}


	public List<Items> getItems() {
		return items;
	}


	public void setItems(List<Items> items) {
		this.items = items;
	}


	@Override
	public String toString() {
		return "Shoppper [name=" + name + ", creditCard=" + creditCard + ", items=" + items + "]";
	}
	
	
	
	
	

}
