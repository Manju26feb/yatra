package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class YatraSearchPage {
	
	@FindBy(xpath="//input[@id='BE_flight_origin_city']")
	private WebElement listSTBX;
	
	/*@FindBy(xpath="//input[@title='Search']")
	private WebElement listSTBX;
	
	@FindBy(xpath="//span[contains(text(),'java')]")
	private List<WebElement> allASE;*/
	
	
	public YatraSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setFromCity(String fc,WebDriver driver) throws InterruptedException
	{   Thread.sleep(20000);
		listSTBX.sendKeys(fc);
		Thread.sleep(20000);
		
		 //String xp = "//strong[contains(text(),'Ban')]";
		 /*Thread.sleep(20000);
		 //List<WebElement> allASE = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		 // count them
		
		 int count = allASE.size();
		 
		 System.out.println(count);
		 
		 for(int i = 0;i<count-1;i++)
		 {
			 WebElement ase = allASE.get(i);
			 String text = ase.getText();
			 System.out.println(text);
		 }
		 // Select first auto suggestion
		 allASE.get(0).click();*/
	
	
	
	}
	

}
