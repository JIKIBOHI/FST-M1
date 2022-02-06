package Appium_activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class uiScrollable {

	WebDriverWait wait;
    AndroidDriver<MobileElement> driver = null;
 
    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel4Emulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);
 
        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver, 10);
 
        // Open page
        driver.get("https://www.training-support.net/selenium");
    }
 
    @Test
    public void scrollIntoViewTest() {
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        // Wait for the page to load
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View")));
        // Scroll element into view and click it
		/*
		 * driver.findElement( MobileBy.AndroidUIAutomator(UiScrollable +
		 * ".scrollForward(7).scrollIntoView(text(\"Tab Opener\"))")) .click();
		 */
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
        driver.findElementByXPath("//android.view.View[contains(@text,'Tab Opener')]").click();

        // Wait for the page to load
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.view.View[@text='Click Me!']")));
        // Print page title
        String pageTitle = driver.findElementByXPath("//android.view.View[contains(@text, 'New Tab')]").getText();
        // Wait for the page to load
        //wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Click Me!")));
        // Print page title
        //String pageTitle = driver.findElementByXPath("//android.widget.TextView[contains(@text, 'New Tab')]").getText();
        System.out.println("Page title is: " + pageTitle);
        // Assertion
        Assert.assertEquals(pageTitle, "New Tab Opener");
}
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
   
}

	
