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
 

	
public class ObjectLocate {
 
AndroidDriver driver; 
  
  @BeforeTest
  public void setUp() throws Exception { 
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	 // capabilities.setCapability("deviceName", "ZX1B32FFXF");
	  capabilities.setCapability("deviceName", "Android Emulator");
	  capabilities.setCapability("browserName", "Android"); 
	  capabilities.setCapability("platformVersion", "4.4.2");
	  capabilities.setCapability("platformName", "Android"); 
	  capabilities.setCapability("appPackage", "io.appium.android.apis"); 
	  capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos"); 
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); 
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	  } 
	
  @Test
  public void typeInText() throws InterruptedException {
	  // Scroll till element which contains "Views" text If It Is not visible on screen. 
	  driver.scrollTo("Views"); // Click on Views. 
	  driver.findElement(By.name("Views")).click(); // Scroll till element which contains "Controls" text If It Is not visible on screen.
	  driver.scrollTo("Controls"); // Click on Controls. 
	  driver.findElement(By.name("Controls")).click(); // Scroll till element which contains "2. Dark Theme" text If It Is not visible on screen.
	  driver.scrollTo("2. Dark Theme"); // Click on 2. Dark Theme.
	  driver.findElement(By.name("2. Dark Theme")).click(); // Typing in text box using sendKeys command. 
	  driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("Test");
	  
// Hide keyboard
	  driver.hideKeyboard();
	  
	  //Check box
	  driver.findElement(By.name("Checkbox 2")).click();
	  Thread.sleep(2000);
	// Click on RadioButton 2 to select it. 
	  driver.findElement(By.name("RadioButton 2")).click(); 
	  // Select drop down box
	  driver.findElement(By.id("android:id/text1")).click();
	 // driver.findElement(By.name("Mars")).click(); 
	  Thread.sleep(2000);
	  // Get the values from drop down box
	  List<WebElement> dropList = driver.findElements(By.id("android:id/text1")); 
	  	  //Extract text from each element of drop down list one by one. 
	  System.out.println("Drop down value size:"+dropList.size());

 	  
	  for(int i=0; i< dropList.size(); i++)
	  {
		  MobileElement listItem = (MobileElement) dropList.get(i);
		  System.out.println(listItem.getText());
		  
	  }
	  
	  } 
  
  @AfterTest
  public void End() { 
	  driver.quit(); 
	  
	  }
  }
  