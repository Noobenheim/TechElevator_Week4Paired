package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KataStringCalculator {
	public static int add(String numbers) {
		int result = 0;
		String numString = "";
		
		List<String> splitNumbersList = new ArrayList<>();
		
		String oneLine = numbers.replaceAll("\n", ",");
		
		if (oneLine.startsWith("//")) {
			char delimiter = oneLine.charAt(2);
			String noDelim = oneLine.substring(4).replace(delimiter, ',');
			numString += noDelim;
		} else {
			numString += oneLine;
		}
		 
		String[] commaSplits = numString.split(",");
		splitNumbersList.addAll(Arrays.asList(commaSplits));
		
		if (numbers.equals("")) {
			return result;
		} else if (splitNumbersList.size() > 0) {
			for (String num : splitNumbersList) {
				int strNumber = Integer.parseInt(num);
				result += strNumber;
			}
		}
		return result;
	}

}
