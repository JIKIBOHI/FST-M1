package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity4_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		String title = driver.getTitle();
		System.out.println("The title of the page is"+title);
		
		String thridHeader = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
		System.out.println("The third header is"+thridHeader);
		
		String fifthHeader = driver.findElement(By.xpath("//h5")).getText();
		System.out.println("The fifth header is"+fifthHeader);
		
		String violetButton = driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class");
		System.out.println("Classes attribute of Violet button"+violetButton);
		
		String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
		System.out.println("Text of greyButton"+greyButton);
		
		driver.close();
		

	}

}
