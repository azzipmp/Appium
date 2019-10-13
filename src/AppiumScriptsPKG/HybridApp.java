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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest; 
 

	
public class HybridApp {
 
AndroidDriver driver; 
  
  @BeforeTest
  public void setUp() throws Exception { 
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	 // capabilities.setCapability("deviceName", "ZX1B32FFXF");
	  capabilities.setCapability("deviceName", "Android Emulator");
	  capabilities.setCapability("browserName", "Android"); 
	  capabilities.setCapability("platformVersion", "4.4.2");
	  capabilities.setCapability("platformName", "Android"); 
	  capabilities.setCapability("appPackage", "com.webtrends.WThybridAppSample"); 
	  capabilities.setCapability("appActivity","com.webtrends.WThybridAppSample.HybridAppSampleActivity"); 
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); 
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	  } 
	
  @Test
  public void typeInText() throws InterruptedException {
	  // Scroll till element which contains "Views" text If It Is not visible on screen. 
	
	  
	  } 
  
  @AfterTest
  public void End() { 
	  driver.quit(); 
	  
	  }
  }