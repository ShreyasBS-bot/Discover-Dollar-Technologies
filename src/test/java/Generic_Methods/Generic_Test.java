package Generic_Methods;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Generic_Test implements Auto_Const
{	
	public WebDriver driver;
	BrowserFactory bf=new BrowserFactory();
    public static ExtentHtmlReporter htmlreporter;
    public static ExtentReports reports;
    public static ExtentTest test;
    public Logger log=Logger.getLogger(Generic_Test.class); 
    
    @BeforeSuite
    public void setup()
    {
    	htmlreporter=new ExtentHtmlReporter("./Extent reports/report.html");
    	reports=new ExtentReports();
    	reports.attachReporter(htmlreporter);
    }
	
	@Parameters({"browser"})
	@BeforeMethod
	public void openapp(@Optional("chrome") String browser)
	{	
		log.info("Browser is launched");
		if(browser.equals("chrome"))
		{
		driver=bf.getBrowser("chrome");
		driver.get(new FileManager().getTesturl());
		driver.manage().window().maximize();
		}
		else if(browser.equals("firefox"))
		{
			driver=bf.getBrowser("firefox");
			driver.get(new FileManager().getTesturl());
			driver.manage().window().maximize();
		}
		else 
		{
			driver=bf.getBrowser("opera");
			driver.get(new FileManager().getTesturl());
			driver.manage().window().maximize();
		}
		
		driver.manage().timeouts().implicitlyWait(new FileManager().getImplicitlyTime(), TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeAppn(ITestResult res) throws IOException
	{	
		if(ITestResult.FAILURE==res.getStatus())
		{
			String test_name = res.getName();
			//Screenshot.capture(driver, test_name);
			test.fail("Test case failed",
					MediaEntityBuilder.createScreenCaptureFromPath(new Screenshot().capture(driver, test_name)).build());
		}
		test.assignAuthor("Shreyas.B.S");
		test.assignDevice("Laptop");
		test.assignCategory("GUI automation");
		reports.setSystemInfo("Windows", "10");
	    bf.closeBrowser();
	    log.info("Browser is closed"); 
	}
	@AfterSuite
	public void teardown()
	{
		reports.flush();
	}
}
