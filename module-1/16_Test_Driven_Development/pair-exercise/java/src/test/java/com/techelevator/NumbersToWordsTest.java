package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class NumbersToWordsTest {
	@Test
	public void method_returns_zero_for_0() {
		Assert.assertEquals("zero", NumbersToWords.numbersToWords(0));
	}
}
