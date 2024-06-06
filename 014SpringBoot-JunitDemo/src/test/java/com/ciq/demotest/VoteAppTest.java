package com.ciq.demotest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ciq.Demo.VoteApp;

public class VoteAppTest {

	@Test
	public void isCastVoteTest1() {
		assertTrue(VoteApp.isCastVote(19));
	}

	@Test(expected = IllegalArgumentException.class)
	public void isCastVoteTest2() {
		assertTrue(VoteApp.isCastVote(17));
	}
}