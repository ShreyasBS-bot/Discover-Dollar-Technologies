package Pom_classes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Generic_Methods.Base_Page;

public class Pom_Class3 extends Base_Page{
		
	public int b;
	
	@FindBy(xpath="(//button[@class='wNrY5O'])[2]")
	private WebElement plus;
	@FindBy(xpath="(//span[.=' ₹290'])[2]")
	private WebElement priceForOne;
	@FindBy(xpath="(//span[.=' ₹500'])[2]")
	private WebElement priceForTwo;
	
	
	
	
	public Pom_Class3(WebDriver driver){
		super(driver);
	}
	
	
	
	public void clickOnPlus(){
		elementToBeCLickable(5, plus);
		plus.click();
	}
	public void PriceForOne(){
		visibilityOf(5, priceForOne);
		String txt = priceForOne.getText();
		String txt1 = txt.substring(1);
		int a = Integer.parseInt(txt1);
		int b = (a*2);
	}
	public void priceForTwo(){
		visibilityOf(5, priceForTwo);
		String txt = priceForTwo.getText();
		String txt1 = txt.substring(1);
		int z = Integer.parseInt(txt1);
		Assert.assertEquals(z, b);
	}
}
