package com.techelevator;

public class KataStringCalculator {

	public static int add(String numbers) {
		if (numbers.trim().equals("")) {
			return 0;
		} else if (numbers.split(",").length == 1) {
			int result = Integer.parseInt(numbers);
			return result;
		} else if (numbers.split(",").length > 1) {
			String[] splitNumbers = numbers.split(",");
			int result = 0;
			for (String num : splitNumbers) {
				int strNumber = Integer.parseInt(num.trim());
				result += strNumber;
			}
			return result;
		}

		return -1;
	}

}
