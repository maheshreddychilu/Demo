
package com.built.io.automationframework;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelUtils {

	static Sheet wrksheet;
	static Workbook wrkbook ;
	static Hashtable table= new Hashtable();
	

	public ExcelUtils(String ExcelSheetPath) throws BiffException, IOException
	{
		
		wrkbook = Workbook.getWorkbook(new File(ExcelSheetPath));
		wrksheet = wrkbook.getSheet("Sheet1");
	}

	
	public static int rowCount()
	{
		return wrksheet.getRows();
	}

	public static String readCell(int column,int row)
	{
		return wrksheet.getCell(column,row).getContents();
	
	}

	
	public static void rowdictionary()
	{
		for(int row=0;row <wrksheet.getRows(); row++)
		{
			table.put(readCell(0,row), row);
		}
	}
	
	public static int getCell(String colName)
	{			
	int value1 = ((Integer) table.get(colName)).intValue();
	System.out.println("value is"+value1);
		
	try {
			int value;
			value = ((Integer) table.get(colName)).intValue();
			return value;
		} catch (NullPointerException e) {
			return (0);
		}

	}
	
	

}