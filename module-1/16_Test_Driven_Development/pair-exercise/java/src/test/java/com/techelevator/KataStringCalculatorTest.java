package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataStringCalculatorTest {
	
	@Test
	public void calculator_returns_0_if_string_is_empty() {
		String inputString = "";
		int expectedReturn = 0;
		Assert.assertEquals(expectedReturn, KataStringCalculator.add(inputString));
	}

	@Test
	public void calculator_returns_1_when_passed_a_1() {
		String inputString = "1";
		int expectedReturn = 1;
		Assert.assertEquals(expectedReturn, KataStringCalculator.add(inputString));
	}

	@Test
	public void calculator_returns_sum_of_two_numbers_in_string() {
		String inputString = "2, 3";
		int expectedReturn = 5;
		Assert.assertEquals(expectedReturn, KataStringCalculator.add(inputString));
	}
	
	@Test
	public void calculator_returns_sum_of_three_numbers_in_string() {
		String inputString = "5, 7, 12";
		int expectedReturn = 24;
		Assert.assertEquals(expectedReturn, KataStringCalculator.add(inputString));
	}
	
	@Test
	public void calculator_works_when_numbers_are_split_by_newLine_and_commas() {
		String inputString = "5\n7,12";
		int expectedReturn = 24;
		Assert.assertEquals(expectedReturn, KataStringCalculator.add(inputString));
	}
	
	@Test
	public void calculator_works_when_numbers_are_split_by_custom_delimiter() {
		String inputString = "//;\\n1;2";
		int expectedReturn = 3;
		Assert.assertEquals(expectedReturn, KataStringCalculator.add(inputString));
	}
}
