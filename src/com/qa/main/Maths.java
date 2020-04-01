package com.qa.main;

public class Maths {

	public int addThings(int num1, int num2) {
		return num1 + num2;
	}

	public int multiplyThings(int numberOne, int numberTwo) {
		return numberOne * numberTwo;
	}

	public int minusThings(int numberOne, int numberTwo) {
		return numberOne - numberTwo;
	}

	public String divideThings() {
		try {
			// to throw the nullpointer:
			// uncomment the line below and replace one of the variables to help
			// double help = (Double) null;
			double numberOne = 9.0;
			double numberTwo = 3.0;

			if (numberOne < numberTwo) {
				return "" + numberOne / numberTwo;
			} else {
				throw new BigBoiFirstException();
			}
		} catch (ArithmeticException ae) {
			return "Did you try dividing by zero? Bad human! You know not what you mess with.";
		} catch (NullPointerException npe) {
			return "You're trying to maths with nothing. Good luck with that.";
		} catch (BigBoiFirstException bbfe) {
			return "The division can not be performed when the first number is bigger than the second. \nWhy? \nBecause my code says so.";
		} catch (Exception e) {
			return "Dear lord something had gone terrbily wrong, even I could not forsee this.";
		}
	}
}
