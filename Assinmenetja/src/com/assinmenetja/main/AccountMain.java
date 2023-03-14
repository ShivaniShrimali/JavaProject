package com.assinmenetja.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.assinmentja.entity.Account;

public class AccountMain {

	public static void main(String[] args) {
	List<Account> lis=new ArrayList<>();
     Account a=new Account(1800,"1234");
     Account a1=new Account(1700,"1324");
     Account a2=new Account(1890,"1894");
     Account a3=new Account(1100,"1224");
     lis.add(a);
     lis.add(a1);
     lis.add(a2);
     lis.add(a3);
     lis.forEach(System.out::println);
//sorting by balance in aasending
     System.out.println("Soring on basis of balance in ascending order");
     Collections.sort(lis,Account.accbalCom);
     lis.forEach(System.out::println);
     
   //sorting by accNum in desending
     System.out.println("Soring on basis of AccountNum in desending order");
     Collections.sort(lis,Account.accNumCom);
     lis.forEach(System.out::println);
     System.out.println("The elemnt of aaray list");
     System.out.println("Balance and accountNum"+a);
     
	}

}
