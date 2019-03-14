package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;


public abstract class BaseTest implements IAutoConstant{
	public WebDriver driver;
	public static int fail=0,pass=0;
	
	static
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	
	@BeforeMethod
	public void openApplication()
	{
		/*driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);*/
		
	    driver = new ChromeDriver();
	    driver.get(url);
	}
	
	@AfterMethod
	public void closeApplication(ITestResult iTestResult)
	{
		if(iTestResult.getStatus()==2)
		{
			String name = iTestResult.getName();
			FWUtil.getPhoto(driver, PHOTO_PATH + name + ".png");
			Reporter.log("fail",true);
			fail++;
			
			
		}
		else
			
		{
			pass++;
		Reporter.log("pass",true);
		}
		
		driver.close();
		
	}
	
	@AfterSuite
	public void writeReport()
	{
		FWUtil.setXLData(REPORT_PATH, "Sheet1", 1, 0, pass);
		FWUtil.setXLData(REPORT_PATH, "Sheet1", 1, 1, fail);
		
}
	

}
