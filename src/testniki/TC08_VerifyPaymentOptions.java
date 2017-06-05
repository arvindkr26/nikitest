package testniki;

import org.testng.annotations.Test;

public class TC08_VerifyPaymentOptions extends TestNiki {
	
	//Test case08-->To verify the display of payment options for recharge by entering valid plan
	
			@Test
			public void testCase08_Prepaid() throws InterruptedException
			{
				try{
					driver.findElementByClassName("android.widget.EditText").sendKeys("Hi niki");
					driver.findElementById("com.techbins.niki.beta:id/btnSend").click();
					//appInd.ClickObject(driver,"com.techbins.niki.beta:id/btnSend");
					appInd.waitFor(5000);
					driver.findElementByAndroidUIAutomator("text(\"Prepaid Recharge\")").click();
					System.out.println("Prepaid Recharge option has been selected");

					String outMsg1 = driver.findElementByXPath("//android.widget.Button[@text='Prepaid Recharge']").getText();

					if (outMsg1.equals("Prepaid Recharge"))
					{
						System.out.println("Out going message confirmed as--> " + outMsg1);
					}
					appInd.waitFor(5000);
					driver.findElementByClassName("android.widget.EditText").sendKeys("100");
					System.out.println("Entered the recharge amount");
					driver.findElementById("com.techbins.niki.beta:id/btnSend").click();
					appInd.waitFor(5000);
					
					String orderSummary=driver.findElementByAndroidUIAutomator("text(\"Here is your order summary: Phone No. : 9742725350Operator : VodafoneCircle : KarnatakaAmount : 100Type: Prepaid Recharge\")").getText();

					if(orderSummary.contains("100") && orderSummary.contains("Prepaid") && orderSummary.contains("9742725350"))
					{
						System.out.println("Order is summary is correct");
					}
						
					else
					{
						System.out.println("Oder summary is incorrect");
					}
				}catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				
			}

}
