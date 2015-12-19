package me.prince.junit.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import me.prince.junit.ObjParameterized;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FibonacciNumbersTests {

	@Parameterized.Parameters
	public static List data() {
		return Arrays.asList(new Object[][] { { 0, 0 }, { 1, 1 }, { 2, 1 },
				{ 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 } });
	}

	private int value;
	private int expected;

	public FibonacciNumbersTests(int input, int expected) {
		value = input;
		this.expected = expected;
	}

	@Test
	public void fibonacciNumberCalc() {
		assertEquals(expected, fib(value));
	}

	public static int fib(int n) {
		if (n < 2) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
}
