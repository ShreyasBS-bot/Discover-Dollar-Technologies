package Generic_Methods;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Dataprovider 
{
	public  static Object[][] getData(String sheet)
	{	
		Object[][] data=null;
		try
		{
			FileInputStream fis=new FileInputStream("./Excel/data.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheet);
			int rc = sh.getLastRowNum();
			Row row = sh.getRow(0);
			short cc = row.getLastCellNum();
			data = new Object[rc+1][cc];
			for(int i=0;i<rc+1;i++)
			{
				Row row1 = sh.getRow(i);
				for(int j=0;j<cc;j++)
				{
					Cell c = row1.getCell(j);
					String val = c.getStringCellValue();
					data[i][j]=val;
				}
			}
		}
		catch(Exception e)
		{
			Reporter.log("Failed to read", true);
		}
			return data;
	}	
	
}
