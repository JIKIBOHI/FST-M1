package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		String title = driver.getTitle();
		System.out.println("The title of the page is"+title);
		
		driver.findElement(By.id("firstName")).sendKeys("Jiki");
		//Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Bohidar");
		//Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("1994jiki.bohidar@gmail.com");
		//Thread.sleep(2000);
		driver.findElement(By.id("number")).sendKeys("9999999999");
		//Thread.sleep(2000);
		driver.findElement(By.className("ui")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
