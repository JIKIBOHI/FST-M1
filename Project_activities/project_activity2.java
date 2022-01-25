package Project_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class project_activity2 {
      WebDriver driver;

	  @BeforeTest
	  public void beforeTest()
	  {
	    driver = new FirefoxDriver();
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("http://alchemy.hguy.co/crm");
	  }
	  @Test
	  public void test()
	  {
		driver.findElement(By.xpath("//a[text()='SuiteCRM']")).click();
		//wait.until(ExpectedConditions.)
		String currentURl=driver.getCurrentUrl();
		String expUrl="https://suitecrm.com/";
		System.out.println("Current Url is :"+currentURl);
		Assert.assertEquals(currentURl, expUrl);
	  }
	  @AfterTest
	  public void afterTest()
	  {
		driver.quit();
	  }
	

}
