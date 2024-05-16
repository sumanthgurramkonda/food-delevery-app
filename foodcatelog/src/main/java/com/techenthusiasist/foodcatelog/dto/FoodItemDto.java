package com.techenthusiasist.foodcatelog.dto;


public class FoodItemDto {
	
	private int id;
	private String itemName;
	private String itemDescription;
	private boolean isVeg;
	private Number price;
	private Integer restaurantId;
	private Integer quantity;
	
	
	public FoodItemDto() {
		
	}


	public FoodItemDto(int id, String itemName, String itemDescription, boolean isVeg, Number price,
			Integer restaurantId, Integer quantity) {
		this.id = id;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.isVeg = isVeg;
		this.price = price;
		this.restaurantId = restaurantId;
		this.quantity = quantity;
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


	public String getItemDescription() {
		return itemDescription;
	}


	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}


	public boolean isVeg() {
		return isVeg;
	}


	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}


	public Number getPrice() {
		return price;
	}


	public void setPrice(Number price) {
		this.price = price;
	}


	public Integer getRestaurantId() {
		return restaurantId;
	}


	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
