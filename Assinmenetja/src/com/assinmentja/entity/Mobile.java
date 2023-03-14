package com.assinmentja.entity;

import java.util.Objects;

public class Mobile {
private int price;
private String maker;
public Mobile(int price, String maker) {
	
	this.price = price;
	this.maker = maker;
}
public Mobile() {
	
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getMaker() {
	return this.maker;
}
public void setMarker(String maker) {
	this.maker = maker;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return price+" "+maker;
	}
@Override
public int hashCode() {
	return Objects.hash(maker);
}


@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	  Mobile e=(Mobile) obj;
	  return this.maker.equals(e.maker);
	}

}
