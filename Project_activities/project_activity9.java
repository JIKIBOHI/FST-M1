package Project_activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class project_activity9 {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
	driver = new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/crm/");
	}
	
	@Test(priority=0)
	public void login()
	{
	WebElement username = driver.findElement(By.xpath("//input[@id='user_name']"));
	WebElement password = driver.findElement(By.xpath("//input[@id='username_password']"));
	
	username.sendKeys("admin");
	password.sendKeys("pa$$w0rd");
	WebElement login = driver.findElement(By.xpath("//input[@id='bigbutton']"));
	login.click();
	}
	
	@Test(priority=1)
	public void traversingTables2() throws InterruptedException
	{
		WebElement ele = driver.findElement(By.xpath("//a[text()='Sales']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		WebElement leads = driver.findElement(By.xpath("//a[text()='Sales']/parent::span//li/a[text()='Leads']"));
		leads.click();
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//tbody//td//b//a"));
		int s= list.size();
		System.out.println("S"+s);
		System.out.println("Name List:");
		for(int i=0;i<=10;i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		List<WebElement> list2 = driver.findElements(By.xpath("//tbody//td[@field='assigned_user_name']//a"));
		int s2 = list2.size();
		System.out.println("S2"+s2);
		System.out.println("User List:");
		for(int i=0;i<=10;i++)
		{
			System.out.println(list2.get(i).getText());
		}
	}

	@AfterTest
	public void afterTest()
	{
		driver.close();
	}
}
