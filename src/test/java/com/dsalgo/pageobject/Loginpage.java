package com.dsalgo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
 WebDriver ldriver;
 
 public Loginpage(WebDriver rdriver)
 {
	 ldriver = rdriver;
	 PageFactory.initElements(rdriver,this);
 }

	@FindBy(id="id_username")WebElement username;
	@FindBy(id="id_password")WebElement password;
	@FindBy(xpath ="//input[@type='submit']")WebElement submit;
	@FindBy(linkText = "Log out")WebElement logout;
	@FindBy(linkText = "Register")WebElement register;
	
	
	public void enterusername(String username1)
	{
		username.sendKeys(username1);
	}
	
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void submit()
	{
		submit.click();	
	}
	 public void clicklogout()
	{
		 logout.click();	
	}
	 
	public void clickreg()
	{
		register.click();
	}
}
