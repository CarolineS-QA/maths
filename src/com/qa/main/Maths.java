package com.qa.main;

public class Maths {
	
	public int addThings(int num1, int num2) {
		return num1 + num2;
	}
	
	public int multiplyThings() {
	int numberOne = 2;
	int numberTwo = 3;
	return numberOne * numberTwo;
	}
	
	public int minusThings() {
	int numberOne = 2;
	int numberTwo = 3;
	return numberOne - numberTwo;
	}
	
	public String divideThings() {
	double numberOne = 2;
	double numberTwo = 4;
	if (numberOne < numberTwo) {
		return "" + numberOne / numberTwo;
	} else {
		return "The division can not be performed when the first number is bigger than the second.";
	}
	}
}
