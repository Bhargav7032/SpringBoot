package com.ciq.Demo;

public class VoteApp {
	
	public static boolean isCastVote(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("Age less then 18 years");
		}
		return true;
	}
}