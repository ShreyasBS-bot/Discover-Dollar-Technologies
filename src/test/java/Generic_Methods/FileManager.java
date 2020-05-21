package Generic_Methods;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

public class FileManager 
{	
	Properties pro;
	public FileManager()
	{	
		try
		{
			FileInputStream fis=new FileInputStream("./URL.properties");
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			Reporter.log("Failed to load property file", true);
		}
	}
	public String getTesturl()
	{	
		String url = pro.getProperty("testurl");
		if(url== null)
		Reporter.log("Failed to load test url", true);
		return url;
	}
	public String getPreProductionUrl()
	{
		String url = pro.getProperty("preproductionurl");
		if(url==null)
		Reporter.log("Failed to load preproductionurl", true);
		return url;
	}
	public String getProductionUrl()
	{
		String url = pro.getProperty("productionurl");
		if(url==null)
		Reporter.log("Failed to load production url", true);
		return url;
	}
	public long getImplicitlyTime()
	{
		String implicitlywait = pro.getProperty("iw");
		if(implicitlywait==null)
		Reporter.log("Failed to ge wait time", true);
		long iw = Long.parseLong(implicitlywait);
		return iw;
	}
}
