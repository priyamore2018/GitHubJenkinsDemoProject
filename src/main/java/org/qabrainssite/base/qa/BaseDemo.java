package org.qabrainssite.base.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDemo {
	public static WebDriver driver;
	public static Properties properties;
	
	public BaseDemo() {
		
		try {
			properties=new Properties();
			FileInputStream file=new FileInputStream("/Users/hrushi/Desktop/Priyanka/eclipse_workspace/QABrainsPracticeSiteDemoProject/application.properties");
		properties.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
public static void setUp() {
		

		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
	
	}
}
