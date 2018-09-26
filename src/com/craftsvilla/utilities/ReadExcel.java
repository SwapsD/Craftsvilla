package com.craftsvilla.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;

public class ReadExcel 
{

	public static String[][] getData(String filename, String sheetname)
	{
		File file=null;
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			file=new File(filename);
			fin=new FileInputStream(file);
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet(sheetname);
			
			int rowNum=sh.getLastRowNum()+1;
			int colNum=sh.getRow(0).getLastCellNum();
			
			String[][] data=new String[rowNum][colNum];
			
			for(int i=0;i<rowNum;i++)
			{
				row=sh.getRow(i);
				for(int j=0;j<colNum;j++)
				{
					cell=row.getCell(j);
					String value=new DataFormatter().formatCellValue(cell);
					data[i][j]=value;
				}
			}
			return data;
			
	}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
}
} 
