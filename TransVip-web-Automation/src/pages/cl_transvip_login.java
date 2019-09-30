
package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import org.testng.Assert;
//import pages.self_defined_exception;

import util.Constants;

/**
 * @author Shamik
 *
 */
public class cl_transvip_login {

	WebDriver driver;
	Exception e;
	
	@FindBy(how=How.XPATH, using=Constants.admin_email)
	@CacheLookup
	WebElement admin_email;
	
	@FindBy(xpath=Constants.admin_password) 
	WebElement admin_password;
	
	@FindBy(xpath=Constants.login_button) 
	WebElement login_button;
	
	@FindBy(xpath=Constants.login_failure)
	WebElement login_failure;
	
	public cl_transvip_login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void login(String adminEmail, String adminPassword) throws Exception
	{
		
		driver.get("https://preprod-admin.transvip.cl");
		Thread.sleep(4000);
		admin_email.sendKeys(adminEmail);
		admin_password.sendKeys(adminPassword);
		login_button.click();
//		Thread.sleep(1000);
//		if(login_failure.isDisplayed())
//		{
//			self_defined_exception.call_exception();
//		}

	}
}	
