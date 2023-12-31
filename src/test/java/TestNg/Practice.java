package TestNg;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("data");
		Map<String, String> hData = new HashMap<String, String>();
		hData.put("1", "joy");
		hData.put("2", "swathi");

		int totalRows = 0;
		for (Entry<String, String> entry : hData.entrySet()) {
			XSSFRow row = sheet.createRow(totalRows++);
			int totalColumns=0;	
			row.createCell(totalColumns++).setCellValue((String) entry.getKey());
			row.createCell(totalColumns++).setCellValue((String) entry.getValue());
			}
		FileOutputStream fos=new FileOutputStream("D:\\seleniumjenkins\\ExcelData\\student.xlsx");
		workbook.write(fos);
		workbook.close();
		fos.close();
		

	}

}
