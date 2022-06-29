package excelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class qaclassExcelReadProgram {
	public static Object[][] getTableArray(String filePath, String SheetName) throws Exception {
		Object[][] tabArray = null;

		try {
			FileInputStream excelFile = new FileInputStream(filePath);
			Workbook excelWBook = new XSSFWorkbook(excelFile);
			Sheet excelWSheet = (Sheet) excelWBook.getSheet(SheetName);

			int totalRows = ((org.apache.poi.ss.usermodel.Sheet) excelWSheet).getLastRowNum() + 1;
			int totalCols = ((org.apache.poi.ss.usermodel.Sheet) excelWSheet).getRow(0).getLastCellNum();

			tabArray = new Object[totalRows][totalCols];

			for (int i = 0; i < totalRows; i++) {
				
				Row row = ((org.apache.poi.ss.usermodel.Sheet) excelWSheet).getRow(i);
				
				for (int j = 0; j < totalCols; j++) {
					
					Cell cell = (Cell) row.getCell(j);
					
					if(CellType.NUMERIC == ((org.apache.poi.ss.usermodel.Cell) cell).getCellType()) {
						tabArray[i][j] = ((org.apache.poi.ss.usermodel.Cell) cell).getNumericCellValue();
					} else if(CellType.STRING == ((org.apache.poi.ss.usermodel.Cell) cell).getCellType()) {
						tabArray[i][j] = ((org.apache.poi.ss.usermodel.Cell) cell).getStringCellValue();
					} else if(CellType.BOOLEAN == ((org.apache.poi.ss.usermodel.Cell) cell).getCellType()) {
						tabArray[i][j] = ((org.apache.poi.ss.usermodel.Cell) cell).getBooleanCellValue();
					} else {
						tabArray[i][j] = "";
					}
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}

		return tabArray;
	}
}

}
