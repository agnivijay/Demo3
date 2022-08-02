package com.Data_Driven_framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static String value = null;

	public static void particular_Alldata() throws IOException {
		File f=new File("C:\\Users\\DELL\\eclipse-workspace\\Maven_Project\\DEMO EXCEL.xlsx");
		
		//read or get data from excel we use FileInputStrem
		
		FileInputStream d=new FileInputStream(f);
		
		//excelworkbook open pana workbooku object create workbook open agitu
		
		Workbook wb=new XSSFWorkbook(d);
		
		Sheet s = wb.getSheetAt(0);
		System.out.println("No.of.row:"+s.getPhysicalNumberOfRows());
		
		for (int i = 1; i <s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				
				CellType type = c.getCellType();
				
				if (type.equals(CellType.STRING)) {
					
					String value = c.getStringCellValue(); 
					System.out.println("String:"+value);
				} else if (type.equals(CellType.NUMERIC)) {
					
					double numericvalue = c.getNumericCellValue();
					String value = String.valueOf(numericvalue);
					//int numericvalue=(int) value;
					System.out.println("Numeric:"+numericvalue);	
				}
				
			}
		
			System.out.println("No.of.cell present row:"+r.getPhysicalNumberOfCells());
			
			
		}
		
		wb.close();
			
	}
	
	public static String particular_cell() throws IOException {
		
		File f=new File("C:\\Users\\DELL\\eclipse-workspace\\Maven_Project\\DEMO EXCEL.xlsx");
		
		//read or get data from excel we use FileInputStrem
		
		FileInputStream d=new FileInputStream(f);
		
		//excelworkbook open pana workbooku object create workbook open agitu
		
		Workbook wb=new XSSFWorkbook(d);
		
		Sheet s = wb.getSheetAt(0);
		System.out.println("No.of.row:"+s.getPhysicalNumberOfRows());
		
		Row r = s.getRow(1);
		Cell c = r.getCell(1);
				
		CellType type = c.getCellType();
				
		if (type.equals(CellType.STRING)) {
					
			value =	 c.getStringCellValue(); 
			//System.out.println("String:"+value);
		} else if (type.equals(CellType.NUMERIC)) {
					
			double numericvalue = c.getNumericCellValue();
			int b=(int) numericvalue;
			value = String.valueOf(b);
			//
			//System.out.println("Numeric:"+numericvalue);	
				}
		wb.close();
		return value;
}
	
	public static void particular_Row() throws IOException {
		File f=new File("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Maven_Project\\\\DEMO EXCEL.xlsx");
		
		FileInputStream d=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(d);
		
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(2);
		for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {
			
			Cell c = r.getCell(0);
			CellType type = c.getCellType();
			if (type.equals(CellType.STRING)) {
				
				String value = c.getStringCellValue();
				System.out.print(value+" ");
			} else if (type.equals(CellType.NUMERIC)) {
				
				double numericCellValue = c.getNumericCellValue();
				String value = String.valueOf(numericCellValue);
				System.out.print(value);
				
			}
		}
		wb.close();		
	}
	
	public static void particular_Columns() throws IOException {
		File f=new File("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Maven_Project\\\\DEMO EXCEL.xlsx");
		
		FileInputStream d=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(d);
		
		Sheet s = wb.getSheetAt(0);
		
		for (int i = 1; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			Cell c = r.getCell(0);
			CellType type = c.getCellType();
			if (type.equals(CellType.STRING)) {
				
				String value = c.getStringCellValue();
				System.out.println(value+" ");
			} else if (type.equals(CellType.NUMERIC)) {
				
				double numericCellValue = c.getNumericCellValue();
				String value = String.valueOf(numericCellValue);
				System.out.println(value);
				
			}
		}
		wb.close();		
	}
	public static void main(String[] args) throws IOException {
		//particular_Alldata();
		String particular_cell = particular_cell();
		System.out.println(particular_cell);
		//particular_Row();
		//particular_Columns();
	}

}



