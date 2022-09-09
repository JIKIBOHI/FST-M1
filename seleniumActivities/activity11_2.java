package seleniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity11_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
 
        driver.findElement(By.xpath("//button[@id='simple']")).click();
        Alert confirmAlert = driver.switchTo().alert();
 
        String alertText = confirmAlert.getText();
        System.out.println("Alert text is: " + alertText);

        confirmAlert.accept();
        
        driver.findElement(By.xpath("//button[@id='simple']")).click();
        Alert confirmAlert1 = driver.switchTo().alert();
        confirmAlert.dismiss();
     
        driver.close();
	}

}
