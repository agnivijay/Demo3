package com.Data_Driven_framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {

	public static void main(String[] args) throws IOException {
		
		File f=new File("E:\\excel\\vijay.xlsx‪");
		
		FileInputStream d=new FileInputStream(f);		
		Workbook wb=new XSSFWorkbook(d);
				
		wb.createSheet("Data").createRow(0).createCell(0).setCellValue("Name");
		wb.getSheet("Data").getRow(0).createCell(1).setCellValue("ID");
		
		FileOutputStream fos=new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		
		
		
		
		
			
		
		
	}
	
}
