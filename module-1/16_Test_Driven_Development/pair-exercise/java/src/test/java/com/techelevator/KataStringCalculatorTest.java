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

}
