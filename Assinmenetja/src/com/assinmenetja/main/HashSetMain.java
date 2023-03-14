package com.assinmenetja.main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.assinmentja.entity.Mobile;

public class HashSetMain {

	public static void main(String[] args) {
		boolean found = false;
		Set<Mobile> slis=new HashSet<>();
		Mobile m=new Mobile(22000,"vivo");
		Mobile m1=new Mobile(25000,"nokia");
		Mobile m2=new Mobile(60000,"realme");
		Mobile m3=new Mobile(33000,"samsung");
		slis.add(m);
		slis.add(m1);
		slis.add(m2);
		slis.add(m3);
	   slis.forEach(System.out::println);
		Scanner sc=new Scanner(System.in);
		int amt;
		System.out.println("Enter the price ");
		amt=sc.nextInt();
		for(Mobile mo: slis)
		{
		if(mo.getPrice()==amt)
        {
   	      found = true; 
		  System.out.println(mo);
   	       break;
        }
		}
		if(found==false)
		{
			System.out.println("No such mobile found");
		}
		Mobile m4=new Mobile(22000,"vivo");

		slis.add(m4);
		System.out.println("not added");
		
		String val;
	found=false;
		System.out.println("Enter the maker you want to remove  ");
		val=sc.next();
		for(Mobile mo: slis)
		{
		if(mo.getMaker().equals(val))
        {
   	      found = true; 
   	      slis.remove(mo);
		  System.out.println("succesfully removed");
   	       break;
        }
		}
		if(found==false)
		{
			System.out.println("No such mobile found");
		}

		slis.forEach(System.out::println);
	}
}
	   	    
