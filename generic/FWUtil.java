package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FWUtil {
	
	public static void setXLData(String path,String sheet,int row,int cell,String cellval)
	{
		try
		{
			Workbook w = WorkbookFactory.create(new FileInputStream(path));
			w.getSheet(sheet).getRow(row).getCell(cell).setCellValue(cellval);
			w.write(new FileOutputStream(path));
		}
		catch(Exception e)
		{
			
		}
	}
	public static void setXLData(String path,String sheet,int row,int cell,int val)
	{
		try
		{
			Workbook w = WorkbookFactory.create(new FileInputStream(path));
			w.getSheet(sheet).getRow(row).getCell(cell).setCellValue(val);
			w.write(new FileOutputStream(path));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
     }
	
	public static String getXLData(String path,String sheet,int row,int cell)
	{
		String v="";
		try
		{
			Workbook w = WorkbookFactory.create(new FileInputStream(path));
			v = w.getSheet(sheet).getRow(row).getCell(cell).toString();
			
		}
			
		catch(Exception e)
		{
		e.printStackTrace();
		
	    }
		return v;
	}
	
	public static void getPhoto(WebDriver driver,String path)
	{
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dsc = new File(path);
			FileUtils.copyFile(src, dsc);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
