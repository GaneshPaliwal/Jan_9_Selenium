package org.exelfiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2 {

	public static void main(String[] args) throws IOException { 
		FileInputStream fis=new FileInputStream ("./Exelfiles/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		//sheet
		Sheet s1=wb.getSheet("All string");
        int lastrownum =s1.getLastRowNum();
		System.out.println("lastrownum="+lastrownum);

		int physicalNumberOfRow=s1.getPhysicalNumberOfRows();
		System.out.println("physical number of rows="+physicalNumberOfRow);
        //Rows 
		Row r1=s1.getRow(0);
		int lastcellNum=r1.getLastCellNum();
		System.out.println("lastcellNum="+lastcellNum);

		int physicalcellNumberOfCells=r1.getPhysicalNumberOfCells();
		System.out.println("physical number of cells="+physicalcellNumberOfCells);
		
		//cell
	//	Cell c1=r1.getCell(0);



	}
}


