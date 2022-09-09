package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity4_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String title = driver.getTitle();
		System.out.println("The title of the page is"+title);
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Jiki");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Bohidar");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jiki.bohidar@ibm.com");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("899999999");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}

}
