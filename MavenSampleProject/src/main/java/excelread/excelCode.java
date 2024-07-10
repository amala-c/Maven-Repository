package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelCode {
	
	static FileInputStream f; // to read file we declare variable of fileinputstream (class)
	static XSSFWorkbook w; // class represent workbook
	static XSSFSheet sh;
	
	public static String readStringData(int row, int col)throws IOException  //to read string data , which row, which column passed
	{
		f=new FileInputStream("C:\\Users\\Amala Chellappan\\Desktop\\Sample.xlsx"); // constructor where path is specified
		w=new  XSSFWorkbook(f); // excel=workbook.. to get workbook
		sh= w.getSheet("Sheet1"); // get sheet, w il ulla sheet
		XSSFRow r=sh.getRow(row); // to get row from sheeet
		XSSFCell c=r.getCell(col); // to get cell from particular row
		return c.getStringCellValue(); // to get string value
	}

	public static String readIntegerData(int row, int col)throws IOException
	{
		f=new FileInputStream("C:\\Users\\Amala Chellappan\\Desktop\\Sample.xlsx");
		w=new  XSSFWorkbook(f);
		sh= w.getSheet("Sheet1");
		XSSFRow r=sh.getRow(row);
		XSSFCell c=r.getCell(col);
		int v=(int) c.getNumericCellValue(); // type casting
		return String.valueOf(v);
	}
	
}
