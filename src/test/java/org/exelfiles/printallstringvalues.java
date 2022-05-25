package org.exelfiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.ss.usermodel.Cell;



public class printallstringvalues {

	public static void main(String[] args)throws EncryptedDocumentException, IOException { 
		//step1
		FileInputStream fis=new FileInputStream
				("./Exelfiles/TestData.xlsx");
		//step2
		Workbook wb=WorkbookFactory.create(fis);
		//step3 sheet
		Sheet s1=wb.getSheet("All string types");
		
        //step 4 Rows 
  //  	Row r1=s1.getRow(1);
		//step5 cell
	//   Cell c1= r1.getCell(3);
	//	System.out.println(c1.getStringCellValue());
	//	Row r=null;
	//	Cell c=null;
		for(int i=1; i<=s1.getLastRowNum(); i++) {
			for(int j=0; j<s1.getRow(i).getLastCellNum(); j++) {
				
				System.out.println(s1.getRow(i).getCell(j).getStringCellValue());
			}
		}
		
}}

// code for reffrence (office work)
//for(int i=0; i<s1.getLastRowNum; i++) {
//	r=s1.getRow(i);
//	for(int j=0; j<r.getLastCellNum(); j++) {
//		c=r.getCell(j);
//		System.out.println(c.getStringCellValue());
//	}
//}


