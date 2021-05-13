package com.javatpoint;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
public class Cowin {

	WebDriver driver;
	@BeforeTest
	public void launchCowin(){
		System.setProperty("webdriver.gecko.driver", "C:\\JARFiles\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.cowin.gov.in/home");
		
	}
	@Test
	public void signIn() throws InterruptedException{
		driver.findElement(By.xpath("//div[@class='status-switch']")).click();
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c64-1']")));
		driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c64-1']")).click();
		driver.findElement(By.xpath("//span[@class='mat-option-text'][contains(text(),'Karnataka')]")).click();
		driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c64-3']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'BBMP')]")).click();
		driver.findElement(By.xpath("//button[@class='pin-search-btn district-search']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Age 18+')]")).click();
		//driver.findElement(By.xpath("//label[contains(text(),'Age 45+')]")).click();
		ArrayList<WebElement> al=new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='vaccine-box vaccine-box1 vaccine-padding']")));
		int booked=0;
		int na=0;
		int count_book=0;
		int count_Na=0;
		int count_avai=0;
		int avai=0;
		System.out.println("al.size()===="+al.size());
		for(int i=0;i<al.size();i++)
		{
					
			if(al.get(i).getText().contains("Booked"))
			{
				count_book=booked+1;
				booked++;
				
			}else
			if(al.get(i).getText().contains("NA")){
				count_Na=na+1;
				na++;
			} else
				{
				count_avai=avai+1;
				avai++;
			}
			
		}
		System.out.println("count of booked items Age 18+==="+count_book);
		System.out.println("count_Na Age 18+===="+count_Na);
		System.out.println("count_avai Age 18+====="+count_avai);
	}
}
