package step_definations;




import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ChooseFlights;
import pages.Home;
import pages.PassengerInfo;

public class BookingFlights {

	 String url = "http://blazedemo.com";
	 public Home hm;
	public ChooseFlights cf;
	public PassengerInfo pi;
	 
	 public WebDriver driver;
	  


	   public BookingFlights()
	    {
	        driver = Hooks.driver;
	       
	    }

	   @Given("^Open Application$") 
	   public void openApplication() throws InterruptedException
	   {
		   driver.get(url);
		   Thread.sleep(3000);
	   
	   }
	   @And("^Choose Departure and Destination City$")
	   public void ChooseCity() {
		   cf=new ChooseFlights(driver);
		   cf.ChooseFlight();
		   
	   }
	   @When ("^Click Find Flight$")
	   public void clickfindflight()
	   {
		   hm=new Home(driver);
		   hm.FindFlights();
	   }
	   @Then ("^Flights from Boston to London$")
	   public void flights()
	   {
		   cf=new ChooseFlights(driver);
		   cf.choosethisflight();
	   }	   
@And("^Enter \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	 public void entervalues(String value1,String value2,String value3,String value4, String value5 ) throws InterruptedException {
    pi=new PassengerInfo(driver);
    pi.passenger_information(value1, value2, value3, value4, value5);		
}

@And("^Select card$")
public void select() {
	pi=new PassengerInfo(driver);
	pi.cardType();
	
}
@And("^Enter \"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\"$")
public void entervalues(String value6,String value7,String value8,String value9) {
	pi=new PassengerInfo(driver);
	pi.cardinfo(value6, value7, value8, value9);
}

@And("^Purchase Flight$")
public void purchase() {
	  hm=new Home(driver);
	  hm.PurchaseFlight();
	
}

@And("^Close the Browser$")
public void close_Application() {
	driver.close();
}
}


