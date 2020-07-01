package com.hrishi.bb.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadExcelTestData {
	
	final static String filepath = "D:\\New Automation\\Projects\\Automation Framework"
			+ "\\src\\main\\java\\com\\hrishi\\bb\\testdata\\Test_Data.xls";
	public static FileInputStream input;
	static Workbook Excelbook;
	static Sheet testdatasheet;
	public static Object[][] readData(String sheetname)
	{
		try {
			input = new FileInputStream(new File(filepath));
		} catch (FileNotFoundException e) {
			System.out.println("Test Data file not found" +e.getMessage());
		}
		
		try {
			Excelbook = new HSSFWorkbook(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Test Data file not readbale" +e.getMessage());
		}
		
		testdatasheet = Excelbook.getSheet(sheetname);
		int row_count = testdatasheet.getLastRowNum();
		int col_count = testdatasheet.getRow(0).getLastCellNum();
		Object[][] testdata= new Object[row_count][col_count];
		for(int i=1; i<row_count+1;i++)
		{
			for(int j=0; j<col_count;j++)
			{
				CellType c_type = testdatasheet.getRow(i).getCell(j).getCellType();
				if(c_type== CellType.STRING)
				testdata[i-1][j] = testdatasheet.getRow(i).getCell(j).getStringCellValue();
				if(c_type== CellType.NUMERIC)
					testdata[i-1][j] = testdatasheet.getRow(i).getCell(j).getNumericCellValue();
				
			}
		}
	return testdata;
		
	}
	

}
