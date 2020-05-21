package Pom_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;

public class Pom_Class1 extends Base_Page{
	
	public WebDriver driver;
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	private WebElement close;
	@FindBy(xpath="//input[@class='LM6RPg']")
	private WebElement search;
	@FindBy(xpath="//a[.='Lifebuoy Total  Hand Sanitizer Bottle']")
	private WebElement lifebuoySanitizer;
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement addToCart;
	@FindBy(xpath="//a[.='Lifebuoy Total  Hand Sanitizer Bottle']")
	private WebElement lifebuoy;
	@FindBy(xpath="//div[.='Remove']")
	private WebElement remove;
	@FindBy(xpath="(//div[.='Remove'])[1]")
	private WebElement popRemove;
	@FindBy(xpath="//div[.='Missing Cart items?']")
	private WebElement cartEmpty;
	@FindBy(xpath="//a[.='Mediker Instantly Kills 99.9% Germs Without Water Hand ...']")
	private WebElement mediKer;
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement addToCart1;
	@FindBy(xpath="(//div[.='Remove'])[2]")
	private WebElement removeSecondItem;
	@FindBy(xpath="(//span[.=' ₹290'])[2]")
	private WebElement sum;
	@FindBy(xpath="//a[.='Himalaya PureHands - Orange Hand Sanitizer Bottle']")
	private WebElement himalaya;
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement himalayaAddToCart;
	
	
	
	
	
	public Pom_Class1(WebDriver driver) {
		super(driver);
	}
	
	
	public void clickOnClose(){
		elementToBeCLickable(5, close);
		close.click();
	}
	public void searchForSanitizer() {
		elementToBeCLickable(5, search);
		search.sendKeys("sanitizers");
		search.sendKeys(Keys.ENTER);
	}
	public void clickOnLifebuoy(WebDriver driver){
		elementToBeCLickable(5, lifebuoySanitizer);
		lifebuoySanitizer.click();
		Set<String> all = driver.getWindowHandles();
		List<String> l1=new ArrayList<String>(all);
		driver.switchTo().window(l1.get(1));
	}
	public void clickOnAddToCart(){
		elementToBeCLickable(5, addToCart);
		addToCart.click();
	}
	public void isLifebuoyIsPresentInCart(){
		visibilityOf(5, lifebuoy);
	}
	public void clickOnRemove(){
		elementToBeCLickable(5, remove);
		remove.click();
	}
	public void clickOnPopupRemove(){
		elementToBeCLickable(5, popRemove);
		popRemove.click();
	}
	public void visibilityOfEmptyCart(){
		visibilityOf(5, cartEmpty);
	}
	public void clickOnMediker(){
		elementToBeCLickable(5, mediKer);
		mediKer.click();
	}
	public void clickOnAddTocart1(){
		Set<String> all = driver.getWindowHandles();
		List<String> l1=new ArrayList<String>(all);
		driver.switchTo().window(l1.get(2));
		elementToBeCLickable(5, addToCart1);
		addToCart1.click();
	}
	public void removeMediker(){
		elementToBeCLickable(5, removeSecondItem);
		removeSecondItem.click();
	}
	public String getTotaltAmount(){
		elementToBeCLickable(4, sum);
		String txt = sum.getText();
		return txt;
	}
	public void clickOnHimalaya(){
		elementToBeCLickable(5, himalaya);
		himalaya.click();
		Set<String> all = driver.getWindowHandles();
		List<String> l1=new ArrayList<String>(all);
		driver.switchTo().window(l1.get(2));
	}
	public void clicOnHimalayaAddToCart(){
		elementToBeCLickable(5, himalayaAddToCart);
		himalaya.click();
	}
}
