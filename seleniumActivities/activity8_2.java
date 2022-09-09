package seleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity8_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tables");
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='sortableTable']/thead//th"));
		System.out.println("Size of row -"+ row.size());
		System.out.println("Size of col- "+col.size());
		
		System.out.println("List of Names before sorting");
		WebElement ele = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("Cell value at the second row and second column before sorting "+ele.getText());
		
		WebElement Name = driver.findElement(By.xpath("//table[@id='sortableTable']/thead//th[text()='Name']"));
		Name.click();
		WebElement ele2 = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("Cell value at the second row and second column after sorting "+ele2.getText());
		
		WebElement footerValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot//tr"));
		System.out.println("Footer Value "+footerValue.getText());
		
		driver.close();
		

	}

}
