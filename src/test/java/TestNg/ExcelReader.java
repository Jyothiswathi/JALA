package TestNg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {
		
		
	String filepath=".\\ExcelData\\a.xlsx";
	
	FileInputStream fileInput =new FileInputStream(filepath);
	XSSFWorkbook workbook=new XSSFWorkbook(fileInput);
	XSSFSheet sheet = workbook.getSheet("data");
int totalRows = sheet.getLastRowNum();
int totalColumns = sheet.getRow(0).getLastCellNum();
for(int i=0;i<=totalRows;i++)
{
XSSFRow eachRow = sheet.getRow(i);

for(int j=0;j<totalColumns;j++)
{
	XSSFCell cell = eachRow.getCell(j);
	switch(cell.getCellType())
	{
	case STRING:System.out.print(cell.getStringCellValue()); break;
	case NUMERIC:System.out.print(cell.getNumericCellValue());break;
	case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
	}
	System.out.print("|");
	
}
System.out.println();
}


	
	
	}

}
