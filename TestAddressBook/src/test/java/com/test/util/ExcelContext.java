package com.test.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelContext {
	
	public static void main(String[] args) {
		
		
		
		
		try {
			FileInputStream file =new FileInputStream("src\\test\\resources\\testData.xlsx");
			
			
			XSSFWorkbook workbook =new XSSFWorkbook(file);
			
			Sheet sheet= workbook.getSheet("testdata");
			
			System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
			
			sheet.getRow(1).getCell(1).setCellValue("changed");
			
			workbook.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
