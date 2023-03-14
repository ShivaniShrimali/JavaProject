package com.assinmentja.entity;

import java.util.Comparator;

public class Account {
private int balance;
private String accNum;
public Account(int balance, String accNum) {
	
	this.balance = balance;
	this.accNum = accNum;
}
public Account() {
	
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public String getAccNum() {
	return accNum;
}
public void setAccNum(String accNum) {
	this.accNum = accNum;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return balance+" "+accNum;
	}
//sorting by balance in assending
public static Comparator<Account> accbalCom=new Comparator<Account>() {
	public int compare (Account a1,Account a2)
	{
		int balance1 =a1.getBalance();
		int balance2 =a2.getBalance();
		return balance1-balance2;
		
	}
};
//sorting ny accNum in desending

public static Comparator<Account> accNumCom=new Comparator<Account>() {
	public int compare (Account a1,Account a2)
	{
		String AccuNum1=a1.getAccNum();
		String AccuNum2=a2.getAccNum();
		return AccuNum2.compareTo(AccuNum1);
	}
};



}
