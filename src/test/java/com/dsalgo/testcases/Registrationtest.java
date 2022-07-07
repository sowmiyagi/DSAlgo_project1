package com.dsalgo.testcases;

import com.dsalgo.pageobject.Loginpage;
import com.dsalgo.pageobject.Registrationpage;

public class Registrationtest extends Baseclass {
	
	public void Registration()
	{
		driver.get("https://dsportalapp.herokuapp.com/login");
		Loginpage lp = new Loginpage(driver);
		lp.clickreg();
		logger.info("user is on registration page");
		Registrationpage rp = new Registrationpage(driver);
		rp.enteruname();
		rp.enterpass();
		rp.confirm();
		rp.register();
		logger.info("user is registered");
		
	}

}
