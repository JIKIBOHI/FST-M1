package Appium_Project;

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
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class activity2 {
	WebDriverWait wait;
	AndroidDriver<MobileElement> driver;
	
	public static String testedApp="GoogleKeep";
	@BeforeClass
	public void setUp() throws MalformedURLException
	{
		 DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "Pixel 4 Emulator");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("automationName", "UiAutomator2");
	        caps.setCapability("appPackage", "com.google.android.keep");
	        caps.setCapability("appActivity", ".activities.BrowseActivity");
	        
	        // Instantiate Appium Driver
	        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        wait = new WebDriverWait(driver, 10);
	}
	
	
	  @Test
	  public void createNotes() {
		  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.google.android.keep:id/og_apd_internal_image_view")));
		  (new TouchAction(driver)).tap(PointOption.point(899, 1964)).perform();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.google.android.keep:id/editable_title")));
		  driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("Title");
		  driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("Description");
		  driver.findElementByAccessibilityId("Open navigation drawer").click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='Title From Appium']")));
		  Assert.assertTrue(driver.findElementByXPath("//android.widget.TextView[@text='Title From Appium']").isDisplayed());	  
	  }
	  
	  @AfterClass
	  public void close()
	  {
		  driver.quit();
	  }

}
