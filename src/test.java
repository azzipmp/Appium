import static org.junit.Assert.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.testng.Assert;



public class test {
	 WebDriver driver;
	
	 @Test(priority=0)
	public void test() throws MalformedURLException
	{
	 
		
	//File f1=new File("D:\\Selenium - Java\\com.bt.bms.apk");
	File f1=new File("D:\\Selenium - Java\\selendroid-test-app-0.16.0.apk");
//		File f1=new File("D:\\Selenium - Java\\AndroidCalculator (1).apk");
	//	File f1=new File("D:\\Selenium - Java\\Simple Notepad (1).apk");
	//	File f1=new File("D:\\Selenium - Java\\com.amazon.mShop.android.shopping-5.2.3-502030-minAPI9.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		
		 cap.setCapability("deviceName", "Android Emulator"); //update device name
		//cap.setCapability("deviceName", "1550775e"); //update device name
		cap.setCapability("platformVersion", "5.0.1"); // update platform version
		cap.setCapability("platformName", "Android");
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
	
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "200");
		cap.setCapability(MobileCapabilityType.APP,f1.getAbsolutePath());
		//AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		 driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	 
		
		/*	
		driver.findElementById("com.bt.bms:id/btnLogin").click();
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		driver.findElementById("com.bt.bms:id/btnSignUp").click();
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
	
		driver.findElementById("com.bt.bms:id/edtFirstName").sendKeys("firstname");
		driver.findElementById("com.bt.bms:id/edtLastName").sendKeys("lastname");
		driver.findElementById("com.bt.bms:id/edtEmailId").sendKeys("abcd12@abcd12.com");
		driver.findElementById("com.bt.bms:id/edtPassword").sendKeys("abcd12");
		driver.findElementById("com.bt.bms:id/action_icon").click();
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
//	String hi=driver.switchTo().alert().getText();
	//System.out.println(hi);
	//driver.switchTo().alert().accept();
	String hii=driver.findElementById("com.bt.bms:id/message").getText();
		System.out.println(hii);
	driver.findElementById("com.bt.bms:id/dismiss").click();
	*/
	}

}
