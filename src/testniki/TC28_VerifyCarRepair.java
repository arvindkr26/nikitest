package testniki;

import org.testng.annotations.Test;

public class TC28_VerifyCarRepair extends TestNiki{
	
	//Testcase28-->To verify the Car Repair from Repairs under Local search.
	
			@Test
			public void testCase28_localSearch() throws InterruptedException
			{
				try{		
				driver.findElementByClassName("android.widget.EditText").sendKeys("Hi Niki");
				driver.findElementById("com.techbins.niki.beta:id/btnSend").click();
				appInd.waitFor(5000);
				driver.findElementByAndroidUIAutomator("text(\"Local Search\")").click();
				System.out.println("Local Search option has been selected");

				String outMsg1 = driver.findElementByXPath("//android.widget.Button[@text='Local Search']").getText();

				if (outMsg1.equals("Local Search"))
				{
					System.out.println("Out going message confirmed as--> " + outMsg1);
				}
				appInd.waitFor(5000);
				
				driver.findElementByAndroidUIAutomator("text(\"Repairs\")").click();
				System.out.println("Repairs option has been selected");

				String outMsg2 = driver.findElementByXPath("//android.widget.Button[@text='Local Search']").getText();

				if (outMsg2.equals("Repairs"))
				{
					System.out.println("Out going message confirmed as--> " + outMsg1);
				}
				appInd.waitFor(5000);
				
				
				driver.findElementByClassName("android.widget.EditText").sendKeys("Airtel");
				System.out.println("Changing the network opertaor to Airtel");
				driver.findElementById("com.techbins.niki.beta:id/btnSend").click();
				appInd.waitFor(5000);
				
				String expectedMessage = "Picking your Operator as Airtel";
				String actualMessage = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"" + expectedMessage + "\")").getText();
						
				//String expectedMessage=driver.findElementByXPath("//android.widget.TextView[contains(@text,'Picking your Operator as Airtel.']").getText();
				
				if(actualMessage.contains("Airtel"))
				{
					System.out.println("Network operator has changed to Airtel successfully");
				}
				else
				{
					System.out.println("Network operator has not changed to Airtel");

				}
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}

}
