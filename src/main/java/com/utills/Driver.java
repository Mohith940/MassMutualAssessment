package com.utills;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Driver {

	static WebDriver driver = null;
	static Properties properties = new Properties();
	static Driver instance = new Driver();
	public static Driver getInstance() {
		return instance;
	}

	private final  String propertyFilePath= "config\\Configruation.properties";

	public Driver() {
		try {
			properties.load(new FileInputStream(propertyFilePath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}



	}

	public static WebDriver getDriver() throws FileNotFoundException, IOException {
		Driver d= new Driver();
		String driverPath = properties.getProperty("driverPath");
		String URL = properties.getProperty("URL");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;

	}
	
	public static WebDriver closeDriver() {
		driver.close();
		return driver;
	}
}
