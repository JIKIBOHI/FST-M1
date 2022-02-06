package Appium_activities;

import java.net.MalformedURLException;
import java.net.URL;
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

public class activity2 {
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 4 Emulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);
 
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
       // wait = new WebDriverWait(driver, 10);
	}
	
	@Test
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.training-support.net/");
		String title = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
	    System.out.println("Title on Homepage: " + title);
	    Assert.assertEquals(title, "Training Support");
	       
	    MobileElement aboutUs = driver.findElementByXPath("//android.view.View[@text='About Us']");
	    aboutUs.click();
	    String newTitle = driver.findElementByXPath("//android.view.View[@text='About Us']").getText();
	    System.out.println("Title of about us page:"+newTitle);
	    Assert.assertEquals(newTitle, "About Us");
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}

}
