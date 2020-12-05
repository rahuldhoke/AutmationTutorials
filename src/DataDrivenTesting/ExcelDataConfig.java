package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	//Instead of saving excel in local drive add it in nexcel and then do ur programming
	XSSFWorkbook wb; // Very Imp - line 20 we created obj for xl workbook with some var name. now we r using it globally by using constructor
	XSSFSheet sheet1; // created constructor for sheet and above constructor for workbook
	
		public ExcelDataConfig(String excelpath) {			// constructor with one parameter
				
				try {
					File src = new File (excelpath); // File - Import from Java.io
						
					FileInputStream fis = new FileInputStream(src); //Imp Note u a=have to add one exception java.lang. import the filinputstrem from jav.io
							
					XSSFWorkbook wb = new XSSFWorkbook(fis); // import XSSFWorkbook from Apachi POI. need to provide above fis input file stream here
								
					//XSSFSheet sheet1 = wb.getSheet("EWR"); // import XSSFSheet from apchi poi. adding the sheet nname from which we want to pull data'
				} catch (Exception e) {
					
					System.out.println(e.getMessage());
				}
				}
/////////////////////////////////////////////////////////////////////
	




public String getData(String sheetname, int row, int column) {
	
	XSSFSheet sheet1 = wb.getSheet("EWR"); // import XSSFSheet from apchi poi. adding the sheet nname from which we want to pull data'
	String data = sheet1.getRow(0).getCell(0).getStringCellValue();
	return data;
}	

}
