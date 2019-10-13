package AppiumScriptsPKG;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import java.util.*;
import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest; 
 
// HAVING ISSUE IN RUNNING ENULATOR BUT RUN IN CHROME APP.
public class BrowserAutomationTest {
	 WebDriver driver;
	  
	

	 @BeforeTest
	  public void setUp() throws Exception { 
		
		/*
		 DesiredCapabilities capibilities = new DesiredCapabilities();
		 capibilities.setBrowserName("Browser"); // use chrome for Chrome browser
		 capibilities.setCapability("deviceName", "Android Emulator");
		 capibilities.setCapability("platformVersion", "5.0.1"); // update platform version
		 capibilities.setCapability("platformName", "Android");

		 RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),
		   capibilities);
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 

		
		 
		 driver.get("http://bing.com/");
		// driver.manage().Timeouts().ImplicitlyWait(TimeSpan.fFromSeconds(60));		 
		 // print the title
		 Thread.sleep(2000);
		  System.out.println("Title "+driver.getTitle());
		 driver.quit();
		 */

		
		

		  // capabilities of the android driver
		 DesiredCapabilities capibilities = new DesiredCapabilities();
	//	 capibilities.setBrowserName("Browser"); // use chrome for Chrome browser
		 capibilities.setBrowserName("chrome");
		// capibilities.setCapability("deviceName", "Android Emulator"); //update device name
		 capibilities.setCapability("deviceName", "1550775e"); //update device name
		 capibilities.setCapability("platformVersion", "5.0.1"); // update platform version
		 capibilities.setCapability("platformName", "Android");

		 driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),
		   capibilities);


		 
		  }
	 

	 @Test
     public void launchBrowser() throws InterruptedException
     {
         driver.get("http://www.newtours.demoaut.com");
         Thread.sleep(2000);
	 	  	driver.findElement(By.linkText("REGISTER")).click();
	 	  	
	 	  	Thread.sleep(2000);
         driver.close();
     }
}
