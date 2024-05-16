package com.techenthusiasist.orderservice.dto;

public class UserDto {
	
	private int userId;
    private String userName;
    private String userPassword;
    private String address;
    private String city;
    
	public UserDto() {
		
	}

	public UserDto(int userId, String userName, String userPassword, String address, String city) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.address = address;
		this.city = city;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", address="
				+ address + ", city=" + city + "]";
	}
    
    
}
