package Project_activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class project_activity1 {
	WebDriver driver;

	  @BeforeMethod
	  public void beforeMethod()
	  {
	    driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
	  }
	  
	  @Test
	  public void test()
	  {
		String title = driver.getTitle();
		String expTitle = "SuiteCRM";
		System.out.println(title);
		Assert.assertEquals(title, expTitle);
	  }
		@AfterMethod
		public void afterMethod()
		{
			driver.close();
		}
		

}
