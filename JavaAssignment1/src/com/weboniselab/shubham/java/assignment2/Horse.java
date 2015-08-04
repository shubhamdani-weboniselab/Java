package com.weboniselab.shubham.java.assignment2;


public class Horse extends Animal {

	private float height;
	private float weight;

	public Horse()    {
		super();
		height = 0.0f;
		weight = 0.0f;
	}

 
	public Horse(float weight, float height)   {
		super();
		this.height = height;
		this.weight = weight;
	}
 
	public Horse(String Name, String Category, int Age, float weight,
			float height) {
		super(Name, Category, Age);
		this.height = height;
		this.weight = weight;
	}
	@Override
	public String getName() {
		return this.Name;
	}
	@Override
	public String getCategory(){
		return this.Category;
	}
	@Override
	public int getAge(){
		return this.age;
	}
	@Override
	public void setName(String Name){
		this.Name = Name;
	}
	@Override
	public void setAge(int age){
		this.age = age;
	}
	@Override
	public void setCategory(String category){
		this.Category = category;
	}
	public float getWeight () {
		return this.weight;
	}
	public float getHeight () {
		return this.height;
	}
	public boolean isThisAHorse() {
		if(this instanceof Horse) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
