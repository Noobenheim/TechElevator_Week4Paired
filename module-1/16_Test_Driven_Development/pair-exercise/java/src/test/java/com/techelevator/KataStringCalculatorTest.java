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
}
