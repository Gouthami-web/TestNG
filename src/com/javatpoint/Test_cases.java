package com.javatpoint;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.javatpoint.Listener.class)
public class Test_cases {
	@Test(groups="test")
	 public void testcase1()
	 {
		 System.out.println("testcase1");
	 }
	 @Test(groups="test")
	 public void testcase2()
	 {
		 System.out.println("testcase2");
	 }
	 @Test(dependsOnGroups="test")
	 public void testcase3()
	 {
		 System.out.println("testcase3");
	 }
	
		
	  @Test
	  public void test_to_success()
	  {
	 	 Assert.assertTrue(true);
	  }
	//  @Test
	  public void test_to_fail()
	  {
	 	 Assert.assertTrue(false);
	  }

	  
	 }


