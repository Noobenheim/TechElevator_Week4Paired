package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NumbersToWords {
	public static String numbersToWords(int number) {
		String numWord = "";
		if( number < 20 ) {
			numWord = lessThanTwentyConvert(number);
		} else if ( number < 100 ) {
			numWord = tensPlaceConvert(number);
		} else if (number < 1000) {
			numWord = hundredsPlaceConvert(number);
		} else {
			numWord = higherPlaceConvert(number);
		}
		return numWord.trim();
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
	
	private static String tensPlaceConvert(int number) {
		Map<Integer,String> map = new HashMap<>();
		map.put(20, "twenty");
		map.put(30, "thirty");
		map.put(40, "forty");
		map.put(50, "fifty");
		map.put(60, "sixty");
		map.put(70, "seventy");
		map.put(80, "eighty");
		map.put(90, "ninety");
		
		for( Entry<Integer,String> entry : map.entrySet() ) {
			int difference = number - entry.getKey();
			if( difference >= 0 && difference <= 9 ) {
				String result = entry.getValue();
				if( difference > 0 ) {
					result += "-"+lessThanTwentyConvert(difference);
				}
				return result;
			}
		}
		
		return "";
	}
	
	private static String hundredsPlaceConvert(int number) {
		String result = "";
		int hundredsPlace = number / 100;
		int tensPlace = number % 100;
		if( hundredsPlace > 0 ) {
			result = lessThanTwentyConvert(hundredsPlace) + " hundred";
		}
		if( tensPlace > 0 ) {
			result += " and " + tensPlaceConvert(tensPlace);
		}
		return result;
	}
	
	private static String higherPlaceConvert(int number) {
		List<String> place = new ArrayList<>();
		place.add("thousand");
		place.add("million");
		place.add("billion");
		
		int index = -1;
		int tempNumber = number;
		while( tempNumber > 0 ) {
			tempNumber /= 1000;
			if( tempNumber > 0 ) {
				index++;
			}
		}
		
		String result = "";
		
		int thousandsPlace = number / 1000;
		int remainder = number % 1000;
		result = numbersToWords(thousandsPlace) + " " + place.get(index);
		if( remainder > 0 ) {
			if( remainder/100 == 0 ) {
				result += " and";
			}
			result += " "+numbersToWords(remainder);
		}
		
		return result;
	}
}
