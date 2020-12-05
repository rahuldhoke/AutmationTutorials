package DataDrivenTesting;

public class ConstructorReuseExcelData {

	public static void main(String[] args) {

		//Based on your modules are componenets we have to maintain data sheets
		ExcelDataConfig excel = new ExcelDataConfig("C:\\Softwares\\Excel Apachi OPI\\IMACS.xlsx");
		System.out.println(excel.getData("EWR",0,0));
		

	}

}
