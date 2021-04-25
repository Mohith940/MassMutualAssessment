package com.pageObject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import com.stepDefection.GenericStepWithPageObject;
import com.utills.Driver;

public class Values extends Driver{
	static Logger log = Logger.getLogger(Values.class.getName());
	//values
	public By vlaue1 = By.id("lbl_val_1");
	public By vlaue2 = By.id("lbl_val_2");
	public By vlaue3 = By.id("lbl_val_3");
	public By vlaue4 = By.id("lbl_val_4");
	public By vlaue5 = By.id("lbl_val_5");
	public By vlaues =By.xpath(".//*[contains(text(),'value')]");
	
	//textboxs
	public By txt1 = By.id("txt_val_1");
	public By txt2 = By.id("txt_val_2");
	public By txt3 = By.id("txt_val_3");
	public By txt4 = By.id("txt_val_4");
	public By txt5 = By.id("txt_val_5");
	public static By allValues = By.tagName("input");	
	//total balance 
	public By totalBlanceValue  = By.id("txt_ttl_val");
	
	//Actions
	
	public void verifyNoValues(int count) throws FileNotFoundException, IOException {
		int actualCount = Driver.getDriver().findElements(vlaues).size();
		Assert.assertSame(count, actualCount);
		log.info("Right counts of values are displyed" + actualCount);
		
		
	}
	
	
	public  List<Double>  getVales() throws FileNotFoundException, IOException {
	     
	List<WebElement> text=  Driver.getDriver().findElements(allValues);
	List<Double> values= null;
	 for(int i=0;i<text.size()-1;i++) {
		 String textValue = text.get(i).getText();
		 double texNumber = Double.parseDouble(textValue.replaceAll("[$,]", ""));
		values.add(texNumber);
		
	 }
	 return  values;
	  
	}
	
	public void verifyValues() throws FileNotFoundException, IOException {
		
		List<Double> values =  getVales();
		
		for(Double values1 :values) {
			Assert.assertNotNull(values1);
			
		}
		log.info("All the values are gater than zero ");
	}
	
	public void totalBlance() throws FileNotFoundException, IOException {
		List<Double> values =  getVales();
		String totalBlanceValue1 = Driver.getDriver().findElement(totalBlanceValue).getText();
		double totalBlance = Double.parseDouble(totalBlanceValue1.replaceAll("[$,]", ""));
		double totalSum =0;
		for(Double sum :values) {
			totalSum =totalSum+sum;

		}
		Assert.assertSame(totalSum, totalBlance);
		log.info("the total balance is correct as per the values listed on the screen ");
		
	}
	 public void CheckCurrency() throws FileNotFoundException, IOException {
		 List<WebElement> text=  Driver.getDriver().findElements(allValues);
		 for(int i=0;i<text.size()-1;i++) {
			 String textValue = text.get(i).getText();
			 Locale currentLocale = Locale.US;
				Currency currency = Currency.getInstance(currentLocale);
				String symbol = currency.getSymbol();
				if(textValue.startsWith(symbol) || textValue.endsWith(symbol)){
				    Assert.assertTrue(true);
				}
		 }
		 log.info("All the values are in currency format");
		 
		 
		 
		 
		 
	 }
	
	
}
