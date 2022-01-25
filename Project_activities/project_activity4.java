package Project_activities;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class project_activity4 {
		WebDriver driver;
		
		@BeforeTest
		public void beforeTest()
		{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		}
		
		@Test
		public void test()
		{
		WebElement username = driver.findElement(By.xpath("//input[@id='user_name']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='username_password']"));
		
		username.sendKeys("admin");
		password.sendKeys("pa$$w0rd");
		WebElement login = driver.findElement(By.xpath("//input[@id='bigbutton']"));
		login.click();
		String homepgUrl = "https://alchemy.hguy.co/crm/index.php?module=Home&action=index";
		String actHomePgUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actHomePgUrl,homepgUrl);
		}
		
		@AfterTest
		public void afterTest()
		{
		driver.close();
		}

	

}
