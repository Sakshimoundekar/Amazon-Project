package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
public static String[] getData() throws IOException {
		
		// Set the file location
				File loc = new File("C:\\Users\\Lenovo\\Desktop\\worl space\\mini\\excel\\Amazon.xlsx");
				//Read the input
				
				//workbook			
				
				FileInputStream f = new FileInputStream(loc);
				
				XSSFWorkbook w =new XSSFWorkbook(f);
			    Sheet s= w.getSheet("Selenium");
			    
			    String sh1 =s.getRow(1).getCell(0).getStringCellValue();
			    String sh2 =s.getRow(2).getCell(0).getStringCellValue();
			    String sh3 =s.getRow(3).getCell(0).getStringCellValue();
				
			    String[] list=new String[] {sh1,sh2,sh3};
			    String[] input=new String[3];
			    
			    input[0]=list[0];
			    input[1]=list[1];
			    input[2]=list[2];
			    
			    return input;
}
}
