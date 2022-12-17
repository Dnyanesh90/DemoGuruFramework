package TestLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.Homepage;

public class HomePageTest extends BaseClass{
	private Homepage homepage;
	@BeforeTest
	public void setup() {
		BaseClass.initilization();
	}
	@Test
	public void validateHomepageFunctionality() {
		homepage =new Homepage();
		String passcounts =homepage.selectpassCount("2");
		System.out.println(passcounts);
		String ports =homepage.selectfromPort("London");
		System.out.println(ports);
		String months =homepage.selectffromMonth("January");
		System.out.println(months);
		String port1 =homepage.selecttoPort("Paris");
		System.out.println(port1);
		String month1 =homepage.selecttoMonth("August");
		System.out.println(month1);
		String airline =homepage.selectairline("Unified Airlines");
		System.out.println(airline);
	}
	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.close();
		
		}
	}


