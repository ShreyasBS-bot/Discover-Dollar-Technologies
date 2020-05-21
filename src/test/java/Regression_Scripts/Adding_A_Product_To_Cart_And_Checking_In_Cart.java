package Regression_Scripts;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Methods.Excel;
import Generic_Methods.Generic_Test;
import Pom_classes.Pom_Class1;


public class Adding_A_Product_To_Cart_And_Checking_In_Cart extends Generic_Test {

	@Test
	public void scenario1() {
		
		String expectedTitle = Excel.getData("Sheet1", 1, 0);
		
		test=reports.createTest("Test started", "Adding product to cart");
		test.info("test has started");
		Assert.assertEquals(expectedTitle, driver.getTitle());
		test.pass("Flipkart home page title verified");
		Pom_Class1 a=new Pom_Class1(driver);
		a.clickOnClose();
		test.pass("Clicked on close");
		a.searchForSanitizer();
		test.pass("Searched for sanitizers");
		a.clickOnLifebuoy(driver);
		test.pass("Clicked on lifebuoy");
		a.clickOnAddToCart();
		test.pass("Successfully added to cart");
		a.isLifebuoyIsPresentInCart();
		test.pass("Item is present a the cart");
		a.clickOnRemove();
		test.pass("Successfully removed");
		test.info("Test ended");
		
	}
}
