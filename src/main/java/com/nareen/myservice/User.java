package com.nareen.myservice;

public class User {
	private int userId;
	private String userName;
	private String cardDetails;
	private String cardCvv;
	private int cardExp;
	private int balance;
	public User(String userName, String cardDetails, String cardCvv, int cardExp, int balance) {
		this.userName = userName;
		this.cardDetails = cardDetails;
		this.cardCvv = cardCvv;
		this.cardExp = cardExp;
		this.balance = balance;
	}
	public User() {
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
	public String getCardDetails() {
		return cardDetails;
	}
	public void setCardDetails(String cardDetails) {
		this.cardDetails = cardDetails;
	}
	public String getCardCvv() {
		return cardCvv;
	}
	public void setCardCvv(String cardCvv) {
		this.cardCvv = cardCvv;
	}
	public int getCardExp() {
		return cardExp;
	}
	public void setCardExp(int cardExp) {
		this.cardExp = cardExp;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public boolean equals(User user) {
		if(this.getUserName().equals(user.getUserName())&&this.getCardDetails().equals(user.getCardDetails())
				&&this.getCardCvv().equals(user.getCardCvv())&&(this.getCardExp()==user.getCardExp())){
			return true;
		}else {
		return false;
	}
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", cardDetails=" + cardDetails + ", cardCvv="
				+ cardCvv + ", cardExp=" + cardExp + ", balance=" + balance + "]";
	}
	

	
}
