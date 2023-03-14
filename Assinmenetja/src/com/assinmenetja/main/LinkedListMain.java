package com.assinmenetja.main;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 LinkedList<Integer> lis=new LinkedList<>();
 //Add by ques fun
 System.out.println("Adding element by Que");
 lis.add(34);
 lis.add(36);
 lis.add(46);
 lis.add(89);
 lis.add(54);
 System.out.println("all element by adding que");
 lis.forEach(System.out::println);
 System.out.println("Adding elemnt by deques");
 lis.addFirst(55);
 lis.addLast(12);
 System.out.println("Adding element by adding deque");
 lis.forEach(System.out::println);
 System.out.println("Element of the linkled list in reverse order");
 Collections.reverse(lis);
 lis.forEach(System.out::println);
 System.out.println("Index of first occrance"+lis.indexOf(lis.peekFirst()));
 System.out.println("Index of last occrance"+lis.indexOf(lis.peekLast()));
 lis.forEach(System.out::println);
 lis.removeAll(lis);
 System.out.println("list removed");
	}

}
