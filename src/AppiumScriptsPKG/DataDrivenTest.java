package AppiumScriptsPKG;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.IOException; 
import java.net.MalformedURLException; 
import java.net.URL; 
import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert; 
import org.testng.annotations.Test;
@Test
public class DataDrivenTest {
	AndroidDriver driver;
	  
	  @Test
	public void Datadriven() throws MalformedURLException, InterruptedException
	{
	
		DesiredCapabilities capabilities = new DesiredCapabilities();
	//capabilities.setCapability("deviceName", "ZX1B32FFXF");
	//capabilities.setCapability("browserName", "Android");
	//capabilities.setCapability("platformVersion", "4.4.2");
	capabilities.setCapability("platformName", "Android"); 
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
	capabilities.setCapability("appPackage", "com.bt.bms");
	capabilities.setCapability("appActivity", "com.bt.bms.activities.SplashActivity");
	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); 
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	Thread.sleep(7000);
		driver.findElementById("com.bt.bms:id/btnLogin").click();
		  Thread.sleep(2000);
		driver.findElementById("com.bt.bms:id/btnSignUp").click();
		  Thread.sleep(2000);
	driver.findElementById("com.bt.bms:id/edtFirstName").sendKeys("firstname");
		driver.findElementById("com.bt.bms:id/edtLastName").sendKeys("lastname");
		driver.findElementById("com.bt.bms:id/edtEmailId").sendKeys("abcd12@abcd12.com");
		driver.findElementById("com.bt.bms:id/edtPassword").sendKeys("abcd12");
		driver.findElementById("com.bt.bms:id/action_icon").click();
		  Thread.sleep(2000);
//	String hi=driver.switchTo().alert().getText();
	//System.out.println(hi);
	//driver.switchTo().alert().accept();
	String hii=driver.findElementById("com.bt.bms:id/message").getText();
		System.out.println(hii);
	driver.findElementById("com.bt.bms:id/dismiss").click();
	
	}

}

