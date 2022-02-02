package excel_;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataFetching1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("F:\\z_Sushant Class Data\\Class\\Automation Testing\\Selenium\\Kite Login Page-Inspect.xlsx");
		String value= WorkbookFactory.create(file).getSheet("fbData").getRow(0).getCell(1).getStringCellValue();
		System.out.println(value);
		String value2= WorkbookFactory.create(file).getSheet("fbData").getRow(1).getCell(1).getStringCellValue();
		System.out.println(value2);
	}
}