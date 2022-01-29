package TestNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class activity3 {
	WebDriver driver;
	
	@BeforeClass
	  public void beforeMethod() {
		  driver = new FirefoxDriver();
		  driver.get("https://www.training-support.net/selenium/login-form"); 
	  }
	
	@Test
	public void test1()
	{
		WebElement UN = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement PW = driver.findElement(By.xpath("//input[@id='password']"));
		UN.sendKeys("admin");
		PW.sendKeys("password");
		WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
		login.click();
		String message = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		System.out.println("Welcome message-"+message);
		Assert.assertEquals("Welcome Back, admin",message);
	}

	  @AfterClass
	  public void afterMethod() {
		  driver.close();
	  }

}
