package com.weboniselab.shubham.java.assignment2;

public class DemoMainClass {

	public static void main(String args[])  {

		Animal animal1 = new Animal();
		Animal animal2 = new Animal("rio", "mammal", 20);
		Bull bull = new Bull();
		Bull redBull = new Bull("red", "mammal", 15, 150.4f, 6.4f);
		Horse horse = new Horse();
		Horse jonney = new Horse("jonney", "mammal", 21, 108.6f, 8.9f);
		Animal babyHorse = new Horse("babyHorse", "mammal", 5, 50.6f, 2.5f);
		
		
		System.out.print("NAME is : " + animal2.getName());
		System.out.print(" age is : " + animal2.getAge());
		System.out.print(" category is " + animal2.getCategory());
		System.out.println();

		System.out.print("NAME is : " + bull.getName());
		System.out.print(" age is : " + bull.getAge());
		System.out.print(" category is: " + bull.getCategory());
		System.out.print(" Height is: " + bull.getHeight());
		System.out.print(" weight is:  " + bull.getWeight());
		System.out.println();

		System.out.print("NAME is : " + jonney.getName());
		System.out.print(" age is : " + jonney.getAge());
		System.out.print(" category is: " + jonney.getCategory());
		System.out.print(" Height is: " + jonney.getHeight());
		System.out.println(" Weight is: " + jonney.getWeight());
		System.out.println("Is jonney a Horse: " + jonney.isThisAHorse());
		System.out.println("Is jonney a Animal: " + jonney.isThisAAnimal());		
		System.out.println();

		System.out.println("babyHorse age " + babyHorse.getAge());
		System.out.println("is babyHorse Animal : " + babyHorse.isThisAAnimal());

		try {
			// it can't be happend
			Horse babyAnimal = (Horse) new Animal("babyAnimalOfHorse",
					"mammal", 10);
		} catch (ClassCastException e) {
			System.out
					.println("cannot instantiate the subclass with superclass constructor");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
