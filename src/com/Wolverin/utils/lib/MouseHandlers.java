package com.Wolverin.utils.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHandlers {
	//MouseHover commmon methods
	public static void mouseHoverOnElement(WebDriver driver, WebElement element){
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public static void performDragAndDrop(WebDriver driver, WebElement source, WebElement target){
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}
}
