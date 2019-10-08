package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumbersToWords {
	public static String numbersToWords(int number) {
		String numWord = "";
		if( number < 20 ) {
			numWord = lessThanTwentyConvert(number);
		}
		return numWord;
	}
	
	private static String lessThanTwentyConvert(int number) {
		Map<Integer,String> map = new HashMap<>();
		map.put(0, "zero");
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		map.put(10, "ten");
		map.put(11, "eleven");
		map.put(12, "twelve");
		map.put(13, "thirteen");
		map.put(14, "fourteen");
		map.put(15, "fifteen");
		map.put(16, "sixteen");
		map.put(17, "seventeen");
		map.put(18, "eighteen");
		map.put(19, "ninteen");
		
		for( Entry<Integer, String> entry : map.entrySet() ) {
			if( entry.getKey() == number ) {
				return entry.getValue();
			}
		}
		
		return "";
	}
}
