package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity6_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://training-support.net/selenium/ajax");
		String title = driver.getTitle();
		System.out.println("The tile of the page is"+title);
		
		driver.findElement(By.xpath("//button[contains(text(),'Change Content')]")).click();
		
		WebElement hello = driver.findElement(By.xpath("//h1"));
		wait.until(ExpectedConditions.visibilityOf(hello));
		
		 String ajaxText = driver.findElement(By.id("ajax-content")).getText();
	     System.out.println(ajaxText);
	     
	     wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
	        
	     String lateText = driver.findElement(By.id("ajax-content")).getText();
	     System.out.println(lateText);
	     driver.close();
	}

}
