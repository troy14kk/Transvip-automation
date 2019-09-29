
package pages;

//import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import util.Constants;



/**
 * @author Shamik
 *
 */
public class cl_transvip_createBooking  {
	
	WebDriver driver;
	public cl_transvip_createBooking(WebDriver dr)
	{
		
		driver=dr;
	}

	
	@FindBy(how=How.XPATH, using=Constants.launch_createBooking)
	@CacheLookup
	WebElement launch_createBooking;
	
	@FindBy(how=How.XPATH, using=Constants.search_customer_createBooking)
	@CacheLookup
	WebElement search_Customer;
	
	@FindBy(how=How.XPATH, using=Constants.search_customer_suggestion) 
	@CacheLookup
	WebElement search_customer_suggestion;
	
	@FindBy(how=How.XPATH, using=Constants.personal_radio_button) 
	@CacheLookup
	WebElement personal_radio;
	
	@FindBy(how=How.XPATH, using=Constants.corporate_radio_button) 
	@CacheLookup
	WebElement corporate_radio;
	
	@FindBy(how=How.XPATH, using=Constants.agreement_dropdown) 
	@CacheLookup
	WebElement corporate_dropdown;
	
	@FindBy(how=How.XPATH, using=Constants.type_of_service_dropdown) 
	@CacheLookup
	WebElement type_of_service_dropdown;
	
	@FindBy(how=How.XPATH, using=Constants.number_of_passengers_create_booking) 
	@CacheLookup
	WebElement passenger_count_create_booking;
	
	@FindBy(how=How.XPATH, using=Constants.type_of_booking_dropdown)
	@CacheLookup
	WebElement type_of_booking;
	
	@FindBy(how=How.XPATH,using=Constants.launch_exclusive_parent_calender)
	@CacheLookup
	WebElement launch_exclusive_parent_calender;
	
	@FindBy(how=How.XPATH, using=Constants.activate_year_toggle_exclusive)
	@CacheLookup
	WebElement activate_year_toggle_exclusive;
	
	@FindBy (how=How.XPATH, using=Constants.next_month_exclusive_parent)
	@CacheLookup
	WebElement next_month_exclusive_parent;
	
	@FindBy (how=How.XPATH, using=Constants.next_year_exclusive)
	@CacheLookup
	WebElement next_year_exclusive;
	
	@FindBy (how=How.XPATH, using=Constants.next_month_exclusive)
	@CacheLookup
	WebElement next_month_exclusive;
	
	@FindBy (how=How.XPATH, using=Constants.calender_first_date_exclusive)
	@CacheLookup
	WebElement calender_first_date_exclusive;
	
	@FindBy (how=How.XPATH, using=Constants.hour_entry_exclusive)
	@CacheLookup
	WebElement hour_entry_exclusive;
	
	@FindBy (how=How.XPATH, using= Constants.minute_entry_exclusive)
	@CacheLookup
	WebElement minute_entry_exclusive;
	
	@FindBy (how=How.XPATH, using= Constants.pickup_address)
	@CacheLookup
	WebElement pickup_address;
	
	@FindBy (how=How.XPATH, using=Constants.dropoff_address)
	@CacheLookup
	WebElement dropoff_address;
	
	@FindBy (how=How.XPATH, using= Constants.pickup_hint_text)
	@CacheLookup
	WebElement pickup_hint_text;
	
	@FindBy (how=How.XPATH, using=Constants.third_person_dropdown)
	@CacheLookup
	WebElement third_person_dropdown;
	
	@FindBy (how=How.XPATH, using=Constants.round_trip_toggle)
	@CacheLookup
	WebElement round_trip_toggle;
	
	@FindBy (how=How.XPATH, using=Constants.wait_time_toggle)
	@CacheLookup
	WebElement wait_time_toggle;
	
	@FindBy (how=How.XPATH, using= Constants.launch_return_calender)
	@CacheLookup
	WebElement launch_return_calender;
	
	@FindBy (how=How.XPATH, using= Constants.calender_first_date_return)
	@CacheLookup
	WebElement calender_first_date_return;
	
	@FindBy (how=How.XPATH, using= Constants.first_month_return)
    @CacheLookup
    WebElement first_month_return;
	
	@FindBy (how=How.XPATH, using=Constants.first_month_exclusive)
	@CacheLookup
	WebElement first_month_exclusive;
	
	@FindBy (how=How.XPATH, using=Constants.activate_year_toggle_return)
	@CacheLookup
	WebElement activate_year_toggle_return;
	
	@FindBy (how=How.XPATH, using=Constants.next_year_return)
	@CacheLookup
	WebElement next_year_return;
	
	@FindBy (how=How.XPATH, using=Constants.next_month_return)
	@CacheLookup
	WebElement next_month_return;
	
	@FindBy (how=How.XPATH, using=Constants.hour_entry_return)
	@CacheLookup
	WebElement hour_entry_return;
	
	@FindBy (how=How.XPATH, using=Constants.minute_entry_return)
	@CacheLookup
	WebElement minute_entry_return;
	
	@FindBy (how=How.XPATH, using=Constants.item_of_charge_dropdown)
	@CacheLookup
	WebElement item_of_charge_dropdown;
	
	@FindBy (how=How.XPATH, using=Constants.payment_method_dropdown)
	@CacheLookup
	WebElement payment_method_dropdown;
	
	@FindBy(how= How.XPATH, using=Constants.promo_code_entry)
	@CacheLookup
	WebElement promo_code_entry;
	
	@FindBy(how= How.XPATH, using=Constants.apply_promo_code)
	@CacheLookup
	WebElement apply_promo_code;
	
