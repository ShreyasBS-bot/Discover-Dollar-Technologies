package Regression_Scripts;

import org.testng.annotations.Test;

import Generic_Methods.Excel;
import Generic_Methods.Generic_Test;
import Pom_classes.Pom_Class1;
import Pom_classes.Pom_Class2;

public class Sorting_Products_Based_On_Ascending_Order_Of_Their_Price extends Generic_Test {
	
	@Test
	public void scenario4(){
		
		String total = Excel.getData("Sheet1", 2, 0);
		test=reports.createTest("Test started", "Adding product to cart");
		test.info("test has started");
		Pom_Class1 a=new Pom_Class1(driver);
		a.clickOnClose();
		test.pass("Clicked on close");
		a.searchForSanitizer();
		test.pass("Searched for sanitizers");
		Pom_Class2 b=new Pom_Class2(driver);
		b.clickOnSort();
		b.ElementSortedOrNot();
	}
}
