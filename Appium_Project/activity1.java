package Appium_Project;

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
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;

public class activity1 {
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp() throws MalformedURLException
	{
		 DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "Pixel 4 Emulator");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("automationName", "UiAutomator2");
	        caps.setCapability("appPackage", "com.google.android.apps.tasks");
	        caps.setCapability("appActivity", ".ui.TaskListsActivity");
	        
	        // Instantiate Appium Driver
	        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        wait = new WebDriverWait(driver, 10);
	}
	
	@Test
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Create new task\"]").click();
		driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys("Complete Activity with Google Tasks");
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		Assert.assertTrue(driver.findElementById("//com.google.android.apps.tasks:id/task_name").isDisplayed());
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Create new task\"]").click();
		driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys("Complete Activity with Google Keep");
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		Assert.assertTrue(driver.findElementById("//com.google.android.apps.tasks:id/task_name").isDisplayed());
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Create new task\"]").click();
		driver.findElementById("com.google.android.apps.tasks:id/add_task_title").sendKeys("Complete the second Activity Google Keep");
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		Assert.assertTrue(driver.findElementById("//com.google.android.apps.tasks:id/task_name").isDisplayed());
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Create new task\"]").click();
		List<MobileElement> taskList = driver.findElementsByClassName("android.widget.TextView");
		
		for(MobileElement taskLists : taskList) {
            System.out.println(taskLists.getText());
        }
		
		
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}
		

}
