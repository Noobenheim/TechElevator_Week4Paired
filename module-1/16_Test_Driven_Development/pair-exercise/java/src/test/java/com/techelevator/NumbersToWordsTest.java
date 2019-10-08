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
	@Test
	public void method_returns_fifty_for_50() {
		Assert.assertEquals("fifty", NumbersToWords.numbersToWords(50));
	}
	@Test
	public void method_returns_three_hundred_forty_eight_for_348() {
		Assert.assertEquals("three hundred and forty-eight", NumbersToWords.numbersToWords(348));
	}
	
	@Test
	public void method_returns_nine_thousand_three_hundred_forty_seven_for_9347() {
		Assert.assertEquals("nine thousand three hundred and forty-seven", NumbersToWords.numbersToWords(9347));
	}
	@Test
	public void method_returns_four_hundred_and_ninety_one_thousand_three_hundred_forty_seven_for_491347() {
		Assert.assertEquals("four hundred and ninety-one thousand three hundred and forty-seven", NumbersToWords.numbersToWords(491347));
	}
	@Test
	public void method_returns_thirty_one_thousand_for_31000() {
		Assert.assertEquals("thirty-one thousand", NumbersToWords.numbersToWords(31000));
	}
	
}
