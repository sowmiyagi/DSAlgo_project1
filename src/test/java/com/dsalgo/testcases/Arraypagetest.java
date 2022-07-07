package com.dsalgo.testcases;

import org.openqa.selenium.JavascriptExecutor;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dsalgo.pageobject.Arraypage;
import com.dsalgo.pageobject.Getstartedpage;
import com.dsalgo.pageobject.Homepage;
import com.dsalgo.pageobject.Loginpage;

public class Arraypagetest extends Baseclass{

	
	
	@Test
	public void  Arraypagetest1() throws InterruptedException
	{	
	Getstartedpage gp = new Getstartedpage(driver);
	gp.getstart();
	Homepage hp = new Homepage(driver);
	hp.clicksignin();
	Loginpage lp = new Loginpage(driver);
	lp.enterusername(username);
	lp.enterpassword(password);
	lp.submit();
	hp.clickarray();
	logger.info("user is on Array page");
	Arraypage ap = new Arraypage(driver);
	ap.clicklink1();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,450)", "");
	ap.clicktry();
	String text = "print('hello..testing array pages')";
	ap.entertextarea(text);
	ap.clickrun();
	driver.navigate().back();
	ap.clicklink2();	
	ap.clicktry();
	ap.entertextarea(text);
	ap.clickrun();
	driver.navigate().back();
	ap.clicklink3();
	ap.clicktry();
	ap.entertextarea(text);
	ap.clickrun();
	driver.navigate().back();
	ap.clicklink4();
	ap.clicktry();
	ap.entertextarea(text);
	ap.clickrun();
	logger.info("All array links are clicked");
	
	}

}
