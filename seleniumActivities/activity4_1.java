package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity4_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title = driver.getTitle();
		System.out.println("The title of the page is"+title);
		
		driver.findElement(By.xpath("//a[contains(text(), 'About Us')]")).click();
		String title2 = driver.getTitle();
		System.out.println("Title of the page is"+title2);
		driver.close();
	}

}
