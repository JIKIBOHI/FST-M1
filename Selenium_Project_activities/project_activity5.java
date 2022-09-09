package Project_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class project_activity5 {
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
		WebElement username = driver.findElement(By.xpath("//input[@id='user_name']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='username_password']"));
		
		username.sendKeys("admin");
		password.sendKeys("pa$$w0rd");
		WebElement login = driver.findElement(By.xpath("//input[@id='bigbutton']"));
		login.click();
		WebElement navigationMenu = driver.findElement(By.xpath("//div[@id='toolbar']"));
		String color = navigationMenu.getCssValue("color");
		String backgrounColor = navigationMenu.getCssValue("background-color");
		System.out.println("Color of the navigation menu -"+color);
		System.out.println("Background color of the menu -"+backgrounColor);
		}
		
		@AfterTest
		public void afterTest()
		{
		driver.close();
		}


}

