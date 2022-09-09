package seleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class activity9_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/selects");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-select']"));
		
		Select drp = new Select(driver.findElement(By.id("single-select")));
		 
        drp.selectByVisibleText("Option 2");
        System.out.println(dropdown.getText());
 
        drp.selectByIndex(3);
        System.out.println(dropdown.getText());
 
        drp.selectByValue("4");
        System.out.println(dropdown.getText());

        List<WebElement> options = drp.getOptions();
        for(WebElement option : options) {
            System.out.println("Option:" + option.getText());
        }

        driver.close();

	}

}
