package com.genericsFaceBook;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.generics.ActiTime.AutoConstant;

public class ExcelLibrary implements AutoConstant
{
	public  static String getStringCellTypeData(String sheet,int row,int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		Workbook wb=new XSSFWorkbook(fis);
		
		String cellValue = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;
	}
	
	public static double getNumericValue(String sheet,int row,int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		Workbook wb= new XSSFWorkbook(fis);
		
		double cellValue = wb.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		return cellValue;
	}

}