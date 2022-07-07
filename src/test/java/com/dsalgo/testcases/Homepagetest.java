package com.dsalgo.testcases;

import com.dsalgo.pageobject.Getstartedpage;


public class Homepagetest extends Baseclass{
	
	public void hometest()
	{
	driver.get(baseurl);
	Getstartedpage gp = new Getstartedpage(driver);
	//Homepage hp= new Homepage(driver);
	gp.getstart();
	logger.info("user is on home page");
	if (driver.getTitle()=="NumpyNinja")
	{
		System.out.println("user is on home page");
	}
	else
	{
		System.out.println("Title is not matched");
	}
	}
	
}
