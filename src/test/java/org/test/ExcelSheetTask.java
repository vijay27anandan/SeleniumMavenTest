package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetTask {
public static void main(String[] args) throws IOException {
	//Excel Sheet Local
	File file = new File("D:\\New folder\\Test.xlsx");
	
	//conv to object
	FileInputStream stream = new FileInputStream(file);
	
	//workbook
	Workbook workbook = new XSSFWorkbook(stream);
	
	//sheet
	Sheet sheet = workbook.getSheet("Sheet1");
	
	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	System.out.println("Physical Number of rows are: "+physicalNumberOfRows);
	
	
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		
		Row row = sheet.getRow(i);
		
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			System.out.println(cell);
		}
		
	}
	
	
	
	
}
}
