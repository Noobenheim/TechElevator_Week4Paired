package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class NumbersToWordsTest {
	@Test
	public void method_returns_zero_for_0() {
		Assert.assertEquals("zero", NumbersToWords.numbersToWords(0));
	}
	@Test
	public void method_returns_one_for_1() {
		Assert.assertEquals("one", NumbersToWords.numbersToWords(1));
	}
	@Test
	public void method_returns_two_for_2() {
		Assert.assertEquals("two", NumbersToWords.numbersToWords(2));
	}
	@Test
	public void method_returns_thirty_nine_for_39() {
		Assert.assertEquals("thirty-nine", NumbersToWords.numbersToWords(39));
	}
}
