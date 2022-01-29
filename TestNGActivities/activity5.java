package TestNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class activity5 {
	WebDriver driver;
	
	@BeforeTest(alwaysRun = true)
	  public void beforeMethod() {
		  driver = new FirefoxDriver();
		  driver.get("https://www.training-support.net/selenium/target-practice"); 
	  }
	
	@AfterTest(alwaysRun = true)
	  public void afterMethod() {
		  driver.close();
	  }
	
	@Test (groups = {"HeaderTests", "ButtonTests"})
	public void test()
	{
		String title = driver.getTitle();
		System.out.println("The title of the page"+title);
		Assert.assertEquals(title, "Target Practice");
	}
	
	@Test (dependsOnMethods = {"test"}, groups = {"HeaderTests"})
    public void HeaderTest1() {
        WebElement h3 = driver.findElement(By.xpath("//h3[@id='third-header']"));
        Assert.assertEquals(h3.getText(), "Third header");
    }
    
    @Test (dependsOnMethods = {"test"}, groups = {"HeaderTests"})
    public void HeaderTest2() {
        WebElement h5 = driver.findElement(By.xpath("//h5[@class='ui green header']"));
        Assert.assertEquals(h5.getCssValue("color"), "rgb(251, 189, 8)");
    }
    
    @Test (dependsOnMethods = {"test"}, groups = {"ButtonTests"})
    public void ButtonTest1() {
        WebElement oliveButton = driver.findElement(By.xpath("//button[@class='ui olive button']"));
        Assert.assertEquals(oliveButton.getText(), "Olive");
    }
    
    @Test (dependsOnMethods = {"test"}, groups = {"ButtonTests"})
    public void ButtonTest2() {
        WebElement button2 = driver.findElement(By.xpath("//button[@class='ui brown button']"));
        Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");
    }

}
