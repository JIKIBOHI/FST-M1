package TestNGActivities;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class activity1 {
	WebDriver driver;
  @Test
  public void f() {
	  String title = driver.getTitle();
	  System.out.println("The title of the page is "+title);
	  Assert.assertEquals("Training Support", title);
	  driver.findElement(By.xpath("//a[contains(text(), 'About Us')]")).click();
	  String title2 = driver.getTitle();
	  System.out.println("New title "+title2);
	  Assert.assertEquals("About Training Support", title2);
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
