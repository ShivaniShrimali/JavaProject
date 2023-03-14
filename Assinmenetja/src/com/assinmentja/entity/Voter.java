package com.assinmentja.entity;

public class Voter implements Comparable<Voter> {
private int age;
private String name;
public Voter(int age, String name) {
	
	this.age = age;
	this.name = name;
}
public Voter() {
	
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return age+" "+name;
	}
@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	 Voter e=(Voter) obj;
	 return this.name.equals(e.name);
}
@Override
	public int compareTo(Voter v) {
		// TODO Auto-generated method stub
		return this.age -v.getAge();
}
}

