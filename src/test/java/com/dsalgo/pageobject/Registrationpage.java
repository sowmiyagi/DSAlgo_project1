package com.dsalgo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage {
	
	WebDriver ldriver;
	 
	 public Registrationpage(WebDriver rdriver)
	 {
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver,this);
	 }
		@FindBy(id= "id_username")WebElement uname;
		@FindBy(id= "id_password1")WebElement userpass;
		@FindBy(id= "id_password2")WebElement confirmpass;
		@FindBy(id= "submit")WebElement submit;
		
		
		
		public void enteruname()
		{
			uname.sendKeys("sowmiyauser");	
		}
		public void enterpass()
		{
			userpass.sendKeys("Numpy@123");	
		}

		public void confirm()
		{
			confirmpass.sendKeys("Numpy@123");	
		}
		
		public void register()
		{
			submit.click();
		}
		
}
