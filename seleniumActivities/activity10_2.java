package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class activity10_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
        WebElement pressedKey = driver.findElement(By.id("keyPressed"));
        
        Actions actions = new Actions(driver);
        actions.sendKeys("J").build().perform();
        String pressedKeyText = pressedKey.getText();
        System.out.println("Pressed key of first name " + pressedKeyText);
        
        actions.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        pressedKeyText = pressedKey.getText();
        System.out.println("Pressed key text is -- " + pressedKeyText);
 
        driver.close();
	}

}
