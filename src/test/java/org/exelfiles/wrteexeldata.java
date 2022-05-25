package org.exelfiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import com.google.common.collect.Table.Cell;


public class wrteexeldata {

//	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Exelfiles/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s1=wb.getSheet("Writecelldata");
		Row r1=s1.getRow(1);
	//	Cell c1=r1.getCell(4);
	    Cell c1=r1.createCell(4);
		((org.apache.poi.ss.usermodel.Cell) c1).setCellValue("pass");
		FileOutputStream fos=new FileOutputStream ("./Exelfiles/TestData.xlsx");
		wb.write(fos);
		fos.close();
		
	}
}


