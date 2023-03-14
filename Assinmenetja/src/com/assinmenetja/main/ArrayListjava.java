package com.assinmenetja.main;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListjava{
	

	public static void main(String[] args) {
		
	

	List<Integer> lis=new ArrayList<>();

		lis.add(10);
		lis.add(20);
		lis.add(23);
		lis.add(26);
		lis.add(24);
		lis.add(28);
		for(Integer e: lis)
			{
				System.out.println(e);
			}
		System.out.println("print values through iteator method ");
		lis.add(40);
		 Iterator<Integer> it=lis.iterator();
		   while(it.hasNext())
		   {
			   System.out.println(it.next());
		   }
		//user input check  
		   Scanner sc=new Scanner(System.in);
        int inde;
        System.out.println("enter the index value");
        inde=sc.nextInt();
        
       
        if(inde>=lis.size())
        {
        	System.out.println("Enter the value you want to add in list");
            int val;
            val=sc.nextInt();

       	  lis.add(val)	;
       	 lis.forEach(System.out::println); 
        }	
        else
        {
        	System.out.println("no new element is added");
        }
        
        int ind;
        System.out.println("Enter the index value you want to retrive");
        ind=sc.nextInt();
        if(ind<=lis.size())
        {
        	System.out.println("the elemet at index"+ind+"is"+lis.get(ind));
        }
        else
        {
        	System.out.println("Invalid position");
        }
       
       int index;
       
       System.out.println("Enter the index whose value you want to delet");
       index=sc.nextInt();
       if(index<=lis.size())
       {
    	   System.out.println("the element at position"+index+ " is deleted");
    	   lis.remove(index);
    	   lis.forEach(System.out::println); 
       }
       else
       {
    	   System.out.println("Invalid position");
       }
       int indx1,val1;
       System.out.println("Enter the index value to replace the value");
       indx1=sc.nextInt();
      
       try
       {
       	if(indx1<=lis.size())
       	{
       		 System.out.println("Enter the valiue you want to replace ");
       	        val1=sc.nextInt();
       		lis.set(indx1, val1);
       		lis.forEach(System.out::println); 
       	}
       	else
       	{
       		System.out.println("position is invalid");
       	}
       }
       catch(Exception e)
       {
       	
       }
       //delet element
       int value;
       System.out.println("Enter the element you want to delet");
       value=sc.nextInt();
       if(lis.contains(value))
       {
    	   lis.remove(Integer.valueOf(value));
    	   lis.forEach(System.out::println); 
       }
       else
       {
    	   System.out.println("Invalid postion");
       }
       
     Object[] arr=lis.toArray();
     System.out.println("All elemt from aaray");
     for(Object obj :arr)
     {
    	 System.out.println(obj);
     }
	}

}


