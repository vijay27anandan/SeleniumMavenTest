package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Test.xlsx");
	
	FileInputStream stream = new FileInputStream(file);
	
	Workbook workbook = new XSSFWorkbook(stream);
	
	Sheet sheet = workbook.getSheet("Sheet1");
	//row
	Row row = sheet.getRow(1);
	
	//cell
	Cell cell = row.getCell(3);
	System.out.println(cell);

	int countofRows = sheet.getPhysicalNumberOfRows();
	System.out.println(countofRows);
	
	int countOfCells = row.getPhysicalNumberOfCells();
	System.out.println(countOfCells);
	
	//print particular row
	for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
		Cell cell2 = row.getCell(i);
		System.out.println(cell2);
	}
	Sheet createSheet = workbook.createSheet("Data");
	Row createRow = createSheet.createRow(0);
	Cell createCell = createRow.createCell(0);
	createCell.setCellValue("vijay");


	
	
}
}
