package com.javatpoint;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Login {

	WebDriver driver;
	@Test
	 public void login()
	 {
		System.setProperty("webdriver.gecko.driver","C:\\JARFiles\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		System.out.println("Login page");
	 }
	 @Test(dependsOnMethods="login")
	 public void home()
	 {
		 System.out.println("Home page");
		 
	 }
}
