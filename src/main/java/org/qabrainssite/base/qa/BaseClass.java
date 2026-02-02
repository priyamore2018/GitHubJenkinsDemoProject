package org.qabrainssite.base.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {

	public static WebDriver driver;


	@Before
	public static void setUp() {
		Properties properties=new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream("/Users/hrushi/Desktop/Priyanka/eclipse_workspace/QABrainsPracticeSiteDemoProject/application.properties");
			properties.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		String browser=properties.getProperty("browser");
		
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		String url=properties.getProperty("url");
		
		if(browser.equals("chrome")) {
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--headless=new");
	       co.addArguments("--disable-gpu");
			//WebDriver driver=new ChromeDriver(co);
			//driver.get("https://www.google.com/");
			driver=new ChromeDriver(co);
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@After
	public static void tearDown() {
		driver.quit();
		
	}
}
