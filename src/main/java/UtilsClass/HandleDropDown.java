package UtilsClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {

	public static void selectValueUsingVisibleText(WebElement wb, String value) {
		new Select(wb).selectByVisibleText(value);
	}

	public static String checkSelectedValue(WebElement wb) {
		return new Select(wb).getFirstSelectedOption().getText();

	}
	
}
	
	
	
	
	


