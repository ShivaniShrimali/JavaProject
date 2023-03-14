package com.assinmentjava.entity;
public class Account {
private int balance;
private String acc_Number;
public Account(int balance, String acc_Number) {
	
	this.balance = balance;
	this.acc_Number = acc_Number;
}
public Account() {

}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public String getAcc_Number() {
	return acc_Number;
}
public void setAcc_Number(String acc_Number) {
	this.acc_Number = acc_Number;
}

@Override
	public boolean equals(Object obj) {
	Account other = (Account) obj;
	return this.acc_Number == other.acc_Number;
		
	}

@Override
public String toString() {
	return balance + " : " + acc_Number;
}


}
