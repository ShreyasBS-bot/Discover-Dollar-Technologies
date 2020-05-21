package Generic_Methods;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Reporter;

public class BrowserFactory implements Auto_Const
{
	private Map<String, WebDriver>drivers=new HashMap<String, WebDriver>();
	public WebDriver getBrowser(String browsername)
	{	
		WebDriver driver=null;
		switch (browsername) 
		{
		case "chrome":
			driver=drivers.get("chrome");
			if(driver==null)
			System.setProperty(chrome_key, chrome_value);
			driver=new ChromeDriver();
			drivers.put("chrome", driver);
			break;
		
		case "firefox":
			driver=drivers.get("firefox");
			if(driver==null)
			System.setProperty(firefox_key, firefox_value);
			driver=new FirefoxDriver();
			drivers.put("firefox",driver);
			break;
			
		case "edge":
			driver=drivers.get("edge");
			if(driver==null)
			System.setProperty(edge_key,edge_value);
			driver=new EdgeDriver();
			drivers.put("edge", driver);
			break;
			
		case "opera":
			driver=drivers.get("opera");
			if(driver==null)
			System.setProperty(opera_key, opera_value);
			driver=new OperaDriver();
			drivers.put("opera", driver);
			break;
			
		default :
			Reporter.log("Invalid entry", true);
			break;
		}
		return driver;
	}
	public void closeBrowser()
	{
		for (String a : drivers.keySet()) 
		{
			drivers.get(a).quit();
		}
	}
}
