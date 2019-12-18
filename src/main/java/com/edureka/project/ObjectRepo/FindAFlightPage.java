package com.edureka.project.ObjectRepo;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edureka.project.genericLib.BaseClass;
import com.edureka.project.genericLib.WebDriverCommonLib;

public class FindAFlightPage {
    Logger log = Logger.getLogger(FindAFlightPage.class);
    WebDriverCommonLib comm = new WebDriverCommonLib();
   


    @FindBy(xpath = "//input[@value='roundtrip']")
    @CacheLookup
    private WebElement roundTripRdio;

    @FindBy(name = "passCount")
    @CacheLookup
    private WebElement passCountDrpDwn;

    @FindBy(name = "fromPort")
    @CacheLookup
    private WebElement fromPortDrpDwn;

    @FindBy(name = "toPort")
    @CacheLookup
    private WebElement toPortDrpDwn;

    @FindBy(name = "fromMonth")
    @CacheLookup
    private WebElement fromMonthDwn;

    @FindBy(name = "toMonth")
    @CacheLookup
    private WebElement toMonthDrpDwn;

    @FindBy(name = "toDay")
    @CacheLookup
    private WebElement toDayDrpDwn;

    @FindBy(name = "fromDay")
    @CacheLookup
    private WebElement fromDayDrpDwn;

    @FindBy(xpath = "//input[@value='Business']")
    @CacheLookup
    private WebElement BusinessClassRadio;

    @FindBy(name = "airline")
    @CacheLookup
    private WebElement AirlineDrpDwn;

    @FindBy(name = "findFlights")
    @CacheLookup
    private WebElement FindFlightsBtn;

    public WebElement getRoundTripRdio() {
        return roundTripRdio;
    }

    public WebElement getPassCountDrpDwn() {
        return passCountDrpDwn;
    }

    public WebElement getFromPortDrpDwn() {
        return fromPortDrpDwn;
    }

    public WebElement getToPortDrpDwn() {
        return toPortDrpDwn;
    }

    public WebElement getFromMonthDwn() {
        return fromMonthDwn;
    }

    public WebElement getToMonthDrpDwn() {
        return toMonthDrpDwn;
    }

    public WebElement getToDayDrpDwn() {
        return toDayDrpDwn;
    }

    public WebElement getFromDayDrpDwn() {
        return fromDayDrpDwn;
    }

    public WebElement getBusinessClassRadio() {
        return BusinessClassRadio;
    }

    public WebElement getAirlineDrpDwn() {
        return AirlineDrpDwn;
    }

    public WebElement getFindFlightsBtn() {
        return FindFlightsBtn;
    }

    // Business Functions
    /**
     * This method will add all the required details fro "Flight Details" section
     */

    public void addFlightDetails() {
        FindAFlightPage flight = PageFactory.initElements(BaseClass.driver, FindAFlightPage.class);
        log.info("Selecting the Flight Details");
        // Select No. of Passengers
        flight.getPassCountDrpDwn().click();
        comm.select(flight.getPassCountDrpDwn(), "1");
        // Select Departing From
        flight.getFromPortDrpDwn().click();
        comm.select(flight.getFromPortDrpDwn(), "London");
        // Select Month
        flight.getFromMonthDwn().click();
        comm.select(flight.getFromMonthDwn(), "August");
        // Select Day
        flight.getFromDayDrpDwn().click();
        comm.select(flight.getFromDayDrpDwn(), "5");
        // Select Return Place
        flight.getToPortDrpDwn().click();
        comm.select(flight.getToPortDrpDwn(), "New York");
        // Select Return date
        flight.getToMonthDrpDwn().click();
        comm.select(flight.getToMonthDrpDwn(), "November");
        flight.getToDayDrpDwn().click();
        comm.select(flight.getToDayDrpDwn(), "8");

    }

    /**
     * This method will add all the required details fro "Preferences" section
     */
    public void addPreferences() {
        FindAFlightPage flight = PageFactory.initElements(BaseClass.driver, FindAFlightPage.class);
        log.info("Selecting the Preferences in" + FindAFlightPage.class);
        // Select Service Class
        flight.getBusinessClassRadio().click();

        // Select Airline
        comm.select(flight.getAirlineDrpDwn(), 2);
    }

/**
 * 
 */
public void clickFindFlightContinue(){
    FindAFlightPage find = PageFactory.initElements(BaseClass.driver, FindAFlightPage.class);
    log.info("Clicking on Continue in Find a Flight page");
    
    try {
        find.getFindFlightsBtn().click();
    } catch (Exception e) {
        // TODO Auto-generated catch block
        log.error("Error on finding the flight");
    }
}
}