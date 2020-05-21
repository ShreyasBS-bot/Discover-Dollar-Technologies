package Generic_Methods;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel 
{
	public static String getData(String sheet,int row,int cell)
	{	
		String val = null;
		try
		{
			FileInputStream fis=new FileInputStream("./Excel/data.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheet);
			Cell c = sh.getRow(row).getCell(cell);
			val=c.getStringCellValue();
		}
		catch(Exception e)
		{
			Reporter.log("Failed to read data", true);
		}
		return val;
	}
	public static void writeData(String sheet,int row,int cell, String val)
	{	
		try
		{
		FileInputStream fis=new FileInputStream("./Excel/data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Cell c = sh.getRow(row).createCell(cell);
		c.setCellValue(val);
		FileOutputStream fout=new FileOutputStream("./Excel/data.xlsx");
		wb.write(fout);
		}
		catch(Exception e)
		{
			Reporter.log("FAiled to write data", true);
		}
	}
}
