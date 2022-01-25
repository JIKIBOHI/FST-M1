package Project_activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class project_activity8 {

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
	public void traversiongTables() throws InterruptedException
	{
	//WebDriverWait wait = new WebDriverWait(driver,10);
	WebElement ele = driver.findElement(By.xpath("//a[text()='Sales']"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).perform();
	WebElement accounts = driver.findElement(By.xpath("//a[text()='Sales']/parent::span//li/a[text()='Accounts']"));
	accounts.click();
	Thread.sleep(3000);
	
	//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[contains(text(),'Accounts')]"))));
	
	List<WebElement> name = driver.findElements(By.xpath("//tr[@class='oddListRowS1']//td[@field='name']//a"));
	int size= name.size();
	System.out.println(size);
	for(int i=0;i<size-5;i++)
	{
		System.out.println(name.get(i).getText());
	}
	}
	
	
	@AfterTest
	public void afterTest()
	{
		driver.close();
	}
}
