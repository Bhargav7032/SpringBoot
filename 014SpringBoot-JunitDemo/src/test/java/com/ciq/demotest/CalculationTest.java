package com.ciq.demotest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ciq.Demo.Calculation;

public class CalculationTest {

	@Test
	public void findmix() {
		assertEquals(12, Calculation.findmix(new int[] {2,3,12,4,5,6,7}));
	}
	
	@Test
	public void findmix1() {
		assertEquals(15, Calculation.findmix(new int[] {2,3,12,4,15,6,7}));
	}
	@Test
	public void findmix2() {
		assertEquals(17, Calculation.findmix(new int[] {2,3,12,4,5,6,17}));
	}
	@Test
	public void findmix3() {
		assertEquals(13, Calculation.findmix(new int[] {2,13,12,4,5,6,7}));
	}
}
