package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[3]/form/div/input")
	WebElement FindFlightbtn;
	@FindBy(xpath="/html/body/div[2]/form/div[11]/div/input")
	WebElement PurchaseFlightbtn;
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void FindFlights()
	{
		FindFlightbtn.click();
		
	}
	
	public void PurchaseFlight()
	{
		PurchaseFlightbtn.click();
		
}
}