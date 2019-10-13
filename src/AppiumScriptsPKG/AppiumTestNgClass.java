package AppiumScriptsPKG;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.testng.Assert;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;


public class AppiumTestNgClass {
	
	public DesiredCapabilities cap;
	public RemoteWebDriver driver;
	public String expected="Please enter password with minimum 7 characters";
	 @BeforeTest
  public void initialize() throws MalformedURLException {

		File f1=new File("D:\\Selenium - Java\\com.bt.bms.apk");
		//	File f1=new File("D:\\Selenium - Java\\ApiDemos-debug.apk");
//			File f1=new File("D:\\Selenium - Java\\AndroidCalculator (1).apk");
		//	File f1=new File("D:\\Selenium - Java\\Simple Notepad (1).apk");
			 cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		//	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
			//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "1550775e"); 
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "200");
			cap.setCapability(MobileCapabilityType.APP,f1.getAbsolutePath());
			 driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			// driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		 
  }
	 
	 @Test(priority=0)
	 public void signin()
	 {
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
//		String hi=driver.switchTo().alert().getText();
		//System.out.println(hi);
		//driver.switchTo().alert().accept();
		String actual=driver.findElementById("com.bt.bms:id/message").getText();
			System.out.println(actual);
		driver.findElementById("com.bt.bms:id/dismiss").click();
		Assert.assertEquals(actual, expected);
		
	 }
	  
	 @AfterTest
	   public void Close()
	 {
	driver.quit();
	
	 }
	 
}
