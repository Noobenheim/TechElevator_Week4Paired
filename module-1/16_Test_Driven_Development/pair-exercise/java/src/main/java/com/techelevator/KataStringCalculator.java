package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KataStringCalculator {
	public static int add(String numbers) {
		int sum = 0;
		
		List<String> splitNumbersList = new ArrayList<>();
		// split by comma first
		String[] commaSplits = numbers.split(",");
		// now go through split array to split by newline
		for( String commaSplit : commaSplits ) {
			String[] newlineSplits = commaSplit.split("\n");
			// add to arraylist
			splitNumbersList.addAll(Arrays.asList(newlineSplits));
		}
		
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
