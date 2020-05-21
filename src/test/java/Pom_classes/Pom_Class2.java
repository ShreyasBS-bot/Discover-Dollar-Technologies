package Pom_classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import org.testng.Assert;

import Generic_Methods.Base_Page;

public class Pom_Class2 extends Base_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//div[.='Price -- Low to High']")
	private WebElement sort;
	@FindBy(xpath="//div[@class='_1vC4OE']")
	private List<WebElement> allPrice;
	
	
	
	
	public Pom_Class2(WebDriver driver){
		super(driver);
	}
	
	
	public void clickOnSort(){
		elementToBeCLickable(5, sort);
		sort.click();
	}
	public void ElementSortedOrNot(){
		elementsToBeCLickable(5, allPrice);
		List<String> l1=new ArrayList<String>();
		for (WebElement ele : allPrice) {
			String txt = ele.getText();
			l1.add(txt);
		}
		System.out.println(l1);
		List<String> l2=new ArrayList<String>();
		l2.addAll(l1);
		Collections.sort(l2);
		System.out.println(l2);
		Assert.assertTrue(l1.equals(l2));
	}
}
