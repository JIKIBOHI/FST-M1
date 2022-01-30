package step_definition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver driver;
    WebDriverWait wait;
    
    @Given("^User on Login page$")
    public void loginPage() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://www.training-support.net/selenium/login-form");
    }
 
    @When("^User enters \"(.*)\" and \"(.*)\" in login page$")
    public void user_enters_UNandPW(String username, String password) throws Throwable {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    
    @Then("^Read the page title also the confirmation message$")
    public void readTitleAndComfirmationMessage() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
        String pageTitle = driver.getTitle();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Page title is: " + pageTitle);
        System.out.println("Login message is: " + message);
        
        if(message.contains("admin")) 
        {
            Assert.assertEquals(message, "Welcome Back, admin");
        } 
        else
        {
            Assert.assertEquals(message, "Invalid Credentials");
        }
    }
    
    @And("^Close Firefox Browser$")
    public void closeFirefoxBrowser() {
        driver.close();
    }

}
