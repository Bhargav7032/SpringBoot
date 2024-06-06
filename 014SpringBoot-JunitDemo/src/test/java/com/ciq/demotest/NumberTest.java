package com.ciq.demotest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ciq.Demo.NumberUtils;

public class NumberTest {

	@Test
	public void isnumber() {
		assertEquals(true,NumberUtils.iseven(10));
	}
	
	@Test
	public void isnumber1() {
		assertEquals(true,NumberUtils.iseven(30));
	}
	@Test
	public void isnumber2() {
		assertEquals(true,NumberUtils.iseven(200));
	}
}
