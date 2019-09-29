package testcases;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.cl_transvip_createBooking;
import util.Testutil;

public class cl_transvip_createBookingTest extends testbase {

	
	
	@Test(dataProvider="CreateBooking")
	public void create_booking(Hashtable<String,String> data) throws Exception
{

		if(!Testutil.isExecutable("CreateBooking", xls) || data.get("Runmode").equals("N"))
			throw new SkipException("Skipping the test!!!");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			cl_transvip_createBooking cb= PageFactory.initElements(driver,cl_transvip_createBooking.class);
			cb.createBooking(data.get("CustomerEmail"),data.get("Personal"),data.get("corporateName"),data.get("serviceName"),data.get("bookingType"),data.get("PickupDate"),data.get("PickupHour"),data.get("PickupMinute"),data.get("NumberOfPassengers"),data.get("PickupAddress"),data.get("DropoffAddress"),data.get("PickupHint"),data.get("RoundTrip"),data.get("ForThirdPerson"),data.get("paymentMethod"),data.get("Observation"));


}
	@DataProvider
	public Object[][] CreateBooking()
	{
		return Testutil.getData("CreateBooking", xls);
	}
	
}
