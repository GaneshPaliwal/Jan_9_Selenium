package org.exelfiles;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;


import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;
import com.microsoft.schemas.office.visio.x2012.main.CellType;


public class printallvalues2 {

	private static final CellType STRING = null;
	private static final CellType NUMERIC = null;
	private static final CellType FORMULA = null;
	private static final CellType BOOLEAN = null;
	private static final CellType BLANK = null;

	public static void main(String[] args) { 
		FileInputStream fis=new FileInputStream
				("./Exelfiles/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s1=wb.getSheet("Alldatatypes");
		Row r1=s1.getRow(0);
		for(int i=0; i<s1.getLastRowNum(); i++) {
			for(int j=0; j<s1.getRow(i).getLastCellNum(); j++) {

				System.out.println(s1.getRow(i).getCell(j).getStringCellValue());
				System.out.println(s1.getRow(i).getCell(j).getCellType());
				CellType ct=s1.getRow(i).getCell(j).getCellType();
				switch (ct) {
				case STRING: System.out.println(s1.getRow(i).getCell(j).getStringCellValue());
					break;
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(s1.getRow(i).getCell(j))) {
						SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
						String dob=sdf.format(s1.getRow(i).getCell(j).getDateCellValue());
						System.out.println((s1.getRow(i).getCell(j).getDateCellValue()));
					}else {
						System.out.println((long)(s1.getRow(i).getCell(j).getNumericCellValue));
					}
					
					break;
				case FORMULA: System.out.println(s1.getRow(i).getCell(j).getCellFormula());
					break;
				case BOOLEAN: System.out.println(s1.getRow(i).getCell(j).getBooleanCellValue());
					break;
				case BLANK: System.out.println("cell is blank");
				    break;
				 default: System.out.println("invalid cell type");
				}
				
				
					
					
				
			}
			System.out.println();
		}

	}}



