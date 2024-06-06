package com.ciq.demotest;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.ciq.Demo.Cal;

public class CalTest {

	private static Cal cal=null;
	
	@BeforeClass
	public static void beforeClass() {
		cal = new Cal();
	}
	
	@Test
	//@Ignore
	public void sumTest5() {
		int a = 20;
		int b = 30;
		int expResult = 50;
		int accResult = cal.sum(a, b);
		assertEquals(expResult, accResult);
	}
	
	@Test
	public void sumTest1() {
	Cal cal =new Cal();
	//cal.sum(90, 10);
	assertEquals(100, cal.sum(50, 50));
	}
	@Test
	public void sumTest2() {
	Cal cal =new Cal();
	cal.sum(9, 10);
	}
	@Test
	public void sumTest3() {
	Cal cal =new Cal();
	cal.sum(40, 10);
	}
	@Test
	public void sumTest4() {
	Cal cal =new Cal();
	cal.sum(9, 90);
	}
}
