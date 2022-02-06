package Appium_activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class activity3 {
	AndroidDriver<MobileElement> driver;
	
	@BeforeClass
	public void setUp() throws MalformedURLException
	{
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
	
	@Test(priority=1)
	public void addition()
	{
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("digit_5").click();
		driver.findElementById("op_add").click();
		driver.findElementById("digit_9").click();
		driver.findElementById("eq").click();
		String result = driver.findElementById("result").getText();
		System.out.println("Result of addition:"+result);
		Assert.assertEquals(result, "14");
	}
	
	@Test(priority=2)
	public void subtract()
	{
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("digit_1").click();
		driver.findElementById("digit_0").click();
		driver.findElementById("op_sub").click();
		driver.findElementById("digit_5").click();
		driver.findElementById("eq").click();
		String result = driver.findElementById("result").getText();
		System.out.println("Result of subtraction:"+result);
		Assert.assertEquals(result, "5");
	}
	
	@Test(priority=3)
	public void multiply()
	{
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("digit_5").click();
		driver.findElementById("op_mul").click();
		driver.findElementById("digit_1").click();
		driver.findElementById("digit_0").click();
		driver.findElementById("digit_0").click();
		driver.findElementById("eq").click();
		String result = driver.findElementById("result").getText();
		System.out.println("Result of multiplication:"+result);
		Assert.assertEquals(result, "500");
		
	}
	
	@Test(priority=4)
	public void division()
	{
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("digit_5").click();
		driver.findElementById("digit_0").click();
		driver.findElementById("op_div").click();
		driver.findElementById("digit_2").click();
		driver.findElementById("eq").click();
		String result = driver.findElementById("result").getText();
		System.out.println("Result of division:"+result);
		Assert.assertEquals(result, "25");
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}

}
