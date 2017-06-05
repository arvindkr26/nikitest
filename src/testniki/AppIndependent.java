package testniki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class AppIndependent extends TestNiki{

	public void waitFor(long duration)
	{
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ClickObject(AndroidDriver<?> driver, String obj)
	{
		//WebElement oEle=null;
		try
		{
			driver.findElementById(obj).click();
		}catch(Exception e)
			{
				System.out.println("Error while clicking "+e.getMessage());
			}
	}
	
	
	public void ClickOnDeviceBackButton()
	{
		try
		{
			driver.pressKeyCode(AndroidKeyCode.BACK);
		}catch(Exception e)
			{
				System.out.println("Error while clicking device back button"+e.getMessage());
			}
	}
	
	
	public void terminateNikiSession()
	{
		try
		{
			driver.findElementById("com.techbins.niki.beta:id/action_cancel").click();
			System.out.println("Terminating the current niki session");
			waitFor(5000);
			driver.findElementById("com.techbins.niki.beta:id/btnYes").click();
			waitFor(5000);
			System.out.println("Terminated the current niki session successfully");
		}catch(Exception e)
		{
			System.out.println("Error while termination session "+e.getMessage());
		}
	}
}
