package excelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
	
		String excelFilePath="C:\\Users\\pathi\\OneDrive\\Desktop\\counties.xlsx";
		FileInputStream inputstream=new FileInputStream(excelFilePath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
		XSSFSheet sheet=workbook.getSheet("sheet1 ");
		//XSSFSheet sheet=workbook.getSheetAt(0);
		
		//using for loop
		/*int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		
		for(int r=0;r<=rows;r++) {
			XSSFRow row=sheet.getRow(r);
			for(int s=0;s<cols;s++) {
				XSSFCell cell=row.getCell(s);
				
				switch(cell.getCellType()) {
				case STRING: System.out.print(cell.getStringCellValue()); break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}*/
		
		//Using iterator method
		
		 Iterator rowIterator = sheet.iterator();
	        while (rowIterator.hasNext())
	        {
	            Row row = (Row) rowIterator.next();
	            //For each row, iterate through all the columns
	            Iterator cellIterator = row.cellIterator();

	            while (cellIterator.hasNext()) 
	            {
	                Cell cell = (Cell) cellIterator.next();
	                //Check the cell type and format accordingly
	                switch (cell.getCellType()) 
	                {
	                    case NUMERIC:
	                        System.out.print(cell.getNumericCellValue() + "\t");
	                        break;
	                    case STRING:
	                        System.out.print(cell.getStringCellValue() + "\t");
	                        break;
	                }
	                System.out.print("|");
	            }
	            System.out.println("");
		}
		
	}

}
