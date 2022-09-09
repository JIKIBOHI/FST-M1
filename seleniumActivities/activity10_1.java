package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class activity10_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		
		String title = driver.getTitle();
		System.out.println("The title of the page is -"+title);
		
		WebElement cube = driver.findElement(By.id("wrapD3Cube"));
		Actions act = new Actions(driver);
		act.click(cube).perform();//left click
		WebElement cubeValue = driver.findElement(By.className("active"));
        System.out.println("Value on left click --" + cubeValue.getText());
        
        act.doubleClick(cube).perform();//double click
        cubeValue = driver.findElement(By.className("active"));
        System.out.println("Value on Double Click -- " + cubeValue.getText());
        
        act.contextClick(cube).perform();
        cubeValue = driver.findElement(By.className("active"));
        System.out.println("Value on Right Click -- " + cubeValue.getText());
 
        driver.close();
	}

}
