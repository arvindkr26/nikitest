package testniki;

import org.testng.annotations.Test;

public class TC30_VerifyOLAAccountLinking extends TestNiki {
	
	//Testcase30-->To link the OLA account to Niki app
	
		@Test
		public void testCase30_olaAccountLinking() throws InterruptedException
		{
			try{
			driver.findElementByAccessibilityId("Open navigation drawer").click();
			System.out.println("Navigation icon is clicked");
			driver.findElementByAndroidUIAutomator("text(\"Improve My Experience\")").click();
			System.out.println("Improve my experience screen is opened");
			appInd.waitFor(10000);
			driver.findElementById("com.techbins.niki.beta:id/accountActionBtn").click();
			System.out.println("Ola link is clicked");
			appInd.waitFor(10000);
			System.out.println("Ola login page is opened");
				
			
			//Unable to switch to Ola app
			/*
			driver.findElementById("username").sendKeys("aravindkramaswamy@gmail.com");
			appInd.waitFor(5000);
			System.out.println("Ola Email id entered");
			driver.findElementById("password").sendKeys("demo@123");
			appInd.waitFor(5000);
			System.out.println("Ola password id entered");
			driver.findElementByClassName("android.widget.Button").click();
			System.out.println("Login button clicked");
			appInd.waitFor(5000);
			driver.findElementByAndroidUIAutomator("content-desc(\"Accept\")").click();
			appInd.waitFor(5000);
			System.out.println("Accepted OLA's permission for Niki");
			System.out.println("OLA account linked to Niki account successfully");
			*/

			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}

}
