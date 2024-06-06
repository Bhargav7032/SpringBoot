package com.ciq.demotest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class DemoTest {
	
	@BeforeClass
	public  static void BeforeClass() {
		System.out.println("BeforeClass");
		System.out.println("Bhargav..!");
		System.out.println("...........");

	}
	@Test
	public void test2() {
		System.out.println("Bhagyam..!");
	}
	@AfterClass
	public  static void AfterClass() {
		System.out.println("...........");
		System.out.println("AfterClass");
		System.out.println("BhagyaRaju..!");

	}
	@Test
	public void test4() {
		System.out.println("Bhagya..!");
	}
	@Test
	public void test5() {
		System.out.println("Bhagi..!");
	}
}
