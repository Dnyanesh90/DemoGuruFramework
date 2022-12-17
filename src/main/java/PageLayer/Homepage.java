package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BaseLayer.BaseClass;
import UtilsLayer.HandleDropDown;

public class Homepage extends BaseClass {
	@FindBy(xpath="//a[text()='Flights']")
	private WebElement Flights;
	
	public String selectpassCount(String passCounts) {
		WebElement passCount =driver.findElement(By.name("passCount"));
		
		HandleDropDown.selectValueUsingVisibleText(passCount, passCounts);
		return HandleDropDown.checkSelectedValue(passCount);
	}
	public String selectfromPort(String fromPorts) {
		WebElement fromPort =driver.findElement(By.name("fromPort"));
		
		HandleDropDown.selectValueUsingVisibleText(fromPort, fromPorts);
		return HandleDropDown.checkSelectedValue(fromPort);
	}
	public String selectffromMonth(String fromMonths) {
		WebElement fromMonth =driver.findElement(By.name("fromMonth"));
		
		HandleDropDown.selectValueUsingVisibleText(fromMonth, fromMonths);
		return HandleDropDown.checkSelectedValue(fromMonth);
	}
	public String selecttoPort(String toPorts) {
		WebElement toPort =driver.findElement(By.name("toPort"));
		
		HandleDropDown.selectValueUsingVisibleText(toPort, toPorts);
		return HandleDropDown.checkSelectedValue(toPort);
	}
	public String selecttoMonth(String toMonths) {
		WebElement toMonth =driver.findElement(By.name("toMonth"));
		
		HandleDropDown.selectValueUsingVisibleText(toMonth, toMonths);
		return HandleDropDown.checkSelectedValue(toMonth);
	}
	public String selectairline(String airlines) {
		WebElement airline =driver.findElement(By.name("airline"));
		
		HandleDropDown.selectValueUsingVisibleText(airline, airlines);
		return HandleDropDown.checkSelectedValue(airline);
	
	
	
	}
}
