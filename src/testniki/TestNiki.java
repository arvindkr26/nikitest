package testniki;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;


//android.widget.TextView[@text='Niki is typing']
public class TestNiki {

	public static AndroidDriver<?> driver = null;
	public AppIndependent appInd=null;

	@BeforeTest
	public void setUp() throws MalformedURLException {

		File appDir = new File("src");
		File app = new File(appDir, "app-test-apk.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "ZY2226BRVK");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		//capabilities.setCapability("appPackage", "com.techbins.niki-1");
		//capabilities.setCapability("appActivity", "com.techbins.niki.SplashActivity");
		capabilities.setCapability("noReset", "true");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		System.out.println("Niki app has launched successfully");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}
	
	@AfterTest
	public void End() throws InterruptedException 
	{
		try{
		appInd.terminateNikiSession();
		driver.quit();
		System.out.println("Niki app has been closed successfully");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

		
	}

}