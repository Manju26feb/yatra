package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import page.YatraSearchPage;

public class YatraSearch extends BaseTest{
	@Test(priority=1)
	public void Search() throws InterruptedException
	{
		Reporter.log("Hi",true);
		YatraSearchPage y = new YatraSearchPage(driver);
		y.setFromCity("ban",driver);
		
		
		
	}

}
