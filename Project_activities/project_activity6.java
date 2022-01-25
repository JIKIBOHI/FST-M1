package Project_activities;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class project_activity6 {
     WebDriver driver ;
     
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
		
		List<WebElement> menu = driver.findElements(By.xpath("//div[@id='toolbar']//li//span/a"));
		Iterator<WebElement> itr = menu.iterator();
		while(itr.hasNext()) {
		    String list = itr.next().getText();
			if(list.equals("ACTIVITIES"))
			{
				System.out.println("Yes Activities exist in the list");
			}
		   
		}
     }
     
     @AfterTest
     public void afterTest()
     {
		driver.close();
     }
	

}
