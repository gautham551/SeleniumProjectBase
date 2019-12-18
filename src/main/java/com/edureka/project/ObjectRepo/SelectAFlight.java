package com.edureka.project.ObjectRepo;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edureka.project.genericLib.BaseClass;

public class SelectAFlight {
    Logger log = Logger.getLogger(SelectAFlight.class);
    
    
    @FindBy(name="reserveFlights")
    @CacheLookup
    private WebElement reserveFlightsBtn;

    public WebElement getReserveFlightsBtn() {
        return reserveFlightsBtn;
    }

//Click on Continue in Select a Flight page
/**
 * 
 */
public void clickSelectFlightContinue(){
    SelectAFlight select = PageFactory.initElements(BaseClass.driver, SelectAFlight.class);
 // Click on Continue in Select a Flight page
    log.info("Selected the flight");
    // Select the flight
    try {
        select.getReserveFlightsBtn().click();
    } catch (Exception e) {
        // TODO Auto-generated catch block
        log.error("Error on selecting the flight");;
    }
}
}