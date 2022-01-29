package TestNGActivities;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class activity2 {
		WebDriver driver;
		
		@Test
		public void test()
		{
			String title = driver.getTitle();
			System.out.println("The title of the page is"+title);
			Assert.assertEquals(title, "Target Practice");
		}
		
		@Test
		public void test2()
		{
			WebElement blackButton = driver.findElement(By.xpath("//button[contains(@class,'black')]"));
			Assert.assertTrue(blackButton.isDisplayed());
			Assert.assertEquals(blackButton.getText(), "black");
		}
		
		@Test(enabled=false)
		public void test3()
		{
			System.out.println("This will not get executed");
		}
		
		 @Test
		    public void testCase4()
		 	{
		        throw new SkipException("Skipping test case");      
		    }
		
		@BeforeMethod
		  public void beforeMethod() {
			  driver = new FirefoxDriver();
			  driver.get("https://www.training-support.net/selenium/target-practice");
			  
		  }

		  @AfterMethod
		  public void afterMethod() {
			  driver.close();
		  }

}
