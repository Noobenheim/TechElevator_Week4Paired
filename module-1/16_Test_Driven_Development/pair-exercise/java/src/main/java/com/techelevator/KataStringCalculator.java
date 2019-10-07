package com.techelevator;

public class KataStringCalculator {
	
	public static int add(String numbers) {
		if( numbers.trim().equals("") ) {
			return 0;
		}
		else if(numbers.split(",").length == 1) {
			int result = Integer.parseInt(numbers);
			return result;
		} else if( numbers.split(",").length == 2 ) {
			String[] splitNumbers = numbers.split(",");
			
			String strNumber1 = splitNumbers[0].trim();
			String strNumber2 = splitNumbers[1].trim();
			
			int number1 = Integer.parseInt(strNumber1);
			int number2 = Integer.parseInt(strNumber2);
			
			return number1 + number2;
		}
		
		return -1;
	}

}
