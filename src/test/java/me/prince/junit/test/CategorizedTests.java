package me.prince.junit.test;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * @author yhjhoo
 * @since 1.0 date : 19 Dec, 2015
 *
 */

public class CategorizedTests {
	@Test
	@Category(SlowTests.class)
	public void thisTestRunsSlowly() {
		System.out.println("Slow test running");
	}

	@Test
	public void thisTestRunsFast() {
		System.out.println("Fast test running");
	}
}
