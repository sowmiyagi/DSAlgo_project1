package com.dsalgo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver ldriver;
	 
	 public Homepage(WebDriver rdriver)
	 {
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver,this);
	 }
	 
	@FindBy(linkText = "Sign in")WebElement signin;
	@FindBy(xpath= "//div[2]//*[text()='Get Started']")WebElement Arrayget;
	@FindBy(xpath= "//div[6]//*[text()='Get Started']")WebElement Treeget;
	
	 public void clicksignin()
		{
			signin.click();	
		}
	 
	 public void clickarray()
		{
		 Arrayget.click();	
		}
	 
	 public void clickTree()
		{
		 Treeget.click();	
		}
	 
	
	 
}
