package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title = driver.getTitle();
		System.out.println("The title of the page is"+title);
		
		//Using id()
		WebElement idlocator=driver.findElement(By.id("about-link"));
		System.out.println("Id locator for About US"+idlocator);
		
		//Using classname()
		WebElement className = driver.findElement(By.className("green"));
		System.out.println("Class name locator for About Us"+className);
		
		//Using linktext()
		WebElement link = driver.findElement(By.linkText("About Us"));
		System.out.println("linktext for About Us"+link);
		
		//Using cssSelector()
		WebElement css = driver.findElement(By.cssSelector(".green"));
		System.out.println("CSS selector for About Us"+css);
		
		driver.close();
	}

}
