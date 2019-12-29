package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChooseFlights {

	WebDriver driver;
	
	public ChooseFlights(WebDriver driver)
	{
	this.driver =driver;
	
	PageFactory.initElements(driver, this);
	}


@FindBy(xpath="/html/body/div[3]/form/select[1]")
WebElement fromPortdrp;

@FindBy(xpath="/html/body/div[3]/form/select[2]")
WebElement toPortdrp;

@FindBy(xpath="/html/body/div[2]/table/tbody/tr[5]/td[1]/input")
WebElement choosethisflightbtn;


public void ChooseFlight()
{
	Select drp = new Select(fromPortdrp); 
    drp.selectByVisibleText("Paris");
    
    Select drp1 = new Select(toPortdrp);
    drp1.selectByVisibleText("Rome");
}  
    public void choosethisflight() 
    {
    
    choosethisflightbtn.click();
    
}

}
