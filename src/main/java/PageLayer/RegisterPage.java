package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.HandleDropDown;
import UtilsLayer.UtilsClass;

public class RegisterPage extends BaseClass {
	@FindBy(name ="firstName")
	private WebElement firstName;
	
	@FindBy(name ="lastName")
	private WebElement lastName;
	
	@FindBy(name ="phone")
	private WebElement phone;
	
	@FindBy(name ="userName")
	private WebElement userName;
	
	@FindBy(name ="address1")
	private WebElement address1;
	
	@FindBy(name ="city")
	private WebElement city;
	
	@FindBy(name ="state")
	private WebElement state;
	
	@FindBy(name ="postalCode")
	private WebElement postalCode;
	
	@FindBy(name ="email")
	private WebElement email;
	
	@FindBy(name ="password")
	private WebElement password;
	
	@FindBy(name ="confirmPassword")
	private WebElement confirmPassword;
	

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath ="//a[text()=' sign-in ']")
	private WebElement click;
	
	@FindBy(name ="userName")
	private WebElement userName1;
	
	@FindBy(name ="password")
	private WebElement password1;
	
	@FindBy(name ="submit")
	private WebElement submit1;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	public void typefirstName(String fname) {
		UtilsClass.entervalue(firstName, fname);
	}
	public void typelastName(String lname) {
		UtilsClass.entervalue(lastName, lname);
	}
	public void typephone(String mobNo) {
		UtilsClass.entervalue(phone, mobNo);
	}
	public void typeuserName(String uname) {
		UtilsClass.entervalue(userName, uname);
	}
	public void typeaddress1(String add) {
		UtilsClass.entervalue(address1, add);
	}
	public void typecity(String cityname) {
		UtilsClass.entervalue(city, cityname);
	}
	public void typestate(String sname) {
		UtilsClass.entervalue(state, sname);
	}
	public void typepostalCode(String pocode) {
		UtilsClass.entervalue(postalCode, pocode);
	}
	public String selectCountry(String countrys) {
		WebElement country =driver.findElement(By.name("country"));
		HandleDropDown.selectValueUsingVisibleText(country, countrys);
		return HandleDropDown.checkSelectedValue(country);
	}
	public void typeemail(String ename) {
		UtilsClass.entervalue(email, ename);
	}
	public void typepassword(String pass) {
		UtilsClass.entervalue(password, pass);
	}
	public void typeconfirmPassword(String cpass) {
		UtilsClass.entervalue(confirmPassword, cpass);
	}
	public void clickOnsubmitButton() {
		UtilsClass.clickonElement(submit);
	}
	public void clickonsignButton() {
		UtilsClass.clickonElement(click);
	}
	public void typeuserName1(String uname1) {
		UtilsClass.entervalue(userName, uname1);
	}
	public void typepassword1(String pass1) {
		UtilsClass.entervalue(password, pass1);
	}
	public void clickOnsubmit() {
		UtilsClass.clickonElement(submit);
		
	}
}

