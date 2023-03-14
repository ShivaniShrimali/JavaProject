package com.wrapperdemo.AppMain;


public class WrapperDemo {

	public static void main(String[] args) {
		int x=35;
		Integer y=new Integer(45);
	x=y;//autoboxing
	y=x;//auto unboxing
System.out.println(y);
}

}
