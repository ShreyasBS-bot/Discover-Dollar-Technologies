package Regression_Scripts;

import org.testng.annotations.Test;

import Generic_Methods.Generic_Test;
import Pom_classes.Pom_Class1;

public class User_Adding_Multiple_Products_To_Cart_And_Checking_In_The_Cart extends Generic_Test{
	
	@Test
	public void scenario6(){
		
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
		test.pass("Successfully searched for sanitizers");
		a.clickOnHimalaya();
		test.pass("Sucessfully clicked on Himalaya");
		a.clicOnHimalayaAddToCart();
		test.pass("Successfully clicked on add to cart");
		test.info("Test has ended");
	}
}
