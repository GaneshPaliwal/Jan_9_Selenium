package org.exelfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Ex1 {
	
	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis=new FileInputStream("./Exelfiles/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int totalSheets=wb.getNumberOfSheets();
		System.out.println("totalsheets="+totalSheets);
		int index=wb.getSheetIndex("All string");
		System.out.println("index="+index);
		String Sheetname=wb.getSheetName(1);
		System.out.println("Sheetname="+Sheetname);
		
		for(int i=0; i<totalSheets; i++) {
			System.out.println(wb.getSheetName(i)); //forknowingthe all sheetname
		}
		wb.getSheet("All string");
	}catch(FileNotFoundException e) { // used try catch block for all exception
		e.printStackTrace();
	}catch(EncryptedDocumentException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}

	}
}

