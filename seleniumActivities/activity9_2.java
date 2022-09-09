package seleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class activity9_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/selects");
		
		WebElement choose = driver.findElement(By.id("multi-select"));
		
		Select multi = new Select(driver.findElement(By.id("multi-select")));
		if(multi.isMultiple())
		{
			multi.selectByVisibleText("Javascript");
			System.out.println("Seelct by visible text -"+choose.getText());
			
			multi.selectByValue("node");
			System.out.println("Select by value "+choose.getText());
			
			for(int i=4;i<=6;i++)
			{
				multi.selectByIndex(i);
			}
			System.out.println(choose.getText());
			
			multi.deselectByValue("node");
			System.out.println("Deselect By value -"+choose.getText());
			
			multi.deselectByIndex(7);
			System.out.println("Deselect By index -"+choose.getText());
			
            List<WebElement> selectedOptions = multi.getAllSelectedOptions();
            for(WebElement selectedOption : selectedOptions) {
                System.out.println("Selected option-" + selectedOption.getText());
            }
            
            multi.deselectAll();
            System.out.println(choose.getText());
        }        
        //Close browser
        driver.close();
			
		}


}
