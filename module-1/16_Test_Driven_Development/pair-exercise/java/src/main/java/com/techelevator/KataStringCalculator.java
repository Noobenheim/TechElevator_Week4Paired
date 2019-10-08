package com.techelevator;

public class KataStringCalculator {
	public static int add(String numbers) {
		int result = 0; // the result to return
		
		String delimReg = "[\n"; // begin delimiter regular expression
		
		if( numbers.startsWith("//") ) {
			delimReg += numbers.charAt(2); // add custom delimiter to end
			numbers = numbers.substring(3); // substring to remove the // and custom delimiter
		}
		
		delimReg += "]"; // end delimiter 
		
		numbers = numbers.replaceAll(delimReg, ","); // replace \n and possibly custom delimiter with a comma
		
		String[] splitNumbers = numbers.split(","); // split by , into array
		
		for( String num : splitNumbers ) { // cycle through array
			num = num.trim(); // trim the string to make sure no spaces
			if( !num.equals("") ) { // make sure the string isn't empty
				result += Integer.parseInt(num); // add the num to result
			}
		}
		
		return result; // return result
	}

}
