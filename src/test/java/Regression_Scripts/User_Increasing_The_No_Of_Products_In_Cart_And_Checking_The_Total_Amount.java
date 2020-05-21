package Regression_Scripts;

import org.testng.annotations.Test;

import Generic_Methods.Excel;
import Generic_Methods.Generic_Test;
import Pom_classes.Pom_Class1;
import Pom_classes.Pom_Class3;

public class User_Increasing_The_No_Of_Products_In_Cart_And_Checking_The_Total_Amount extends Generic_Test {
	
	@Test
	public void scenario5(){
		
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
		Pom_Class3 b=new Pom_Class3(driver);
		b.clickOnPlus();
		test.pass("CLicked on plus");
		b.PriceForOne();
		test.pass("Took prie for one");
		b.priceForTwo();
		test.pass("Took price for two and verified");
		test.info("test ended");
	}
}
