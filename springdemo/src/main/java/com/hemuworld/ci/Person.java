package com.hemuworld.ci;

public class Person {
	
	private int id;
	private String name;
	private Certi certi;

	public Person(int id, String name, Certi certi) {
		this.id = id;
		this.name=name;
		this.certi=certi;
	}

	@Override
	public String toString() {
		return this.id +" : "+ this.name +" : "+ this.certi.caertiName;
	}
	
}
