package Appium_activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class activity1 {

	AndroidDriver<MobileElement> driver;
	 
    @BeforeClass
    public void setUp() throws MalformedURLException {
      
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 4 Emulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset", true);
 
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
    }
 
    @Test
    public void add() {
        driver.findElementById("digit_5").click();
        driver.findElementByAccessibilityId("multiply").click();
        driver.findElementByXPath("//android.widget.Button[@text='10']").click();
        driver.findElementById("eq").click();
        String result = driver.findElement(MobileBy.id("result")).getText();
        System.out.println(result);
        Assert.assertEquals(result, "50");
    }
 
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
