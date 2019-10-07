package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KataStringCalculator {
	public static int add(String numbers) {
		int sum = 0;
		List<String> splitNumbersList = new ArrayList<>();
		
		if (numbers.startsWith("//") && numbers.length() > 5) {
			char delimiter = numbers.charAt(2);
			numbers.replace(delimiter, ',');
			numbers = numbers.substring(5);
		} 
		
		if (numbers.contains("\n")) {
			numbers.replaceAll("\n", ",");
		}
		 
		String[] commaSplits = numbers.split(",");
		splitNumbersList.addAll(Arrays.asList(commaSplits));
		
		if (numbers.trim().equals("")) {
			return 0;
		} else if (splitNumbersList.size() > 0) {
			int result = 0;
			for (String num : splitNumbersList) {
				int strNumber = Integer.parseInt(num.trim());
				result += strNumber;
			}
			return result;
		}

		return -1;
	}

}
