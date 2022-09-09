package Project_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class project_activity3 {
		WebDriver driver;
		
		@BeforeTest
		public void beforeTest()
		{
		 driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		}
		
		@Test
		public void Test()
		{
		WebElement copyright = driver.findElement(By.xpath("//a[@id='admin_options']"));
		String text = copyright.getText();
		System.out.println("Copyright text -"+text);
		String expText = "© Supercharged by SuiteCRM";
		Assert.assertEquals(text, expText);
		}
		
		@AfterTest
		public void afterTest()
		{
		driver.close();
		}

	

}
