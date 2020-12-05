package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelInbuiltMethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//Very Imp - Inbuilt excel methods like read /write are already created for excel just use these methods
		
		//Excel -- Apache POI Library is java based lib. freely avalible
			//download and import in ur project
			//goto binary distribution and download files from there - ont use source distribution
		
			//Excel file should always be part of our project. so add in eclipse
		
		// Java.io  - whenever u r doint some file related activity like input/
		//XSSSFwork deals with exce file with extension .xlsx
		
		String XLFilLoc = "C:\\Softwares\\Excel Apachi OPI\\IMACS.xlsx";
		File src = new File (XLFilLoc); // File - Import from Java.io
			FileInputStream fis = new FileInputStream(src); //Imp Note u a=have to add one exception java.lang. import the filinputstrem from jav.io
				XSSFWorkbook wb = new XSSFWorkbook(fis); // import XSSFWorkbook from Apachi POI. need to provide above fis input file stream here
					XSSFSheet sheet1 = wb.getSheet("EWR"); // import XSSFSheet from apchi poi. adding the sheet nname from which we want to pull data'
					String Temp = sheet1.getRow(0).getCell(0).getStringCellValue(); // puling data from 0 row and 0 cell from excel
								int lastrow = sheet1.getLastRowNum(); // pulls the count for last row
								
					System.out.println(Temp);
					
					for(int i=0; i<lastrow;i++ ) {
						String Temp1 = sheet1.getRow(i).getCell(0).getStringCellValue(); // Reading Data from ExcelFile
									    
						System.out.println(Temp1);	
					}		
					
			//Write operation in excel
				//note while reading we have used fileinput stream and while wrting we have to use fileoutput stream
					//whenever u want to write some data in excel file use fileoutputstream
					
					FileOutputStream fout = new FileOutputStream(src); // specify the file soruce / import fileoutstream java.out
					sheet1.getRow(0).createCell(2).setCellValue("PASS");
					
					wb.write(fout); // provide the output file name
					wb.close(); // Closing the excel workbook
	} 

}
