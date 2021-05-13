package com.javatpoint;

import org.testng.annotations.Test;

public class Test_methods {
	
	//@Test(priority=2)
	@Test()
	public void test1()
	{
	System.out.println("Test1");
	}
	//@Test(priority=1)
	@Test()
	public void test2()
	{
	System.out.print("Test2");
	}

}
