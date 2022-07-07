package com.dsalgo.testcases;

import org.testng.annotations.Test;

import com.dsalgo.pageobject.Getstartedpage;
import com.dsalgo.pageobject.Homepage;
import com.dsalgo.pageobject.Loginpage;
import com.dsalgo.pageobject.Treepage;

public class Treepagetest extends Baseclass
{
	@Test
	public void treetest()
	{
		
		
		Getstartedpage gp = new Getstartedpage(driver);
		gp.getstart();
		Homepage hp = new Homepage(driver);
		hp.clicksignin();
		Loginpage lp = new Loginpage(driver);
		lp.enterusername(username);
		lp.enterpassword(password);
		lp.submit();
		hp.clickTree();
		logger.info("Tree page is clicked");
		Treepage tp = new Treepage(driver);
		tp.clicklink1();
		tp.clicktry();
		String text = "print('hello..testing tree pages')";
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
		tp.clicklink2();		
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
		tp.clicklink3();	
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
		tp.clicklink4();		
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
		tp.clicklink5();
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
		tp.clicklink6();
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
		tp.clicklink7();
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
		tp.clicklink8();
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
		tp.clicklink9();
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
		tp.clicklink10();
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
		tp.clicklink11();
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
		tp.clicklink12();
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
		tp.clicklink13();
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		logger.info("All Treepages links are clicked");
	}
	
	

	
}
