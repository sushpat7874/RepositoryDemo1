package excel_;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelClass {

	public static String getData(int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("F:\\z_Sushant Class Data\\Class\\Automation Testing\\Selenium\\Kite Login Page-Inspect.xlsx");
		String value = WorkbookFactory.create(file).getSheet("fbData").getRow(row).getCell(cell).getStringCellValue();
		
		return value;
	}
}