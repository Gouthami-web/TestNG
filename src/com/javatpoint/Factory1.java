package com.javatpoint;
import org.testng.annotations.Factory;
public class Factory1 {

	@Factory
	public Object[] getTestClasses()
	{
	Object tests[]=new Object[2];
	tests[0]=new Testcase1();
	tests[1]=new Testcase2();
	return tests;
	}
}
