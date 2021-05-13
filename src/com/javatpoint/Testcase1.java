package com.javatpoint;
import org.testng.annotations.*;
public class Testcase1 {
	@Test
	public void test1()
	{
	System.out.println("test annotation testcase 1");
	}
	
	@BeforeTest
	public void test2(){
		System.out.println("before test mthd annotation testcase 2");
	}
	
	@AfterTest
	public void test3(){
		System.out.println("After test mthd annotation testcase 3");
	}
	
	@AfterSuite
	public void test4(){
		System.out.println("after suite");
	}
	
	@BeforeSuite
	public void test5(){
		System.out.println("before suite");
		}
	@BeforeClass
	public void test6()
	{
		System.out.println("before class===");
	}
	
	@AfterClass
	public void test7(){
		System.out.println("after class===");
	}
	
}
