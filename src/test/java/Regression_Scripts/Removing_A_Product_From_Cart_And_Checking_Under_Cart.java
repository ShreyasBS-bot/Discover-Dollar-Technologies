package Regression_Scripts;

import org.testng.annotations.Test;

import Generic_Methods.Generic_Test;
import Pom_classes.Pom_Class1;

public class Removing_A_Product_From_Cart_And_Checking_Under_Cart extends Generic_Test {
	
	@Test
	public void scenario2() {
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
	a.clickOnRemove();
	test.pass("Clicked on remove");
	a.clickOnPopupRemove();
	test.pass("Clicked on remove");
	a.visibilityOfEmptyCart();
	test.pass("Empty cart");
	test.info("test has ended");
	}
}