	@FindBy(how=How.XPATH, using=Constants.booking_obervations)
	@CacheLookup
	WebElement booking_observations;
	
	@FindBy(how=How.XPATH, using=Constants.sumbit_button_createBooking)
	@CacheLookup
	WebElement submit_button_createBooking;

	@FindBy(xpath=Constants.customer_not_found_text)
	@CacheLookup
	WebElement customer_not_found;

	@FindBy(xpath=Constants.loader_scope)
	WebElement loader_scope;
	
	@FindBy(xpath=Constants.payment_drop_launcher)
	WebElement payment_dropdown_launcher;
	
	
	public void createBooking(String customerEmail, String personal, String corporateName,String serviceName, String bookingType, String pickupdate,
			String pickuphour, String pickupminute, String numberOfPassengers, String pickupAddress,
			String dropoffAddress, String pickupHint, String roundTrip, String forThirdPerson, String paymentMethod, String observation) throws Exception 
	{
		System.out.println("Entered Create Booking!!!");
	 WebDriverWait wait=new WebDriverWait(driver,20);
	 wait.until(ExpectedConditions.visibilityOf(launch_createBooking));
	 
	 //START OF Create Booking 
	 
	
	 launch_createBooking.click();
	 wait.until(ExpectedConditions.visibilityOf(loader_scope));
	 search_Customer.sendKeys(customerEmail);
	 
	 
		 try
		 {
//			 wait.until(ExpectedConditions.visibilityOf(loader_scope));
			 Thread.sleep(3000);
			 if(search_customer_suggestion.isDisplayed())
				 search_Customer.sendKeys(Keys.ENTER);
		 }
		 catch(Exception e)
		 {
			 if(customer_not_found.isDisplayed())
				 Assert.assertTrue(false,"Customer not found bro!");
		 }
	 Thread.sleep(3000);
	 if(((int)Double.parseDouble(personal))==1)
		 personal_radio.click();
	 else
		 {
		 corporate_radio.click();
		 wait.until(ExpectedConditions.visibilityOf(loader_scope));
		 corporate_dropdown.click();
		 Select dropagreement=new Select(corporate_dropdown);
		 dropagreement.selectByVisibleText(corporateName);
		 }
	 wait.until(ExpectedConditions.visibilityOf(loader_scope));
	 Select dropService=new Select(type_of_service_dropdown);
	 dropService.selectByVisibleText(serviceName);
	 
	 passenger_count_create_booking.sendKeys(Integer.toString(((int)Double.parseDouble(numberOfPassengers))));
	 
	 //Condition for scheduled booking
	 
	 if(bookingType.equals("Programada"))
		 {
			 Select bookingTypeDrop=new Select(type_of_booking);
			 bookingTypeDrop.selectByVisibleText(bookingType);
             
			 System.out.println("Selecting Date now!!");
             
			set_date_time(pickupdate);
			 
			 //Pickup address entry
			 pickup_address.sendKeys(pickupAddress);
			 Thread.sleep(2000);
			 pickup_address.sendKeys(Keys.ARROW_DOWN);
			 pickup_address.sendKeys(Keys.ENTER);
			 
			 wait.until(ExpectedConditions.visibilityOf(loader_scope));

			 //Pinkup hint entry
			 pickup_hint_text.sendKeys(pickupHint);

			 wait.until(ExpectedConditions.visibilityOf(loader_scope));

			 
			 //dropoff address entry
			 dropoff_address.sendKeys(dropoffAddress);
			 Thread.sleep(2000);
			 dropoff_address.sendKeys(Keys.ARROW_DOWN);
			 dropoff_address.sendKeys(Keys.ENTER);
			 
			 wait.until(ExpectedConditions.visibilityOf(loader_scope));

			 
			 //select payment method
			 payment_dropdown_launcher.click();
			 Thread.sleep(500);
			 payment_method_dropdown.sendKeys(paymentMethod);
			 Thread.sleep(500);
			 payment_method_dropdown.sendKeys(Keys.ENTER);
			 
			 //Observation Entry
			 booking_observations.sendKeys(observation);
			 
			 Thread.sleep(2000);
			 //SUBMIT BOOKING
			 submit_button_createBooking.click();
			 
		 
		 }	
	 
	}
	
	//function to set date and time on the calendar dynamically
	public void set_date_time(String pick_date) throws Exception
	{
		String arr[]=pick_date.split("/");
        int date=Integer.parseInt(arr[0]);
        int month=Integer.parseInt(arr[1]);
        int year=Integer.parseInt(arr[2]);
        
        System.out.println("INSIDE THE NEW FUNCTION!!");
        
		launch_exclusive_parent_calender.click();
		String get_year= activate_year_toggle_exclusive.getText().toString();
		int calender_year= Integer.parseInt(get_year.substring(get_year.length()-4));
		
//		System.out.println("Calender year===="+calender_year);
//		System.out.println("Test year===="+year);
		
		if(year>calender_year)
		{
			// Select future year
			activate_year_toggle_exclusive.click();
			for(int i=0;i<(year-calender_year);i++)
				next_year_exclusive.click();
			
			System.out.println("Year selected bro!");
			// Select month 
			String select_month=first_month_exclusive.toString()+"["+Integer.toString(month)+"]";
			System.out.println("XPath for month=======>"+select_month);
			driver.findElement(By.xpath(select_month)).click();			
			System.out.println("Month selected bro!");
			//Select date
			String select_date= calender_first_date_exclusive.toString()+"["+Integer.toString(date)+"]";
			driver.findElement(By.xpath(select_date)).click();
			
			
		}
		
	}
	
		
	}