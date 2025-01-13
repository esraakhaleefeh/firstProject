package myFirstProject;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MyTestCases {
	
	WebDriver driver = new ChromeDriver();
	Random ran = new Random();
	
	@BeforeTest()
	public void mySetUp() {
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
	
	}
	
	@Test()

	public void myFirstTest (){
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Copenhagen"+Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"kp-wp-tab-overview\"]/div[1]/div/div/div/div/div/div/div[1]/div/div/span/a/h3")).click();
		
	/*	String [] names = {"esraa", "yazan", "kaddy", "hana", "samar"};
		
		int length=names.length;
		
		
		for (int i=0; i< length; i++)
			
		{
			int randomIndex=ran.nextInt(length);
			System.out.println(names[randomIndex]);
		}*/
	}
		
	
	

	
	
	@AfterTest
	public void AfterTestIsDone() throws InterruptedException {
		
		Thread.sleep(5000);
		
		driver.quit();
	}
		}
