package Generic_Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class Base_Page 
	{	
		public WebDriver driver;
		public Base_Page(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public void elementToBeCLickable(int time, WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver, time);
			try
			{
				wait.until(ExpectedConditions.elementToBeClickable(element));
			}
			catch(Exception e)
			{
				Reporter.log("Failed until element to be clickable", true);
				Assert.fail();
			}
		}
		public void elementsToBeCLickable(int time, List<WebElement> elements)
		{
			WebDriverWait wait=new WebDriverWait(driver, time);
			try
			{
				wait.until(ExpectedConditions.visibilityOfAllElements(elements));
			}
			catch(Exception e)
			{
				Reporter.log("Failed until element to be clickable", true);
				Assert.fail();
			}
		}
		public void presenceOfElementLocatedByLoator(int time, String value)
		{
			WebDriverWait wait=new WebDriverWait(driver, time);
			try
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(value)));
			}
			catch(Exception e)
			{
				Reporter.log("Failed to check presence", true);
				Assert.fail();
			}
		}
		public void visibilityOf(int time, WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver, time);
			try
			{
				wait.until(ExpectedConditions.visibilityOf(element));
			}
			catch(Exception e)
			{
				Reporter.log("Failed to wait until visibility", true);
				Assert.fail();
			}
		}
		public void titleContains(int time, String title)
		{
			WebDriverWait wait=new WebDriverWait(driver, time);
			try
			{
				wait.until(ExpectedConditions.titleContains(title));
			}
			catch(Exception e)
			{
				Reporter.log("Failed waitt until title contains", true);
				Assert.fail();
			}
		}
		public void titleToBE(int time, String title)
		{
			WebDriverWait wait=new WebDriverWait(driver, time);
			try
			{
				wait.until(ExpectedConditions.titleIs(title));
			}
			catch(Exception e)
			{
				Reporter.log("Failed to wait until title is", true);
				Assert.fail();
			}
		}
		public void urlContains(int time, String url)
		{
			WebDriverWait wait=new WebDriverWait(driver, time);
			try
			{
				wait.until(ExpectedConditions.urlContains(url));
			}
			catch(Exception e)
			{
				Reporter.log("Failed to wait until url contains", true);
				Assert.fail();
			}
		}
		public void urlToBe(int time, String url)
		{
			WebDriverWait wait=new WebDriverWait(driver, time);
			try
			{
				wait.until(ExpectedConditions.urlToBe(url));
			}
			catch(Exception e)
			{
				Reporter.log("Failed to wait until url to be", true);
				Assert.fail();
			}
		}
		public void noOfWindowToBe(int time, int no)
		{
			WebDriverWait wait=new WebDriverWait(driver, time);
			try
			{
				wait.until(ExpectedConditions.numberOfWindowsToBe(no));
			}
			catch(Exception e)
			{
				Reporter.log("Failed to wait until window loads", true);
				Assert.fail();
			}
		}
		public void alertIsPresent(int time)
		{
			WebDriverWait wait=new WebDriverWait(driver, time);
			try
			{
				wait.until(ExpectedConditions.alertIsPresent());
			}
			catch(Exception e)
			{
				Reporter.log("Failed to wait until alertt is present", true);
				Assert.fail();
			}
		}
		public void frameToBeAvailableAndSwitchToIt(int time, int no)
		{
			WebDriverWait wait=new WebDriverWait(driver, time);
			try
			{
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(no));
			}
			catch(Exception e)
 			{
				Reporter.log("Failed to wait until window loads", true);
				Assert.fail();
			}
		}
}
