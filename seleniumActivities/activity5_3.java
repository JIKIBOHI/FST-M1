package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity5_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String title = driver.getTitle();
		System.out.println("The title of the page is"+title);
		
		WebElement textField = driver.findElement(By.xpath("//input[@id='input-text']"));
		System.out.println("Verify if text field is enabled or not"+textField.isEnabled());
		
		WebElement button = driver.findElement(By.xpath("//button[@id='toggleInput']"));
		button.click();
		
		System.out.println("Verify if text field is enabled or not again"+textField.isEnabled());
		
		driver.close();
		
	}

}
