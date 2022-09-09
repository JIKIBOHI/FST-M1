package seleniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity11_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.training-support.net/selenium/javascript-alerts");
		 String title = driver.getTitle();
		 System.out.println("The title is "+title);
		 
		 driver.findElement(By.xpath("//button[@id='prompt']")).click();
		 
		 Alert promptAlert = driver.switchTo().alert();
	     String alertText = promptAlert.getText();
	     System.out.println("Alert text--" + alertText);
	 
	     promptAlert.sendKeys("Awesome!");
	     promptAlert.accept();
	 
	     driver.close();

	}

}
