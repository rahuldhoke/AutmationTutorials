package DataDrivenTesting;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Getting the workbook
			//XSSFWorkbook wb = new XSSFWorkbook(fis)
		
		//Getting the sheet name 
			//XSSFSheet sheet1 = wb.getSheet("EWR");
		
		//Reading Data from excel
			//String Temp1 = sheet1.getRow(i).getCell(0).getStringCellValue(); // Reading Data from ExcelFile

	
		//Write operation in excel
		//note while reading we have used fileinput stream and while wrting we have to use fileoutput stream
			//whenever u want to write some data in excel file use fileoutputstream
			//sheet1.getRow(0).createCell(2).setCellValue("PASS"); // Writing operation in excel
		
		// Getting the last row count
			//int lastrow = sheet1.getLastRowNum(); // pulls the count for last row
		
		//Getting the last column count
		// returns number of columns in a sheet
			/*
			public int getColumnCount(String sheetName) {
				// check if sheet exists
				if (!isSheetExist(sheetName))
					return -1;
	
				sheet = workbook.getSheet(sheetName);
				row = sheet.getRow(0);
	
				if (row == null)
					return -1;
	
				return row.getLastCellNum();
			
		*/
	}

}
