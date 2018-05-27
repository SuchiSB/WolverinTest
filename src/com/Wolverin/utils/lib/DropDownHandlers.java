package com.Wolverin.utils.lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlers {
	
     //Select common funs
	public static void selectDDLByIndex(WebElement ddl, int index){
		Select sel=new Select(ddl);
		sel.selectByIndex(index);	
	}
	
	public static void selectDDLByValue(WebElement ddl, String value){
		Select sel=new Select(ddl);
		sel.selectByValue(value);
	}
	public static void selectDDLByText(WebElement ddl, String text){
		Select sel=new Select(ddl);
		sel.selectByVisibleText(text);
	}
	
	//Deselect common funs
	public static void deSelectDDLByIndex(WebElement ddl, int index){
		Select sel=new Select(ddl);
		sel.deselectByIndex(index);	
	}
	
	public static void deSelectDDLByValue(WebElement ddl, String value){
		Select sel=new Select(ddl);
		sel.deselectByValue(value);
	}
	public static void deSelectDDLByText(WebElement ddl, String text){
		Select sel=new Select(ddl);
		sel.deselectByVisibleText(text);
	}
	
	public static void deSelectAllOptions(WebElement ddl){
		Select sel=new Select(ddl);
		sel.deselectAll();
	}
}

