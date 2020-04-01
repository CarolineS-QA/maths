package com.qa.main;

public class Main {

	public static void main(String[] args) {
		Maths maths = new Maths();
//		System.out.println(maths.addThings(2, 3));
//		System.out.println(maths.multiplyThings(2, 3));
//		System.out.println(maths.minusThings(2, 3));

		// Exceptions focusing on the division method.
		// Division method is designed to only work if the first number is smaller than
		// the second.
		System.out.println(maths.divideThings());
	}

}
