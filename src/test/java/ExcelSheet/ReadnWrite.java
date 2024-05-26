package ExcelSheet;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import TestCase.LoginPage;

public class ReadnWrite extends LoginPage{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		String emailid = "";
        String password = "";
		String path = "C:\\Users\\admin\\Desktop\\Excel.xlsx";
		
		FileInputStream fs = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		System.out.println(rows);
		
		for (int i = 1; i <= rows; i++)
		{
			XSSFRow row=	 sheet.getRow(i);
			emailid=	row.getCell(0).getStringCellValue();
			password=	row.getCell(1).getStringCellValue();

			Browser_Launch();
			Enter_EmailId(emailid);
			Enter_password(password);
			Login();
			Thread.sleep(5000);
			 String actual="The password that you've entered is incorrect. ";
       System.out.println(actual);
			String expected = "The password that you've entered is";
			int cellCount = sheet.getRow(i).getLastCellNum();
			XSSFCell cell = row.createCell(cellCount);
		
			if(actual.equals(expected))
			{
				System.out.println("Test case is passed");
				cell.setCellValue("pass");
			}
			else
			{
				System.out.println("Test case is fail");
				cell.setCellValue("fail");
			}
	     }
		fs.close();
           
		FileOutputStream fout = new FileOutputStream(path);
        workbook.write(fout);
        fout.close();
	
}
	}
