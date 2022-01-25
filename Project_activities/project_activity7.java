package Project_activities;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class project_activity7 {
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
		public void operationOnMenu() throws InterruptedException
		{
		//WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement ele = driver.findElement(By.xpath("//a[text()='Sales']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		WebElement leads = driver.findElement(By.xpath("//a[text()='Sales']/parent::span//li/a[text()='Leads']"));
		leads.click();
		Thread.sleep(3000);
		WebElement info = driver.findElement(By.xpath("(//span[@class='suitepicon suitepicon-action-info'])[2]/.."));
		info.click();
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='open ui-dialog-content ui-widget-content']"))));
		WebElement phn = driver.findElement(By.xpath("//div[@class='open ui-dialog-content ui-widget-content']//span[@class='phone']"));
		String phoneNum = phn.getText();
		System.out.println("The phone num is"+phoneNum);
		Assert.assertEquals(phoneNum, "9999999999");
		}
		
		@AfterTest
		public void afterTest()
		{
			driver.close();
		}

}
