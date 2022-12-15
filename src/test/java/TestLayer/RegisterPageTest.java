package TestLayer;

import java.io.IOException;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import UtilsClass.RegisterUtilsClass;

public class RegisterPageTest extends BaseClass {
	public static void main(String[] args) throws IOException {

		BaseClass.inilization();
		
		RegisterPage registerpage =new RegisterPage();
		
		registerpage.enterFirstName("Anjali");
		registerpage.enterLastName("Patil");
		registerpage.enterUsername("anjali@amdocs.com");
		registerpage.enterPassword("Anjali@123");
		String date =registerpage.selectDate("10");
		System.out.println(date);
		String month=registerpage.selectMonth("Mar");
		System.out.println(month);
		String year =registerpage.selectYear("2010");
		System.out.println(year);
		
		RegisterUtilsClass.takeScreenshot("fb1");
		
		driver.close();
	}


}
