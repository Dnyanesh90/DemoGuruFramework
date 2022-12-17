package TestLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass {
	private RegisterPage registerpage;
	
	@BeforeTest
	public void setup() {
		BaseClass.initilization();
	}
	@Test
	public void validateRegisterFunctionality() {
		registerpage =new RegisterPage();
		registerpage.typefirstName("DNYANESHWAR");
		registerpage.typelastName("KADAM");
		registerpage.typephone("7507847874");
		registerpage.typeemail("kadamdnyana@gmail.com");
		registerpage.typeaddress1("LATUR");
		registerpage.typecity("PUNE");
		registerpage.typestate("MAHARASHTRA");
		registerpage.typepostalCode("413235");
		String countrys =registerpage.selectCountry("INDIA");
		System.out.println(countrys);
		registerpage.typeuserName("Dnyanesh90");
		registerpage.typepassword("Dk@7798913075");
		registerpage.typeconfirmPassword("Dk@7798913075");
		registerpage.clickOnsubmitButton();
		registerpage.clickonsignButton();
		registerpage.typeuserName1("kadamdnyana@gmail.com");
		registerpage.typepassword1("Dk@7798913075");
		registerpage.clickOnsubmit();
	}
	@AfterMethod
	@AfterTest
	public void tearDown() {
		//driver.close();
			
	}

}
