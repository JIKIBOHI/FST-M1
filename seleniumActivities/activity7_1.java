package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity7_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		
		String title = driver.getTitle();
		System.out.println("The title of the page is "+title);
		WebElement UN = driver.findElement(By.xpath("//input[starts-with(@class,'username')]"));
		WebElement PW = driver.findElement(By.xpath("//input[starts-with(@class,'password')]"));
		
		UN.sendKeys("admin");
		PW.sendKeys("password");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		
//		WebElement message = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
//		wait.until(ExpectedConditions.visibilityOf(message));
		
		String loginMsg = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		System.out.println("The message is_"+loginMsg);
		
		driver.close();
	}

}
