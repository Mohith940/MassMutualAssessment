package com.setDefection;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;


import cucumber.api.java.da.Givet;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import com.pageObject.Values;
import com.utills.Driver;


public class GenericStepWithPageObject {
	
	static Logger log = Logger.getLogger(GenericStepWithPageObject.class.getName());
	Values values =null;
	 
	@Givet("^lunch values application$")
	public void lunch_values_application() throws FileNotFoundException, IOException {
	    //Lunching browser and values application 
	     Driver.getDriver();
	}
	
	public void verify_rigth_of_values_are_displyed_on_the_screen(int count) throws Throwable {
		values.verifyNoValues(count);
	
	}

	@Then("^verify the values on the screen gater than zero$")
	public void verify_the_values_on_the_screen_gater_than_zero() throws Throwable {
	 values.verifyValues();   
	}

	@Then("^verify the total balance is correct based on the values listed on the screen$")
	public void verify_the_total_balance_is_correct_based_on_the_values_listed_on_the_screen() throws Throwable {
	    	 values.totalBlance();   
	}

	@Then("^verify the values are formatted as currencies$")
	public void verify_the_values_are_formatted_as_currencies() throws Throwable {
      values.CheckCurrency();
	}

	@Then("^verify the total balance matches the sum of the values$")
	public void verify_the_total_balance_matches_the_sum_of_the_values() throws Throwable {
       values.totalBlance();
	}


	

}
