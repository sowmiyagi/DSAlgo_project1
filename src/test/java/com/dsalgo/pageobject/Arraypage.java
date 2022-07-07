package com.dsalgo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Arraypage {
	
	WebDriver ldriver;
	 
	 public Arraypage(WebDriver rdriver)
	 {
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver,this);
	 }

	 @FindBy(linkText ="Arrays in Python")WebElement Link1;
	 @FindBy(linkText ="Arrays Using List")WebElement Link2;
	 @FindBy(linkText ="Basic Operations in Lists")WebElement Link3;
	 @FindBy(linkText ="Applications of Array")WebElement Link4;
	 @FindBy(xpath = "//a[@class = 'btn btn-info']")WebElement tryhere;
	 @FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")WebElement textarea1;
	 @FindBy(xpath = "//button[@type='button']")WebElement run;
	 
	 
	 
	 public void clicklink1() {
		 Link1.click();
	 }
	 
	 public void clicklink2() {
		 Link2.click();
	 }
	 
	 public void clicklink3() {
		 Link3.click();
	 }
	 public void clicklink4() {
		 Link4.click();
	 }
	 
	 public void clicktry()
	 {
		 tryhere.click(); 
	 }
	 
    public void entertextarea(String tryedit)
    {
    	textarea1.sendKeys(tryedit);	
    }
	 
    public void clickrun()
    {
    	run.click();
    }
	 
}
