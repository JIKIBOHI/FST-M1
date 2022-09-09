package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity5_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String title = driver.getTitle();
		System.out.println("The title of the page is"+title);
		
		 WebElement checkBox = driver.findElement(By.xpath("//input[@class='willDisappear']"));
		 System.out.println("The checkbox is selected or not before clicking "+checkBox.isSelected());
		 
		 checkBox.click();
		 System.out.println("The checkbox is selected or not after clicking"+checkBox.isSelected());
		 
		 driver.close();
		 
		 

	}

}
