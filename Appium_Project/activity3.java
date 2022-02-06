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

public class activity3 {
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
	  public void addNoteWithReminder() throws InterruptedException {
		  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.google.android.keep:id/og_apd_internal_image_view")));
		  (new TouchAction(driver)).tap(PointOption.point(899, 1964)).perform();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.google.android.keep:id/editable_title")));
		  driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("Reminder Title");
		  driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("Reminder Description");
		  driver.findElementByAccessibilityId("Reminder").click();
		  Thread.sleep(7000);
		  (new TouchAction(driver)).tap(PointOption.point(437, 1274)).perform();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Open navigation drawer")));
		  driver.findElementByAccessibilityId("Open navigation drawer").click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='Reminder Title']")));
		  driver.findElementByXPath("//androidx.cardview.widget.CardView[contains(@content-desc,'Reminder Title')] //android.widget.TextView[@resource-id='com.google.android.keep:id/reminder_chip_text']").click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.google.android.keep:id/reminder_chip")));
		  driver.findElementById("com.google.android.keep:id/reminder_chip").click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.google.android.keep:id/alertTitle")));
		  Assert.assertTrue(driver.findElementById("com.google.android.keep:id/alertTitle").isDisplayed());	  
	  }
	  
	  @AfterClass
	  public void close()
	  {
		  driver.quit();
	  }

}
