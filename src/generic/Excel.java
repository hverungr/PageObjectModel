package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	public static String abc(String file, String sheet, int row, int cell)
	{
		String s="";
		
		try
		{
			FileInputStream f = new FileInputStream(file);
			//System.out.println(f);
			Workbook wb = WorkbookFactory.create(f);
			//System.out.println(wb);
			s=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
			//System.out.println(s);
		}
		catch(Exception e)
		{
			
		}
		return s;
	}
	

}