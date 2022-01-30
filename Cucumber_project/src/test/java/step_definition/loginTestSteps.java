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

public class loginTestSteps {
	WebDriver driver;
    WebDriverWait wait;
    
    @Given("^User is on the Login page$")
    public void UserloginsToPage() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    
    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_and(String username, String password) throws Throwable {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    
    @Then("^Read the title and confirmation message$")
    public void readTitleAndConfirm() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
        String title = driver.getTitle();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Page title is: " + title);
        System.out.println("Login message is: " + message);
        Assert.assertEquals(message, "Welcome Back, admin");
    }
   
    @And("^Close the opened browser$")
    public void closeTheBrowser() {
        driver.close();
    }
 

}
