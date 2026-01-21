package org.qabrainssite.pages.qa;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qabrainssite.base.qa.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	//WebDriver driver;
	
	@Given("Launch the Login Page")
	public void launch_the_login_page() {
		BaseClass.setUp();
		//BaseClass.setUp();
	/*	driver=new ChromeDriver();
		driver.get("https://practice.qabrains.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); */
	}

	@When("Enter valid username and password and click on Login button")
	public void enter_valid_username_and_password_and_click_on_login_button() {
		BaseClass.driver.findElement(By.id("email")).sendKeys("qa_testers@qabrains.com");
		BaseClass.driver.findElement(By.id("password")).sendKeys("Password123");
		BaseClass.driver.findElement(By.xpath("//button[text()='Login']")).click(); 


	}

	@Then("Navigate to Login Successful page.")
	public void navigate_to_login_successful_page() throws InterruptedException {
		
		System.out.println("Iam enter inside navigate_to_Login_Successful_page  method");
		Thread.sleep(4000);
		 WebElement successText=BaseClass.driver.findElement(By.xpath("//h2[text()='Login Successful']"));
		
		 String actualText=successText.getText();
		 System.out.println(actualText);
		 
		 assertEquals(actualText, "LOGIN SUCCESSFUL"," Login Unsucessful................." );
		  
		 BaseClass.tearDown();
		 

	}
	

}
