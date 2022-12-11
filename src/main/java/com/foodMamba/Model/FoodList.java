package com.foodMamba.Model;



/*
 * This is a POJO Class - this class has no special feature its just created to use our variables properly.
 * */
public class FoodList {
	
	private int id;
	private String itemName;
	private int itemPrice;
	
	public FoodList(int id, String itemName, int itemPrice) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
	
}
