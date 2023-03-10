package Testing.testcase;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test1readfromexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Untitled 1.xlsx");
 XSSFWorkbook workbook=new XSSFWorkbook(file);
 XSSFSheet sheet =workbook.getSheet("Sheet1");//workbook.getSheetAT(0);
 int totalrow=sheet.getLastRowNum();
 int totalcolumn=sheet.getRow(1).getLastCellNum();
 System.out.println(totalrow);
 System.out.println(totalcolumn);
 
 for(int r=0;r<=totalrow;r++) {
	 XSSFRow currentRow=sheet.getRow(r);
	 for(int c=0;c<totalcolumn;c++) {
		 String value =currentRow.getCell(c).toString();
		 System.out.print(value+"   ");
	 }
	 System.out.println();
 }
 
 workbook.close();
 file.close();
	}

}
