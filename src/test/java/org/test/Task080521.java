package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task080521 {
public static void main(String[] args) throws IOException {
	File file = new File("D:\\New folder\\Test.xlsx");
	
	FileInputStream stream = new FileInputStream(file);
	
	Workbook workbook = new XSSFWorkbook(stream);
	
	Sheet sheet = workbook.getSheet("Sheet1");
	
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			int type = cell.getCellType();
			
			//cell type 1 - text / 0 - number
			if (type == 1) {
				String name = cell.getStringCellValue();
				System.out.println(name);
			}
			
			if (type == 0) {
				//date
				if (DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
					String Name = dateFormat.format(date);
					System.out.println(Name);
				}else {
					double d = cell.getNumericCellValue();
					//convert to long
					long l = (long) d;
					String name = String.valueOf(l);
					System.out.println(name);
					
				}
			}
		}
	}
	
	
}
}
