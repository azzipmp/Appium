package AppiumScriptsPKG;

import io.appium.java_client.MobileDriver; 
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File; 
import java.net.MalformedURLException;
import java.net.URL; 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test; 

public class DragandDropTest {
	WebDriver driver; 
	@BeforeTest
			  public void setUp() throws Exception { 
	//	File f1=new File("D:\\Selenium - Java\\com.mobeta.android.demodslv-0.5.0-3_APKdot.com.apk");
			  DesiredCapabilities capabilities = new DesiredCapabilities();
			 // capabilities.setCapability("deviceName", "ZX1B32FFXF");
			  capabilities.setCapability("deviceName", "Android Emulator");
			//  capabilities.setCapability("browserName", "Android"); 
			  capabilities.setCapability("platformVersion", "4.4.2");
			  capabilities.setCapability("platformName", "Android"); 
		//	  capabilities.setCapability(MobileCapabilityType.APP,f1.getAbsolutePath());
			  capabilities.setCapability("appPackage", "com.mobeta.android.demodslv"); 
				capabilities.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher"); 
			  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); 
			  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
			  } ; 
			 
			  @Test
			  public void draganddrop()
			  {
				//Tap on Basic usage Playground. 
				  driver.findElement(By.name("Basic usage playground")).click(); //Locate 3rd element(Chick Corea) from list to drag.
				  
				  WebElement ele1 = (WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(2); 
				  //Locate 6th element to drop dragged element. 
				  WebElement ele2 = (WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(5);
				  //Perform drag and drop operation using TouchAction class. //Created object of TouchAction class.
				  TouchAction action = new TouchAction((MobileDriver) driver);
				  System.out.println("It Is dragging element.");
				  //It will hold tap on 3rd element and move to 6th position and then release tap. 
				  action.longPress(ele1).moveTo(ele2).release().perform(); 
				  System.out.println("Element has been droped at destination successfully.");
				
			  }
		
	@AfterTest
	public void End() { 
		//Quit
		driver.quit(); 
		}
} 



