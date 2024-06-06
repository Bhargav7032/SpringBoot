package com.ciq.demotest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(value = {CalTest.class,CalculationTest.class,NumberTest.class,VoteAppTest.class})
public class AllTest {

}
