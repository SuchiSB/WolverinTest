package com.Wolverin.utils.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataHandlers {
	//writing to properties file
	public static void writeToProperties(String filePath, String Key, String Value, String Comment){
		try
		{
			//locate a file
			File f = new File (filePath);
			//open file in read mode
			FileInputStream fis=new FileInputStream(f);
			//convert the file to properties file
			Properties prop=new Properties();
			prop.load(fis);
			//set data for properties
			prop.setProperty(Key, Value);
			//open file in write mode
			FileOutputStream fos =new FileOutputStream(f);
			//Store actual data and put some comment
			prop.store(fos, Comment);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	//reading from properties file
	public static String getDataFromProperties(String filepath, String Key){
		String data=null;
		
		try
		{
			File f=new File(filepath);
			
			//step 2: open the file for read or write purpose
			FileInputStream fis=new FileInputStream(f);
			
			//step 3: convert file to properties type
			
			Properties prop=new Properties();
			prop.load(fis);
			data=prop.get(Key).toString();
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		return data;

	}
	//Writing to excel file
	public static void WritingToExcel(String filePath, String sheetName,int rowIndex, int cellIndex, String data){
		try
		{
			File f = new File(filePath);
			//Open file in  read mode
			FileInputStream fis=new FileInputStream(f);
			//Covert the file to workbook type
			Workbook wb=WorkbookFactory.create(fis);
			//get a sheet from the Workbook
			Sheet sh=wb.getSheet(sheetName);
			//get a row from the sheet
			Row r =sh.getRow(rowIndex);
			//get a cell from the row
			Cell c= r.createCell(cellIndex);
			//set cell value
		     c.setCellValue(data);
		     //open workbook in write mode
		     FileOutputStream fos= new FileOutputStream(f);
		     //write actual data & close
		     wb.write(fos);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		}
	//Reading from excel file
	public static String getDataFromExcel(String filePath,String sheetName, int rowIndex, int cellIndex){
		String data=null;
		{
			try
			{
				File f = new File(filePath);
				//Open file in  read mode
				FileInputStream fis=new FileInputStream(f);
				//Covert the file to workbook type
				Workbook wb=WorkbookFactory.create(fis);
				//get a sheet from the Workbook
				Sheet sh=wb.getSheet(sheetName);
				//get a row from the sheet
				Row r =sh.getRow(rowIndex);
				//get a cell from the row
				Cell c= r.getCell(cellIndex);
				//convert datdata to String type
			     data=c.toString();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return data;
		}
	

}
}
