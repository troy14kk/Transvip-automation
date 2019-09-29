package testcases;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pages.cl_transvip_login;
import util.Testutil;

public class cl_transvip_loginTest extends testbase {

	
	@BeforeSuite
	public void initiate()
	{
		init();
	}
	@Test(dataProvider="AdminLogin")
		public void login(Hashtable<String,String> data) throws Exception
{
	
			if(!Testutil.isExecutable("AdminLogin", xls) || data.get("Runmode").equals("N"))
				throw new SkipException("Skipping the test");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				cl_transvip_login aap= PageFactory.initElements(driver, cl_transvip_login.class);
				aap.login(data.get("AdminEmail"),data.get("AdminPassword"));

			

}
		@DataProvider
		public Object[][] AdminLogin()
		{
			return Testutil.getData("AdminLogin", xls);
		}

	
}
