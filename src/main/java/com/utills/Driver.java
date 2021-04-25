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

	private final  String propertyFilePath= "config//Configuation.properties";

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

		String driverPath = properties.getProperty("driverPath");
		String URL = properties.getProperty("URL");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.exercise1.com/values");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;

	}
}
