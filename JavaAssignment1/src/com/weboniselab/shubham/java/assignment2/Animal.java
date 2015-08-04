package com.weboniselab.shubham.java.assignment2;

public class Animal {
	
	public String Name;
	public String Category;
	public int age;
	

//	default constructor
	public Animal()  {
		this.Name = "Noname";
		this.Category = "Nocategory";
		this.age=0;
	}
//	Parametrized  constructor
	public Animal (String Name, String Category, int Age) {
		this.Name = Name;
		this.Category = Category;
		this.age = Age;
	}
	
	public String getName(){
		return this.Name;
	}
	
	public String getCategory(){
		return this.Category;
	}
	public int getAge(){
		return this.age;
	}
	
	public void setName(String Name){
		this.Name = Name;
	}

	public void setAge(int age){
		this.age = age;
	}
	public void setCategory(String category){
		this.Category = category;
	}
	public String toSting() {
		return "name: "+this.Name+" Category: " +this.Category +" Age: " + this.age+" ";
	}
	public boolean isThisAAnimal() {
		if(this instanceof Animal) {
			return true;
		}
		else {
			return false;
		}
	}
}
