package com.techelevator;

public class NumbersToWords {
	public static String numbersToWords(int number) {
		String numWord = "";
		if (number == 0) {
			numWord = "zero";
		} else if( number == 1 ) {
			numWord = "one";
		}
		return numWord;
	}
}
