/*findElements with get() method : findElements with get() method element locating strategy is used to locate DELETE and + buttons of calc app.
Here "android.widget.Button" is common class name of all buttons. So It will find all elements which contains class name = "android.widget.Button"
and then get() method will locate given Indexed element from list. DELETE button has index = 0 and + button has index = 16. xpath : xpath element locator
is used to locate number button 2. Here "android.widget.Button" is class name and then it will look for element where text value = "2". id :
	id element locator is used to locate number button 5. Here it will directly look for element where resource-id="com.android.calculator2:id/digit5". 
	name : name element locator is used to locate = button. In this case, It will look for element where text value = "=".
	className : className element locator is used to locate result text area. It will find element where class value = "android.widget.EditText". 
	
	*/
package AppiumScriptsPKG;
import java.net.MalformedURLException; 
import java.net.URL; 
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver; 
import org.testng.annotations.AfterTest; 
import org.testng.annotations.BeforeTest; 
import org.testng.annotations.Test; 
public class ObjectionLocation {

	WebDriver driver; 
	@BeforeTest
	public void setUp() throws MalformedURLException { 
		// Created object of DesiredCapabilities class.
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// Set android deviceName desired capability. Set your device name. 
		//capabilities.setCapability("deviceName", "ZX1B32FFXF"); 
		  capabilities.setCapability("deviceName", "Android Emulator");
		// Set BROWSER_NAME desired capability. It's Android in our case here.
	//	capabilities.setCapability("browserName", "Android"); 
		// Set android VERSION desired capability. Set your mobile device's OS version. 
		capabilities.setCapability("platformVersion", "4.4.2"); 
		// Set android platformName desired capability. It's Android in our case here.
		capabilities.setCapability("platformName", "Android");
		// Set android appPackage desired capability. It is com.android.calculator2 for calculator application. 
		// Set your application's appPackage if you are using any other app. 
		capabilities.setCapability("appPackage", "com.android.calculator2"); 
		// Set android appActivity desired capability. It is com.android.calculator2.Calculator for calculator application.
		// Set your application's appPackage if you are using any other app. 
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator"); 
		// Created object of RemoteWebDriver will all set capabilities. 
		// Set appium server address and port number in URL string. 
		// It will launch calculator app in android device. 
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		}
	
	@Test
	public void Sum() { 
		// Using findElements. // Locate DELETE/CLR button using findElements and get() method and click on it.
		driver.findElements(By.xpath("//android.widget.Button")).get(0).click();
		// By xpath. // Locate number button 2 by XPATH element locator and click on it. 
		driver.findElement(By.xpath("//android.widget.Button[@text='2']")).click(); 
		// Using findElements. // Locate number button + using findElements and get() method and click on it.
		driver.findElements(By.xpath("//android.widget.Button")).get(16).click(); 
		// By id. // Locate number button 5 by ID element locator and click on it.
		driver.findElement(By.id("com.android.calculator2:id/digit5")).click(); 
		// By name. // Locate number button = by name element locator and click on it. 
		//Name means it Text
		driver.findElement(By.name("=")).click(); 
		// By className. // Locate result textbox by CLASSNAME element locator and get result from it. 
		String result = driver.findElement(By.className("android.widget.EditText")).getText();
		System.out.println("Number sum result is : " + result); 
		}
	@AfterTest
	public void End() { 
		//Quit
		driver.quit(); 
		}
} 


