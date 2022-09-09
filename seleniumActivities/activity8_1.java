package seleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity8_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/tables");
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='ui celled striped table']//tbody//tr"));
		List<WebElement> col = driver.findElements(By.xpath("//table[@class='ui celled striped table']//tbody//tr[1]//td"));
		System.out.println("Size of row -"+row.size());
		System.out.println("Size of col -"+col.size());
		
		List<WebElement> cellValues = driver.findElements(By.xpath("//table[@class='ui celled striped table']//tbody//tr[1]//td"));
		for(WebElement cellValue : cellValues) {
            System.out.println("Cell Value of 3rd row of table " + cellValue.getText());
        }
		
		WebElement value2 = driver.findElement(By.xpath("//table[@class='ui celled striped table']//tbody//tr[2]//td[2]"));
	    System.out.println("Cell value of 2nd row and 2nd column "+value2.getText());
		
		driver.close();

	}

}
