package com.weboniselab.shubham.java.assignment2;

public class Bull extends Animal {
	private float height;
	private float weight;

	public Bull()   {
		super();
		height = 0.0f;
		weight = 0.0f;
	}

	public Bull(float weight, float height)  {
		super();
		this.height = height;
		this.weight = weight;
	}

	public Bull(String Name, String Category, int Age, float weight,
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
	public String getCategory() {
		return this.Category;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public void setName(String Name) {
		this.Name = Name;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void setCategory(String category) {
		this.Category = category;
	}
	public float getWeight () {
		return this.weight;
	}
	public float getHeight () {
		return this.height;
	}

}
