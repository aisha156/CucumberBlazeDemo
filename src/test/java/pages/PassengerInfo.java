package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PassengerInfo {
	WebDriver driver;
	
	public PassengerInfo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"inputName\"]")
	WebElement inputNametxt;
	
	@FindBy(xpath="//*[@id=\"address\"]")
	WebElement addresstxt;
	
	@FindBy(xpath = "//*[@id=\"city\"]")
	WebElement citytxt;
	
	@FindBy(xpath ="//*[@id=\"state\"]")
	WebElement statetxt;
	
	@FindBy (xpath= "//*[@id=\"zipCode\"]")
	WebElement zipCodetxt;
	
	@FindBy(xpath="//*[@id=\"cardType\"]")
	WebElement cardTypedrp;
	
	@FindBy(xpath="//*[@id=\"creditCardNumber\"]")
	WebElement creditCardNumbertxt;
	
	@FindBy(xpath="//*[@id=\"creditCardMonth\"]")
	WebElement creditCardMonthtxt;
	
	@FindBy(xpath="//*[@id=\"creditCardYear\"]")
	WebElement creditCardYeartxt;
	
	@FindBy(xpath="//*[@id=\"nameOnCard\"]")
	WebElement nameOnCardtxt;
	

public void passenger_information(String value1, String value2,String value3,String value4,String value5)
{
	inputNametxt.sendKeys("Aisha Rehman");
	addresstxt.sendKeys("500 ridgeview Dr");
	citytxt.sendKeys("Bridgeport");
	statetxt.sendKeys("West Virgina");
    zipCodetxt.sendKeys("26230");
}
    
    public void cardType() {
     Select drp = new Select(cardTypedrp);
	drp.selectByVisibleText("Visa");
    }	
    
    public void cardinfo(String value6, String value7,String value8,String value9)
    {
	creditCardNumbertxt.sendKeys("12345678910");
	creditCardMonthtxt.sendKeys("12");
	creditCardYeartxt.sendKeys("2020");
	nameOnCardtxt.sendKeys("Aisha");
    }
	
}
