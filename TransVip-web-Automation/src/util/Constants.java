package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Constants {
	
    // Login page
	public static final String admin_email="//*[@id=\"login\"]/div/div/div[3]/form/div[1]/input";
	public static final String admin_password="//*[@id=\"login\"]/div/div/div[3]/form/div[2]/input";
	public static final String login_button="//*[@id=\"login\"]/div/div/div[3]/form/button";
	public static final String forgot_password="//*[@id=\"login\"]/div/div/div[3]/form/div[3]/a";
	public static final String forgot_password_email="//*[@id=\"login\"]/div/div/div[3]/form/div/input";
	public static final String submit_forgot_password="//*[@id=\"login\"]/div/div/div[3]/form/button";
	public static final String login_failure="//*[@ng-if='vm.authMsg']";
	 
	//Create booking page
	public static final String launch_createBooking="//span[normalize-space(text())='Crear Reserva']";
	public static final String loader_scope="//*[@class='container-fluid ng-scope']";
	public static final String search_customer_createBooking="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[2]/div/input";
	public static final String search_customer_suggestion="//*[@class='dropdown-menu ng-isolate-scope']";
	public static final String customer_not_found_text="//span[normalize-space(text())='No se encontraron Resultados']";
	public static final String personal_radio_button="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[4]/div[1]/label/input";
	public static final String corporate_radio_button="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[4]/div[2]/label/input";
	public static final String agreement_dropdown="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[5]/div[1]/select";
	public static final String type_of_service_dropdown="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[6]/div[1]/select";
	public static final String number_of_passengers_create_booking="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[6]/div[2]/input";
	public static final String type_of_booking_dropdown="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[7]/div[1]/select";
	public static final String launch_exclusive_parent_calender="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[8]/div[1]/p/span/button";
	public static final String next_month_exclusive_parent="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[8]/div[1]/p/div/ul/li/div/table/thead/tr[1]/th[3]/button";
	public static final String first_month_exclusive="(//*[@class='uib-month text-center ng-scope'])";
	public static final String activate_year_toggle_exclusive= "//*[@class='btn btn-default btn-sm uib-title']";
	public static final String next_year_exclusive="//*[@class='btn btn-default btn-sm pull-right uib-right']";
	public static final String calender_first_date_exclusive="(//*[@ng-click=\"select(dt.date)\"]/span[@class='ng-binding'])";
	public static final String next_month_exclusive="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[8]/div[1]/p/div/ul/li/div/table/thead/tr[1]/th[3]/button";
	public static final String hour_entry_exclusive="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[8]/div[2]/div/div[1]/table/tbody/tr[2]/td[1]/input";
	public static final String minute_entry_exclusive="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[8]/div[2]/div/div[1]/table/tbody/tr[2]/td[3]/input";
	public static final String pickup_address="//*[@id=\"pickUpAddress\"]";
	public static final String dropoff_address="//*[@id=\"dropOffAddress\"]";
	public static final String tarif_nature="(//*[@class='etaDiv text-align-left ng-scope'])[2]";
	public static final String pickup_hint_text="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[10]/div/textarea";
	public static final String third_person_dropdown="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[12]/div/select";
	
	//roundtrip
	public static final String round_trip_toggle="//*[@ng-click=\"vm.setBooleans('ROUND_TRIP')\"]";
	public static final String wait_time_toggle="//*[@ng-click=\"vm.setBooleans('WAIT_TIME_INCLUDED')\"]";
	public static final String launch_return_calender="//*[@id=\"aggreementTable\"]/tbody/tr[2]/td/div/div[2]/p/span/button";
	public static final String calender_first_date_return="//*[@ng-click=\"select(dt.date)\"]/span[@class='ng-binding']";
	public static final String activate_year_toggle_return="//*[@id=\"datepicker-1432-7684-title\"]";
	public static final String next_year_return="//*[@id=\"aggreementTable\"]/tbody/tr[2]/td/div/div[2]/p/div/ul/li/div/table/thead/tr/th[3]/button";
	public static final String first_month_return="(//*[@class='uib-month text-center ng-scope'])";
	public static final String next_month_return="//*[@id=\"aggreementTable\"]/tbody/tr[2]/td/div/div[2]/p/div/ul/li/div/table/thead/tr[1]/th[3]/button";
	public static final String hour_entry_return="//*[@id=\"aggreementTable\"]/tbody/tr[2]/td/div/div[3]/div/div[1]/table/tbody/tr[2]/td[1]/input";
	public static final String minute_entry_return="//*[@id=\"aggreementTable\"]/tbody/tr[2]/td/div/div[3]/div/div[1]/table/tbody/tr[2]/td[3]/input";
	
	//item of charge
	public static final String item_of_charge_dropdown="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[24]/div/div/div[1]/input";
	
	//payment method
	public static final String payment_drop_launcher="//*[@class='caret pull-right']";
	public static final String payment_method_dropdown="(//*[@placeholder='Métodos de pago'])[2]";
	
	//promo code
	public static final String promo_code_entry="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[26]/div[2]/input";
	public static final String apply_promo_code="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[26]/div[3]/input";
	public static final String booking_obervations="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[27]/div/textarea";
	//final submit
	public static final String sumbit_button_createBooking="//*[@id=\"page-content-wrapper\"]/div/div/div/div[1]/div/form/div/div[1]/div[2]/div/button";
	
	
	
	
	 
		 
	 }
	 

