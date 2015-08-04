package com.weboniselab.shubham.java.assignment1;

public class Calculation {

	int variable1;
	int variable2;
	
	
	//constructor overloading
	public Calculation (int variable1, int variable2) {
		this.variable1 = variable1;
		this.variable2 = variable2;
	}
	public Calculation () {
		this.variable1 =0;
		this.variable2 =0;
	}
	
	//method overloading 
	
	public int sum () {
		return this.variable1+this.variable2;
	}
	public int sum (Calculation calculation) {
		int result=0;
		result = calculation.variable1 + calculation.variable2;
		return result;
	}
	
	public int sum (int varable1, int variable2) {
		return varable1+variable2;
	}
	
	public int sum(int varable1 , Calculation calculation) {
		int result;
		result = varable1 + calculation.variable1 + calculation.variable2;
		return result;
	}
	public float divide (Calculation calculation) {
		float result=0.0f;
		result = calculation.variable1 / calculation.variable2;
		return result;
	}
	public int divide(int varable1, int variable2) {
		return varable1 / variable2;
	}
	
}
