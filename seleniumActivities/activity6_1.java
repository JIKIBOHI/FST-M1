package seleniumActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity6_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String title = driver.getTitle();
		System.out.println("The title of the page is"+title);
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@class='willDisappear']"));
		WebElement checkBoxButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		checkBoxButton.click();
		
		wait.until(ExpectedConditions.invisibilityOf(checkBox));
		checkBoxButton.click();
		
		wait.until(ExpectedConditions.visibilityOf(checkBox));
		checkBox.click();
		driver.close();

	}

}
