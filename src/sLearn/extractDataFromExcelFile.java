package sLearn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Driver;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class extractDataFromExcelFile {

	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\seleniumLearn\\Excelsheet\\Book1.xlsx");
        Sheet excel = WorkbookFactory.create(file).getSheet("Sheet2");
        
        
        for(int row=0;row<=excel.getLastRowNum();row++)
        {
        	for(int col=0;col<=excel.getRow(row).getLastCellNum();col++)
        	{
        		String value=excel.getRow(row).getCell(col).getStringCellValue();
        		System.out.print(value+"\t");
        	}
        	System.out.println();
        }
    //    System.out.println(excel.getLastRowNum());
      //  System.out.println(excel.getRow(0).getLastCellNum());
        
	}

}
