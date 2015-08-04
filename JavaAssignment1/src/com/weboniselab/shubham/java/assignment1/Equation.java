package com.weboniselab.shubham.java.assignment1;

public class Equation extends Calculation{

	public Equation () {
		super();
		
	}
	public Equation (int variable1, int variable2) {
		super(variable1, variable2);
	}
	
	public static void main (String args[]) {
		
		Equation equation = new Equation(5,8);
		Calculation calculation = new Calculation(4,5);
		
		System.out.println("adding two values " + equation.sum());
		System.out.println("adding two values " + equation.sum(calculation));
		System.out.println("adding two values " + equation.sum(14, calculation));
	}
	
	
}
