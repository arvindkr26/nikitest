package testniki;

import org.testng.annotations.Test;

public class TC19_VerifyChangingNetworkOperator extends TestNiki{
	
	//Test case19-->To change the default network operator to some other preferred network
	
		@Test
		public void testCase19_PostpaidBill() throws InterruptedException
		{
			try{
				driver.findElementByClassName("android.widget.EditText").sendKeys("Hi niki");
				driver.findElementById("com.techbins.niki.beta:id/btnSend").click();
				appInd.waitFor(5000);
				driver.findElementByAndroidUIAutomator("text(\"Postpaid Bill\")").click();
				System.out.println("Postpaid bill option has been selected");

				String outMsg1 = driver.findElementByXPath("//android.widget.Button[@text='Postpaid Bill']").getText();

				if (outMsg1.equals("Postpaid Bill"))
				{
					System.out.println("Out going message confirmed as--> " + outMsg1);
				}
				appInd.waitFor(5000);
				driver.findElementByClassName("android.widget.EditText").sendKeys("Airtel");
				System.out.println("Changing the network opertaor to Airtel");
				driver.findElementById("com.techbins.niki.beta:id/btnSend").click();
				appInd.waitFor(5000);
				String expectedMessage=driver.findElementByXPath("//android.widget.TextView[contains(@text,'Picking your Operator as Airtel.']").getText();
				
				if(expectedMessage.contains("Airtel"))
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
