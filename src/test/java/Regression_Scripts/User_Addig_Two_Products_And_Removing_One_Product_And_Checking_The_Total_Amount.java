package Regression_Scripts;


import org.testng.Assert;
import org.testng.annotations.Test;







import Generic_Methods.Excel;
import Generic_Methods.Generic_Test;
import Pom_classes.Pom_Class1;

public class User_Addig_Two_Products_And_Removing_One_Product_And_Checking_The_Total_Amount extends Generic_Test{
	
	@Test
	public void scenario3(){
		
		String total = Excel.getData("Sheet1", 2, 0);
		test=reports.createTest("Test started", "Adding product to cart");
		test.info("test has started");
		Pom_Class1 a=new Pom_Class1(driver);
		a.clickOnClose();
		test.pass("Clicked on close");
		a.searchForSanitizer();
		test.pass("Searched for sanitizers");
		a.clickOnLifebuoy(driver);
		test.pass("Clicked on lifebuoy");
		a.clickOnAddToCart();
		test.pass("Successfully added to cart");
		a.searchForSanitizer();
		test.pass("Searched for sanitizers");
		a.clickOnMediker();
		test.pass("Clicked on mediker");
		a.clickOnAddToCart();
		test.pass("Clicked on add to cart");
		a.clickOnRemove();
		test.pass("Clicked on remove");
		a.clickOnPopupRemove();
		test.pass("Clicked on popup remove");
		String total1 = a.getTotaltAmount();
		Assert.assertEquals(total, total1);
	}
}
