package org.exelfiles;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class wrteexeldata2 {

	public static void main(String[] args) throws IOException  {
		FileInputStream fis=new FileInputStream("./Exelfiles/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s1=wb.getSheet("Writecelldata");
		// for sending data in cell
	//	for(int i=1; i<s1.getLastRowNum(); i++) {
	//		s1.getRow(i).createCell(4).setCellValue("pass");
	//	}
		// by using without for loop
		s1.getRow(1).createCell(4).setCellValue("pass");
		s1.getRow(2).createCell(4).setCellValue("fail");
		s1.getRow(3).createCell(4).setCellValue("pass");
		FileOutputStream fos=new FileOutputStream ("./Exelfiles/TestData.xlsx");
		wb.write(fos);
		fos.close();
		
	}
}


