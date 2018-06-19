package com.polymorphism;

public class Cat {
	
	private String name;
	
		
	public Cat() {
	}
	
	

	public Cat(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public void speak(){
		
		System.out.println("Meoww");
	}
	
	public void eat(){
		
		System.out.println("Cat eats fish");
	}
	
	public void run(){
		System.out.println("Shooooo");
	}



	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}

	
	
	

}
