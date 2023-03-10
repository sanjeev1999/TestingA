package DataDriventest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xutil {

	public static FileInputStream f1;
	public static FileOutputStream f0;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
	
	public static int getRowCount(String xlfile,String xlSheet ) throws IOException {
	
	f1=new FileInputStream(xlfile);
	wb =new XSSFWorkbook(f1);
	ws=wb.getSheet(xlSheet);
	int rowcount =ws.getLastRowNum();
	wb.close();
	
   f1.close();
   return rowcount;
   }
	public static int getCellCount(String xlfile,String xlSheet,int  rownum ) throws IOException {
		
		f1=new FileInputStream(xlfile);
		wb =new XSSFWorkbook(f1);
		ws=wb.getSheet(xlSheet);
		row=ws.getRow(rownum);
		
		int cellcount =row.getLastCellNum();
		wb.close();
	    f1.close();
	   return cellcount;
	   }
	
public static String getCellData(String xlfile,String xlSheet,int  rownum, int colnum ) throws IOException {
		
		f1=new FileInputStream(xlfile);
		wb =new XSSFWorkbook(f1);
		ws=wb.getSheet(xlSheet);
		row=ws.getRow(rownum);
		
		cell=row.getCell(rownum);
		String data;
		try {
			DataFormatter formatter=new DataFormatter();
			data=formatter.formatCellValue(cell);
			return data;
			
		}
		catch(Exception e){
			data=" ";
		}
		wb.close();
		f1.close();
		return data;
	  }

public static void setCellData(String xlfile,String xlSheet,int rownum,int colnum,String data ) throws IOException {
	
	f1=new FileInputStream(xlfile);
	wb =new XSSFWorkbook(f1);
	ws=wb.getSheet(xlSheet);
	row=ws.getRow(rownum);
	cell=row.getCell(colnum);
	cell.setCellValue(data);
	f0=new FileOutputStream(xlfile);
	wb.write(f0);
	wb.close();
	f1.close();
	f0.close();
   }
public static void FillGreenColor(String xlfile,String xlSheet,int rownum,int colnum) throws IOException {
	
	f1=new FileInputStream(xlfile);
	wb =new XSSFWorkbook(f1);
	ws=wb.getSheet(xlSheet);
	row=ws.getRow(rownum);
	cell=row.getCell(colnum);
	style=wb.createCellStyle();
	style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	cell.setCellStyle(style);
	
	
	f0=new FileOutputStream(xlfile);
	wb.write(f0);
	wb.close();
	f1.close();
	f0.close();
   }
	
	
	
	
	
}
