package TestNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class activity6 {
	WebDriver driver;
    WebDriverWait wait;
 
    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    
    @Test
    @Parameters({"username","password"})
    public void loginTestCase(String username, String password) {
        WebElement UN = driver.findElement(By.id("username"));
        WebElement PW = driver.findElement(By.id("password"));
        UN.sendKeys(username);
        PW.sendKeys(password);
        WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
		login.click();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(message, "Welcome Back, admin");
    }
 
    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
