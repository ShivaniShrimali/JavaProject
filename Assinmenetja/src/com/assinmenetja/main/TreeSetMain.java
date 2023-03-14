package com.assinmenetja.main;

import java.util.Scanner;
import java.util.TreeSet;

import com.assinmentja.entity.Mobile;
import com.assinmentja.entity.Voter;

public class TreeSetMain {

	public static void main(String[] args) {
		TreeSet<Voter> tset=new TreeSet<>();
		Voter v1=new Voter(18,"himanshu");
		Voter v2=new Voter(21,"kaniya");
		Voter v3=new Voter(23,"rahul");
		Voter v4=new Voter(24,"rohan");
		Voter v5=new Voter(33,"dipesh");
		tset.add(v1);
		tset.add(v2);
		tset.add(v3);
		tset.add(v4);
		tset.add(v5);
		tset.forEach(System.out::println);
 Scanner sc=new Scanner(System.in);
 int val;
 boolean found = false;
 System.out.println("Enter the age");
 val=sc.nextInt();

		for(Voter v: tset)
		{
		if(v.getAge()==val)
        {
   	      found = true; 
		  System.out.println(v);
   	       break;
        }
		}
		if(found==false)
		{
			System.out.println("No such mobile found");
		}
	String valu;

	found=false;
	
		System.out.println("Enter the maker you want to remove  ");
		valu=sc.next();
		for(Voter v: tset)
		{
			if(v.getName().equals(valu))
	        {
	   	      found = true; 
	   	      tset.remove(v);
			  System.out.println("succesfully removed");
	   	       break;
	        }
			}
			if(found==false)
			{
				System.out.println("No such mobile found");
			}
			System.out.println("After deleting");
			tset.forEach(System.out::println);
}
}
