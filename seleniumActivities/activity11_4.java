package seleniumActivities;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity11_4 {

	public static void main(String[] args) throws InterruptedException {
		 	WebDriver driver = new FirefoxDriver();
	        WebDriverWait wait = new WebDriverWait(driver, 20);
	
	        driver.get("https://www.training-support.net/selenium/tab-opener");
	        System.out.println("Page title is: " + driver.getTitle());
	 
	        String parentWindow = driver.getWindowHandle();
	        System.out.println("Parent Window: " + parentWindow);
	 
	        driver.findElement(By.linkText("Click Me!")).click();
	        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	 
	        Set<String> allWindow = driver.getWindowHandles();
	        System.out.println("All windows-- " +allWindow);
	 
	        for (String handle : driver.getWindowHandles()) {
	            driver.switchTo().window(handle);
	        }
	        System.out.println("Current window handle: " + driver.getWindowHandle());
	        wait.until(ExpectedConditions.titleIs("Newtab"));
	        System.out.println("New tab title-- " + driver.getTitle());

	        Thread.sleep(3000);
	        String newTabText = driver.findElement(By.xpath("//div[@class='content']")).getText();
	        System.out.println("New tab heading is-- " + newTabText);
	 
	        driver.findElement(By.linkText("Open Another One!")).click();
	        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
	 
	        allWindow = driver.getWindowHandles();
	        System.out.println("All window handles: " + allWindow);
	 
	        for (String handle : driver.getWindowHandles()) {
	            driver.switchTo().window(handle);
	        }
	 
	        System.out.println("New tab handle: " + driver.getWindowHandle());
	        wait.until(ExpectedConditions.titleIs("Newtab2"));
	
	        System.out.println("New Tab Title is--" + driver.getTitle());
	        newTabText = driver.findElement(By.xpath("//div[@class='content']")).getText();
	        System.out.println("New tab heading is-- " + newTabText);
	 
	        driver.quit();

	}

}
