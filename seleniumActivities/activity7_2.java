package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity7_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		
		String title = driver.getTitle();
		System.out.println("The title of the page is "+title);
		
		WebElement UN = driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
		WebElement PW = driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
		WebElement CPW = driver.findElement(By.xpath("//label[contains(text(),'Confirm Password')]/following::input[1]"));
		WebElement email = driver.findElement(By.xpath("//label[contains(text(),'Email')]/following::input[1]"));
		
		UN.sendKeys("username");
		PW.sendKeys("password");
		CPW.sendKeys("password");
		email.sendKeys("test@gmail.com");
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		String msg = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		System.out.println("The message is"+msg);
		
		driver.close();
		

	}

}
