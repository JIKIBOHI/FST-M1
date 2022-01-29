package TestNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class activity7 {

	WebDriver driver;
    WebDriverWait wait;
 
    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    
    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] { { "admin", "password" }};
    }
    
    @Test (dataProvider = "Authentication")
    public void loginTestCase(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
		login.click();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(message, "Welcome Back, admin");
    }
 
    @AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }
}
