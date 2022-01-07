package com.te.spring;

public class Engine implements Garage {

	String name;
	String capacity;
	
	

	public void setName(String name) {
		this.name = name;
	}



	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}



	@Override
	public void start() {
		System.out.println(name + " Engine has Satrted and the capcity of the engine is =" + capacity);

	}

//	public Engine(String name, String capacity) {
//		super();
//		this.name = name;
//		this.capacity = capacity;
//	}

}
