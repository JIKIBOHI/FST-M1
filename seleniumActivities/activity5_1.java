package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity5_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String title = driver.getTitle();
		System.out.println("The title of the page is"+title);
		
		 WebElement checkBox = driver.findElement(By.xpath("//input[@class='willDisappear']"));
		 System.out.println("The Checkbox is displayed or not "+checkBox.isDisplayed());
		 
		 driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
		 System.out.println("The Checkbox is displayed or not after removing "+checkBox.isDisplayed());
		 
		 driver.close();

	}

}
