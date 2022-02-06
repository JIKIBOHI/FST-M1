package Appium_activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class activity4 {
AndroidDriver<MobileElement> driver;
	
	@BeforeClass
	public void setUp() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 4 Emulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.contacts");
        caps.setCapability("appActivity", ".activities.PeopleActivity");
        caps.setCapability("noReset", true);
 
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
	}
	
	@Test
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElementByXPath("//android.widget.TextView[@content-desc='Phone']").click();
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Create new contact']").click();
		driver.findElementByXPath("//android.widget.EditText[@text='First name']").sendKeys("Aditya");
		driver.findElementByXPath("//android.widget.EditText[@text='Last name']").sendKeys("Varma");
		driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("999148292");
		driver.findElementByXPath("//android.widget.Button[@text='SAVE']").click();
		Assert.assertTrue(driver.findElementById("com.android.contacts:id/title_gradient").isDisplayed());
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}
}
