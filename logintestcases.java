package pages;

import java.io.IOException;

import org.testng.annotations.Test;

public class logintestcases {
	public class Logintestcases extends Base  {
		@Test
		public void abc() throws IOException, InterruptedException
		{
			Thread.sleep(5000);
			login_hRM atp = new login_hRM(driver);
			atp.loginbutton();
		}
	}
}
		

