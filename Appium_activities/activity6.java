package Appium_activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

public class activity6 {
	AndroidDriver<MobileElement> driver;
    WebDriverWait wait;
 
    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<Your device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);
 
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver, 5);
 
        // Navigate to the page
        driver.get("https://www.training-support.net/selenium/lazy-loading");
    }
    
    @Test
    public void imageScrollTest() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AndroidUIAutomator("text(\"Lazy Loading\"")));
				//(driver.findElementByXPath("//android.view.View/android.view.View[contains(@text,'Lazy')]")));
		MobileElement pageTitle = driver.findElementByXPath("//android.view.View/android.view.View[contains(@text,'Lazy')]");
		System.out.println("Page title is -->"+pageTitle.getText());
		wait.until(ExpectedConditions.textToBePresentInElement(pageTitle, "Lazy Loading"));
        List<MobileElement> numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
        System.out.println("Number of images now" + numberOfImages.size());
        Assert.assertEquals(numberOfImages.size(), 2);
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollTextIntoView(\"helen\")"));
        Thread.sleep(10000);
        numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
        System.out.println("Number of image shown currently: " + numberOfImages.size());
        Assert.assertEquals(numberOfImages.size(), 4);
    }
 
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
 

}
