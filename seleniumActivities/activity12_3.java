package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity12_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions act = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/popups");

        WebElement button = driver.findElement(By.xpath("//button[contains(@class, 'orange')]"));
        
        act.moveToElement(button).pause(5).build().perform();
        String tooltipText = button.getText();
        System.out.println("Tooltip text--" +tooltipText);
       
        button.click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
      
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
 
        String text = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Message after login "+text);

        driver.close();

	}

}
